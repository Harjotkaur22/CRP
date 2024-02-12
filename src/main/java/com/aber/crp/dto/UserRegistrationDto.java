package com.aber.crp.dto;

public class UserRegistrationDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String role;
	private String password1;
	private String password2;
	
	
	
	
	
	
	public UserRegistrationDto(String firstName, String lastName, String email, String userName, String password1,
			String password2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password1 = password1;
		this.password2 = password2;
	}
	
	public UserRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	
	
	
	
	
	
	

}
