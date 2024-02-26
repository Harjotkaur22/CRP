package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.UserRegistrationDto;
import com.aber.crp.service.UserService;

@Controller
@RequestMapping("/registerUser")
public class UserRegistrationController {
	
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	@GetMapping
	public String showRegistrationForm() {
		
		return "registerUser";
	}
	
	@PostMapping
	public String registerUser(@ModelAttribute("user") UserRegistrationDto dto) {
		
		if(!dto.getPassword1().equals(dto.getPassword2())) {
			return "redirect:/registerUser?error";
		}
		
		userService.save(dto);
		return "login";
	}

}
