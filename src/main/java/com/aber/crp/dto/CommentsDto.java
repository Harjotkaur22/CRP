package com.aber.crp.dto;

import java.util.Set;

public class CommentsDto extends BaseEntityDto{

	
	private Long id;
	private Long postId;
	private String comment;
	private Long parentCommentId;
	private Set<CommentsDto> subComments; 
	private String codeReference;
	private Long start;
	private Long end;

	
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
	public String getCodeReference() {
		return codeReference;
	}
	public void setCodeReference(String codeReference) {
		this.codeReference = codeReference;
	}
	public Long getStart() {
		return start;
	}
	public void setStart(Long start) {
		this.start = start;
	}
	public Long getEnd() {
		return end;
	}
	public void setEnd(Long end) {
		this.end = end;
	}
	
	
	
}
