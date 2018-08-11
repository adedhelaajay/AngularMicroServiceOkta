package com.backendservice.demo.user;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name;
	private String email;
	private String sessionId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", sessionId=" + sessionId + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getSessionId()=" + getSessionId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
