package com.aber.crp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aber.crp.dto.PostDto;
import com.aber.crp.service.PostService;

import io.micrometer.common.util.StringUtils;

@Controller
@RequestMapping("/review")
public class ReviewerActionController {

	@Autowired
	PostService postService;

	
	@GetMapping("/updateStatus")
	public String updateStatus(@RequestParam("id") Long id, @RequestParam("status") String status) {
		
		if (StringUtils.isNotBlank(status)) {
			postService.updatePostStatus(id, status);
		}
		return "redirect:/user/posts/view?id="+id;
	}
	
	@PostMapping("/addTags")
	public String addTags(@ModelAttribute("post") PostDto dto) {
		
		postService.updatePostTags(dto);
		
		return "redirect:/user/posts/view?id="+dto.getId();
	}
	
}
