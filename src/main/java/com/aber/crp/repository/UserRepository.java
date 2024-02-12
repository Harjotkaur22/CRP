package com.aber.crp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aber.crp.model.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUserName(String userName);

}
