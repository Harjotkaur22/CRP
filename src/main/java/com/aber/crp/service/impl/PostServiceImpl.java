package com.aber.crp.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aber.crp.dto.CommentsDto;
import com.aber.crp.dto.PostDto;
import com.aber.crp.mapper.CommentsMapper;
import com.aber.crp.mapper.PostMapper;
import com.aber.crp.model.Comments;
import com.aber.crp.model.Post;
import com.aber.crp.model.Tag;
import com.aber.crp.repository.CommentsRepository;
import com.aber.crp.repository.PostRepository;
import com.aber.crp.repository.TagRepository;
import com.aber.crp.service.PostService;

@Service
public class PostServiceImpl implements PostService {
	
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private CommentsRepository commentsRepo;

	@Autowired
	private TagRepository tagRepo;
	

	@Override
	public void savePost(PostDto dto) {
		Post post =  PostMapper.mapToPost(dto, new Post());
		postRepo.save(post);
	}

	
	
	@Override
	public List<PostDto> findAllPost() {
		List<Post> postList = postRepo.findAll();
		List<PostDto> postDtoList = PostMapper.maptoPostDtoList(postList, new ArrayList<PostDto>());
		return postDtoList;
	}



	@Override
	public PostDto findPostById(Long id) {
		
		Post post = postRepo.findById(id).orElse(new Post());
		
		return PostMapper.mapToPostDto(post, new PostDto());
	}

	@Override
	public Set<CommentsDto> findAllCommentsByPostId(Long postId) {
		List<Comments> comments = commentsRepo.findAllCommentsByPostId(postId);
		Set<CommentsDto> commentsDtoList = CommentsMapper.maptoCommentsDtoList(new HashSet<Comments>(comments), new HashSet<CommentsDto>());
		return commentsDtoList;
	}

	@Override
	public void saveComment(CommentsDto commentsDto) {
			Comments comment = CommentsMapper.mapToComments(commentsDto, new Comments());
			commentsRepo.save(comment);
		
	}
	
	@Override
	public void deletePost(Long id) {
		postRepo.deleteById(id);
	}



	@Override
	public void updatePostStatus(Long id, String status) {
		
		Optional<Post> postOptional = postRepo.findById(id);
		
		if(postOptional.isPresent()) {
			Post post = postOptional.get();
			switch (status) {
				case "GP" -> post.setGoodPractice(true);
				case "BP" -> post.setGoodPractice(false);
				case "RV" -> post.setReviewed(true);
				case "CRV" -> post.setReviewed(false);
				default -> throw new IllegalArgumentException("Unexpected value: " + status);
			}
			postRepo.saveAndFlush(post);
		}
		
	}



	@Override
	public void updatePostTags(PostDto dto) {

		Optional<Post> postOptional = postRepo.findById(dto.getId());
		if(postOptional.isPresent()) {
			Post post = postOptional.get();
			post.setTags(dto.getTags());
			postRepo.save(post);
		}
		
	}

	@Override
	public Set<Tag> findAllTags() {
		List<Tag> tagsList = tagRepo.findAll();
		return new HashSet<Tag>(tagsList);
	}
	

}
