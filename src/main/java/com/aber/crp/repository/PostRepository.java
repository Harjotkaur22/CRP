package com.aber.crp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aber.crp.model.Post;


@EnableJpaRepositories
public interface PostRepository extends JpaRepository<Post, Long>{

}
