package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/notification")
public class NotificationPageController {
	
	

	@GetMapping
	public String loadNotificationPage() {
		return "user/notification";
	}
	
	@PostMapping
	public String submitNotificationPage() {
		return "user/notification";
	}

}
