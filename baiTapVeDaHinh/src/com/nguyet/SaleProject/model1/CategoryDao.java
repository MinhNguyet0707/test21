package com.nguyet.SaleProject.model1;

import java.util.List;

public interface CategoryDao {
    List<Category> getAllCategories();
    Category getCategoryById(int id);

}
