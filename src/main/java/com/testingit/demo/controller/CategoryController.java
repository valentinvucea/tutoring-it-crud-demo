package com.testingit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	// Home page: GET /
	@RequestMapping("/categories")
    public String showHomePage(Model model) {
		model.addAttribute("message", "This is the categories page");
        return "views/categories/index";
    }
}
