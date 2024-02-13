package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/message")
public class MessagePageController {
	
	

	@GetMapping
	public String loadMessagePage() {
		return "user/message";
	}
	
	@PostMapping
	public String submitMessagePage() {
		return "user/message";
	}

}
