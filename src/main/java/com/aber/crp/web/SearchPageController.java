package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/search")
public class SearchPageController {
	
	

	@GetMapping
	public String loadSearchPage() {
		return "user/search";
	}
	
	@PostMapping
	public String submitSearchPage() {
		return "user/search";
	}

}
