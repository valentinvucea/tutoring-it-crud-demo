package com.testingit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testingit.demo.model.Category;
import com.testingit.demo.service.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	// Home page: GET /
	@RequestMapping("/categories")
    public String showHomePage(Model model) {
		List<Category> allCategories = categoryService.getAllCategories();
		model.addAttribute("categories", allCategories);
        return "views/categories/index";
    }
}
