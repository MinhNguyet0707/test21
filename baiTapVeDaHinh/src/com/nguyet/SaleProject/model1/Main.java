package com.nguyet.SaleProject.model1;

import com.company.DatabaseConnect;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Connection connection= DatabaseConnect.getConnection();
        Scanner scanner = new Scanner(System.in);
        ProductDao productDao = new ProductDaoImpl(connection);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau nextInt()

            switch (choice) {
                case 1:

                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Nhập giá: ");
                    BigDecimal price = scanner.nextBigDecimal();
                    System.out.print("Nhập ID danh mục: ");
                    int categoryId = scanner.nextInt();
                    Product newProduct = new Product(name, quantity, price, categoryId);
                    productDao.addProduct(newProduct);
                    System.out.println("Sản phẩm đã được thêm.");
                    break;
                case 2:

                    System.out.print("Nhập ID sản phẩm cần sửa: ");
                    int productIdToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau nextInt()
                    System.out.print("Nhập tên sản phẩm mới: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Nhập số lượng mới: ");
                    int updatedQuantity = scanner.nextInt();
                    System.out.print("Nhập giá mới: ");
                    BigDecimal updatedPrice = scanner.nextBigDecimal();
                    System.out.print("Nhập ID danh mục mới: ");
                    int updatedCategoryId = scanner.nextInt();
                    Product updatedProduct = new Product(productIdToUpdate, updatedName, updatedQuantity, updatedPrice, updatedCategoryId);
                    productDao.updateProduct(updatedProduct);
                    System.out.println("Thông tin sản phẩm đã được cập nhật.");
                    break;
                case 3:

                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int productIdToDelete = scanner.nextInt();
                    productDao.deleteProduct(productIdToDelete);
                    System.out.println("Sản phẩm đã được xóa.");
                    break;
                case 4:

                    System.out.println("Menu tìm kiếm:");
                    System.out.println("1. Tìm theo tên sản phẩm");
                    System.out.println("2. Tìm theo khoảng giá");
                    System.out.println("3. Tìm theo danh mục");
                    System.out.print("Nhập lựa chọn: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống sau nextInt()

                    switch (searchChoice) {
                        case 1:
                            System.out.print("Nhập từ khóa tìm kiếm: ");
                            String searchKeyword = scanner.nextLine();
                            List<Product> productsByName = productDao.searchByName(searchKeyword);

                            break;
                        case 2:
                            System.out.print("Nhập giá tối thiểu: ");
                            BigDecimal minPrice = scanner.nextBigDecimal();
                            System.out.print("Nhập giá tối đa: ");
                            BigDecimal maxPrice = scanner.nextBigDecimal();
                            List<Product> productsByPriceRange = productDao.searchByPriceRange(minPrice, maxPrice);

                            break;
                        case 3:
                            System.out.print("Nhập ID danh mục: ");
                            int categoryIdToSearch = scanner.nextInt();
                            List<Product> productsByCategory = productDao.searchByCategory(categoryIdToSearch);

                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }
}
