package com.aber.crp.service;

import java.util.List;
import java.util.Set;

import com.aber.crp.dto.CommentsDto;
import com.aber.crp.dto.PostDto;
import com.aber.crp.model.Tag;

public interface PostService {
	
	void savePost(PostDto postDto);
	List<PostDto> findAllPost();
	PostDto findPostById(Long id);
	Set<CommentsDto> findAllCommentsByPostId(Long postId);
	void saveComment(CommentsDto commentDto);
	void deletePost(Long id);
	void updatePostStatus(Long id, String status);
	void updatePostTags(PostDto dto);
	Set<Tag> findAllTags();

}
