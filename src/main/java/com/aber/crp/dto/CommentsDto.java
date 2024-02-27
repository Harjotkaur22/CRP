package com.aber.crp.dto;

import java.util.List;
import java.util.Set;

public class CommentsDto {

	
	private Long id;
	private Long postId;
	private String comment;
	private Long parentCommentId;
	private Set<CommentsDto> subComments; 
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getParentCommentId() {
		return parentCommentId;
	}
	public void setParentCommentId(Long parentCommentId) {
		this.parentCommentId = parentCommentId;
	}
	public Set<CommentsDto> getSubComments() {
		return subComments;
	}
	public void setSubComments(Set<CommentsDto> subComments) {
		this.subComments = subComments;
	}
	
	
	
	
}
