package com.aber.crp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aber.crp.dto.UserRegistrationDto;
import com.aber.crp.model.User;

public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto dto);

}
