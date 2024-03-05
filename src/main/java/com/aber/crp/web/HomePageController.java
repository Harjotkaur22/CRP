package com.aber.crp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.PostDto;
import com.aber.crp.dto.UserRegistrationDto;
import com.aber.crp.service.PostService;
import com.aber.crp.service.UserService;

@Controller
@RequestMapping("/user/home")
public class HomePageController {

	
	@Autowired
	PostService postService;
	
	@GetMapping
	public String showLoginPage(Model model) {
		List<PostDto> postDtoList = postService.findAllPost();
		model.addAttribute("postList", postDtoList);
		return "user/home";
	}
	
	@PostMapping
	public String loadLoginPage() {
		return "user/home";
	}

}
