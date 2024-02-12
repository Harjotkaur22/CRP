package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.UserRegistrationDto;
import com.aber.crp.service.UserService;

@Controller
@RequestMapping("/user/home")
public class HomePageController {

	
	@GetMapping
	public String showLoginPage() {
		return "user/home";
	}
	
	@PostMapping
	public String loadLoginPage() {
		return "user/home";
	}

}
