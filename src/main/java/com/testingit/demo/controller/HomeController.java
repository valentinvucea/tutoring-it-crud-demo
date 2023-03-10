package com.testingit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// Home page: GET /
	@RequestMapping("/")
    public String showHomePage(Model model) {
		model.addAttribute("title", "TutoringIt - CRUD Demo");
		model.addAttribute("message", "Hello World");
        return "home";
    }
	
}
