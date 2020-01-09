package com.iprimed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/*
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	*/
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("curDate", new java.util.Date());
		return "home";
	}
}
