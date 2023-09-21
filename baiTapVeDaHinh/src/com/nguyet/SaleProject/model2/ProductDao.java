package com.nguyet.SaleProject.model2;

import com.company.model.Product;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private Connection connection;

    public ProductDao() {
    }

    public ProductDao(Connection connection) {
        this.connection = connection;
    }

    public void createProduct(Product product) throws SQLException {
        String sql = "INSERT INTO Product (name, quantity, price, category_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, (int) product.getQuantity());
            preparedStatement.setBigDecimal(3, product.getPrice());
            preparedStatement.setInt(4, product.getCategory_id());
            preparedStatement.executeUpdate();
        }
    }

    public Product getProductById(int productId) throws SQLException {
        String sql = "SELECT * FROM Product WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, productId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return mapToProduct(resultSet);
                }
            }
        }
        return null;
    }

    public List<Product> searchProductsByName(String name) throws SQLException {
        String sql = "SELECT * FROM Product WHERE name LIKE ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, "%" + name + "%");
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Product> products = new ArrayList<>();
                while (resultSet.next()) {
                    products.add(mapToProduct(resultSet));
                }
                return products;
            }
        }
    }

    public List<Product> searchProductsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) throws SQLException {
        String sql = "SELECT * FROM Product WHERE price BETWEEN ? AND ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBigDecimal(1, minPrice);
            preparedStatement.setBigDecimal(2, maxPrice);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                List<Product> products = new ArrayList<>();
                while (resultSet.next()) {
                    products.add(mapToProduct(resultSet));
                }
                return products;
            }
        }
    }

    private Product mapToProduct(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("id"));
        product.setName(resultSet.getString("name"));
        product.setQuantity(resultSet.getInt("quantity"));
        product.setPrice(resultSet.getBigDecimal("price"));
        product.setCategory_id(resultSet.getInt("category_id"));
        return product;
    }
}
