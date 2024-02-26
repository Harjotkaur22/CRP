package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/adminHome")
public class AdminPageController {
	
	

	@GetMapping
	public String loadAdmminPage() {
		return "admin/adminHome";
	}
	
	@PostMapping
	public String submitAdminPage() {
		return "admin/adminHome";
	}

}
