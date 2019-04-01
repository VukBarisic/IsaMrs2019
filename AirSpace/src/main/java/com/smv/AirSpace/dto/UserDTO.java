package com.smv.AirSpace.dto;

import com.smv.AirSpace.model.UserType;

public class UserDTO {
	
	protected String username;
    protected String email;
    protected UserType userType;
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
    
    

}
