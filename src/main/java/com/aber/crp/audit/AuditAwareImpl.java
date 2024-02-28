package com.aber.crp.audit;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.aber.crp.model.User;
import com.aber.crp.repository.UserRepository;
import com.aber.crp.service.UserService;
import com.aber.crp.service.impl.UserServiceImpl;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String>{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Optional<String> getCurrentAuditor() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if (authentication == null || !authentication.isAuthenticated()) {
			return null;
		}
		
		User user = userRepo.findByUserName(authentication.getName());
		if (user == null) {
			return null;
		}
		
		return Optional.of(user.toString());
	}
	
	

}
