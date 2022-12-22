package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/admin")
	public String main(Model model) {
		model.addAttribute("name", "Lee");
		
		return "main";
	}

}
