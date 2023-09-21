package com.company.model;

import java.util.List;

public interface CategoryDao {
    List<Category> getAllCategories();
    Category getCategoryById(int id);

}
