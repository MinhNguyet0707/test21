package com.nguyet.SaleProject.model1;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDao {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    List<Product> searchByName(String keyword);
    List<Product> searchByPriceRange(BigDecimal minPrice, BigDecimal maxPrice);
    List<Product> searchByCategory(int categoryId);

}
