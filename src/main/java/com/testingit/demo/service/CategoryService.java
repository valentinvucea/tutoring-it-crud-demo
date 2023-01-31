package com.testingit.demo.service;

import java.util.List;
import com.testingit.demo.model.Category;

public interface CategoryService {
	
    // Create operation
    Category saveCategory(Category category);
    
    // Read operation
	List<Category> getAllCategories();
	
	// Update operation
	Category updateCategory(Category category, Long categoryId);
	
	// Delete operation
	void deleteCategoryById(Long categoryId);
}
