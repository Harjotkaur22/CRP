package com.aber.crp.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aber.crp.dto.UserDto;
import com.aber.crp.mapper.UserMapper;
import com.aber.crp.model.Role;
import com.aber.crp.model.User;
import com.aber.crp.repository.UserRepository;
import com.aber.crp.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	private UserDto UserDto;

	@Override
	public User save(UserDto dto) {
		
		List<Role> roles = loadRoleFromDto(dto);
		User user = new User(dto.getFirstName(), dto.getLastName(), dto.getUserName(), dto.getEmail(), passwordEncoder.encode(dto.getPassword1()), roles);
	
		userRepo.save(user);
		return user;
		
	}

	private List<Role> loadRoleFromDto(UserDto dto) {
		// TODO Auto-generated method stub Arrays.asList(new Role("ROLE_USER"),new Role("ROLE_REVIEWER"),new Role("ROLE_ADMIN"))
		List<Role> roles = new ArrayList<Role>();
		roles.add(new Role("ROLE_USER"));
		if (dto.getRole().equals("ROLE_REVIEWER")) {
			roles.add(new Role("ROLE_REVIEWER"));
		} else if (dto.getRole().equals("ROLE_ADMIN")) {
			roles.add(new Role("ROLE_REVIEWER"));
			roles.add(new Role("ROLE_ADMIN"));
		}
		return roles;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepo.findByUserName(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),mapRolesToAuthorities(user.getRoles()));
	}
	

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}


	@Override
	public UserDto findByUserName(String name) {
		User user = userRepo.findByUserName(name);
		return UserMapper.mapToUserDto(user, new UserDto());
	}



}
