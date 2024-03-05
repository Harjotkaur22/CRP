package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.aber.crp.model.User;
import com.aber.crp.repository.UserRepository;
import com.aber.crp.service.UserService;

@Controller
@RequestMapping("/user/profile")
public class ProfilePageController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepo;
	

	@GetMapping
	public String loadProfilePage(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		
		User user = userRepo.findByUserName(authentication.getName());
		if (user == null) {
			return null;
		}
		model.addAttribute("user", user);		
		return "user/profile";
	}
	

	@PostMapping
	public String loadProfilePage() {
		return "user/profile";
	}

}
