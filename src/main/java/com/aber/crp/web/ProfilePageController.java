package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.UserDto;
import com.aber.crp.service.UserService;
import com.aber.crp.util.Utils;

@Controller
@RequestMapping("/user/profile")
public class ProfilePageController {
	
	@Autowired
	private UserService userService;	

	@GetMapping
	public String loadProfilePage(Model model) {
		
		UserDto userdto = userService.findByUserName(Utils.getCurrentUserName());
		
		if(userdto == null) {
			return "login";
		}
		model.addAttribute("user", userdto);
		return "user/profile";
	}
	
	@PostMapping
	public String submitProfilePage() {
		return "user/profile";
	}

}
