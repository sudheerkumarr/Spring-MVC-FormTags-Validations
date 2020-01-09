package com.iprimed.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iprimed.bean.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/register")
	public String registration(Model model) {
		// Add customer object to model
		model.addAttribute("customer", new Customer());
		return "register";processForm
	}
	/*
	 * method without validation
	@RequestMapping("/process-form")
	public String processForm(@ModelAttribute("customer") Customer customer) {
		return "register-process";
	}
	*/
	// method with validation
	@RequestMapping("/process-form")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "register";
		} else {
			return "register-process";
		}
	}	
}
