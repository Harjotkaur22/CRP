package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	
	@GetMapping("/login")
	public String showHome() {
		
		return "login";
		
	}

	@GetMapping("/accessDenied")
	public String showAccessDeniedPage() {
		
		return "accessDenied";
		
	}
}
