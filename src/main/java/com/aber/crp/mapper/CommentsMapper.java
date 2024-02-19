package com.aber.crp.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.aber.crp.dto.CommentsDto;
import com.aber.crp.model.Comments;

public class CommentsMapper {

	
	 	public static CommentsDto mapToCommentsDto(Comments comment, CommentsDto commentDto) {
	 		commentDto.setPostId(comment.getPostId());
	 		commentDto.setComment(comment.getComment());
	        return commentDto;
	    }

	    public static Comments mapToComments(CommentsDto commentDto, Comments comment) {
	    	comment.setPostId(commentDto.getPostId());
	    	comment.setComment(commentDto.getComment());
	        return comment;
	    }
	    
	    public static List<CommentsDto> maptoCommentsDtoList(List<Comments> commentsList, List<CommentsDto> commentsDtoList) {
	    	
	    	commentsList.forEach(x -> commentsDtoList.add(mapToCommentsDto(x, new CommentsDto())));
	    	return commentsDtoList;
	    }
	    
	    
}
