package com.app.simplenotes.controller;

import com.app.simplenotes.entity.User;
import com.app.simplenotes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService services;

	@GetMapping("/")
	public String register(Model model){
		User user = new User();
		model.addAttribute("user", user);

		return "register";
	}

	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user){
		services.registerUser(user);
		return "redirect:/tasks";
	}
}
