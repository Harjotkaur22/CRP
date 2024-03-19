package com.aber.crp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aber.crp.dto.NotificationDto;
import com.aber.crp.service.NotificationService;

@Controller
@RequestMapping("/user/notification")
public class NotificationPageController {
	
	@Autowired
	NotificationService notificationService;
	

	@GetMapping
	public String loadNotificationPage(Model model) {
		 List<NotificationDto> notificationForCurrentUser = notificationService.getNotificationForCurrentUser();
		model.addAttribute("notifications" , notificationForCurrentUser);
		
		return "user/notification";
	}
	
	@PostMapping
	public String submitNotificationPage() {
		return "user/notification";
	}

}
