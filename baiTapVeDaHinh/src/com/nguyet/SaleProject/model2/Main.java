package com.nguyet.SaleProject.model2;

import com.company.DatabaseConnect;
import com.company.model.Product;
import com.company.model.ProductDao;
import com.company.model.ProductDaoImpl;
import com.company.model2.Bill;
import com.company.model2.BillDao;
import com.company.model2.BillDaoImpl;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Connection connection =  DatabaseConnect.getConnection();


                ProductDao productDao = new ProductDaoImpl(connection);
        BillDao billDao = new BillDaoImpl(connection);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tạo đơn hàng");
            System.out.println("2. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sản phẩm cần mua: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập số lượng sản phẩm: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();


                    Product product = productDao.getProductById(productId);
                    if (product != null) {

                        if (product.getQuantity() >= quantity) {

                            BigDecimal price = product.getPrice().multiply(BigDecimal.valueOf(quantity));
                            Bill bill = new Bill(quantity, price, productId);

                            billDao.addBill(bill);

                            product.setQuantity(product.getQuantity() - quantity);
                            productDao.updateProduct(product);

                            System.out.println("Đã tạo đơn hàng thành công.");
                        } else {
                            System.out.println("Không đủ số lượng sản phẩm để mua.");
                        }
                    } else {
                        System.out.println("Sản phẩm không tồn tại.");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }


}
