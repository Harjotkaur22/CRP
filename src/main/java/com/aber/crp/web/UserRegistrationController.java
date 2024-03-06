package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.UserDto;
import com.aber.crp.service.UserService;

@Controller
@RequestMapping("/registerUser")
public class UserRegistrationController {
	
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("user")
	public UserDto userRegistrationDto() {
		return new UserDto();
	}
	
	
	@GetMapping
	public String showRegistrationForm() {
		
		return "registerUser";
	}
	
	@PostMapping
	public String registerUser(@ModelAttribute("user") UserDto dto) {
		
		if(!dto.getPassword1().equals(dto.getPassword2())) {
			return "redirect:/registerUser?error";
		}
		
		userService.save(dto);
		return "login";
	}

}
