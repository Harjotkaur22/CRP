package com.aber.crp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aber.crp.model.Tag;

@EnableJpaRepositories
public interface TagRepository extends JpaRepository<Tag, Long> {

}
