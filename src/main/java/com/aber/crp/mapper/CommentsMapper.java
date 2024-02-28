package com.aber.crp.mapper;

import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import com.aber.crp.dto.CommentsDto;
import com.aber.crp.model.Comments;

public class CommentsMapper {

	
	 	public static CommentsDto mapToCommentsDto(Comments comment, CommentsDto commentDto) {
	 		commentDto.setId(comment.getId());
	 		commentDto.setPostId(comment.getPostId());
	 		commentDto.setComment(comment.getComment());
	 		commentDto.setParentCommentId(comment.getParentCommentId());
	 		commentDto.setCodeReference(comment.getCodeReference());
	 		commentDto.setCreatedBy(comment.getCreatedBy());
	 		commentDto.setCreatedDate(comment.getCreatedDate());
	 		commentDto.setSubComments(maptoCommentsDtoList(comment.getSubComments(), new HashSet<CommentsDto>()));
	        return commentDto;
	    }

	    public static Comments mapToComments(CommentsDto commentDto, Comments comment) {
	    	comment.setId(commentDto.getId());
	    	comment.setPostId(commentDto.getPostId());
	    	comment.setComment(commentDto.getComment());
	    	comment.setParentCommentId(commentDto.getParentCommentId());
	    	comment.setCodeReference(commentDto.getCodeReference());
	        return comment;
	    }
	    
	    public static Set<CommentsDto> maptoCommentsDtoList(Set<Comments> commentsList, Set<CommentsDto> commentsDtoList) {
	    	
	    	if(!CollectionUtils.isEmpty(commentsList))
	    		commentsList.forEach(x -> commentsDtoList.add(mapToCommentsDto(x, new CommentsDto())));
	    	return commentsDtoList;
	    }
	    
	    
}
