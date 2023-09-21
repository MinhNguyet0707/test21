package com.nguyet.SaleProject.model2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDaoImpl implements BillDao {

    private Connection connection;

    public BillDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addBill(Bill bill) {
        String sql = "INSERT INTO Bill (quantity, price, product_id) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, bill.getQuantity());
            preparedStatement.setBigDecimal(2, bill.getPrice());
            preparedStatement.setInt(3, bill.getProductId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
