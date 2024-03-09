package com.aber.crp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.aber.crp.service.UserService;

@Configuration
public class SecurityConfiguration {

	@Autowired
	private UserService userService;
	
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	 
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth =  new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(configurer -> configurer
										.requestMatchers("/registerUser/**").permitAll()
										.requestMatchers("/images/**").permitAll()
										.requestMatchers("/h2-console/**").permitAll()
										.requestMatchers("/user/**").hasRole("USER")
										.requestMatchers("/review/**").hasRole("REVIEWER")
										.requestMatchers("/admin/**").hasRole("ADMIN")
										.anyRequest().authenticated())
									.formLogin(form -> form.loginPage("/login")
										.loginProcessingUrl("/authenticateUser")
										.successHandler((request,response,authentication) ->response.sendRedirect("/user/home"))
										.permitAll())
									.logout(logout -> logout.permitAll())
									.exceptionHandling(configurer -> configurer.accessDeniedPage("/accessDenied"));
		
		return http.build();
		
	}
	
}
