package com.aber.crp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aber.crp.dto.UserDto;
import com.aber.crp.model.User;

public interface UserService extends UserDetailsService{
	
	User save(UserDto dto);

	
	UserDto findByUserName(String name);

}
