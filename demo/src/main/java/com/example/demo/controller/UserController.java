package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("users")
@Controller
public class UserController {
	@GetMapping
	public String open(Model model) {
		String message = "ユーザー一覧";
		model.addAttribute("value", message);
		return "index";
	}

}
