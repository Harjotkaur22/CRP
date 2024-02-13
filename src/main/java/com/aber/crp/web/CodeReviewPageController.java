package com.aber.crp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review/codeReview")
public class CodeReviewPageController {
	
	

	@GetMapping
	public String loadCodeReviewListingPage() {
		return "review/codeReview";
	}
	
	@PostMapping
	public String submitCodeReviewListingPage() {
		return "review/codeReview";
	}

}
