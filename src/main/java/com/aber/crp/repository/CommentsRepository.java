package com.aber.crp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aber.crp.model.Comments;

@EnableJpaRepositories
public interface CommentsRepository extends JpaRepository<Comments, Long>{
	
	List<Comments> findAllCommentsByPostId(Long postId);

}
