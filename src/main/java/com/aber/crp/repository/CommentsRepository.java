package com.aber.crp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.aber.crp.model.Comments;

@EnableJpaRepositories
public interface CommentsRepository extends JpaRepository<Comments, Long>{
	
    @EntityGraph(attributePaths = "subComments")
    @Query("SELECT c FROM Comments c WHERE c.parentCommentId IS NULL and c.postId = :postId")
	List<Comments> findAllCommentsByPostId(@Param("postId") Long postId);

}
