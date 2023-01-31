package com.testingit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.testingit.demo.model.Category;
import com.testingit.demo.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return (List<Category>)
				categoryRepository.findAll();
	}

	@Override
	public Category updateCategory(Category category, Long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		
	}

}
