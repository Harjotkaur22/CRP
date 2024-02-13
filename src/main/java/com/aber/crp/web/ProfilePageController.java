package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/profile")
public class ProfilePageController {
	
	

	@GetMapping
	public String loadProfilePage() {
		return "user/profile";
	}
	
	@PostMapping
	public String submitProfilePage() {
		return "user/profile";
	}

}
