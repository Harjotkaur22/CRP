package com.aber.crp.mapper;

import java.util.List;

import com.aber.crp.dto.CommentsDto;
import com.aber.crp.dto.PostDto;
import com.aber.crp.model.Comments;
import com.aber.crp.model.Post;

public class PostMapper {

    public static PostDto mapToPostDto( Post post, PostDto postDto) {
    	postDto.setId(post.getId());
    	postDto.setSubject(post.getSubject());
    	postDto.setDescription(post.getDescription());
    	postDto.setCodeSample(post.getCodeSample());
        return postDto;
    }

    public static Post mapToPost(PostDto postDto, Post post) {
    	post.setSubject(postDto.getSubject());
    	post.setDescription(postDto.getDescription());
    	post.setCodeSample(postDto.getCodeSample());
        return post;
    }
    
    public static List<PostDto> maptoPostDtoList(List<Post> postList, List<PostDto> postDtoList) {
    	
    	postList.forEach(x -> postDtoList.add(mapToPostDto(x, new PostDto())));
    	return postDtoList;
    }
    

}
