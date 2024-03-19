package com.aber.crp.mapper;

import com.aber.crp.dto.PostDto;
import com.aber.crp.dto.UserDto;
import com.aber.crp.model.Post;
import com.aber.crp.model.User;

public class UserMapper {
	
	public static UserDto mapToUserDto(User user, UserDto userDto) {
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setUserName(user.getUserName());
		userDto.setEmail(user.getEmail());
		return userDto;
	}

}
