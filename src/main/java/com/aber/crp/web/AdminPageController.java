package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/adminHome")
public class AdminPageController {
	
	

	@GetMapping
	public String loadCodeReviewListingPage() {
		return "admin/adminHome";
	}
	
	@PostMapping
	public String submitCodeReviewListingPage() {
		return "admin/adminHome";
	}

}
