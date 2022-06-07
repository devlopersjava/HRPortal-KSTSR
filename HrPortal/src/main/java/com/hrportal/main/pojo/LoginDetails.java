package com.hrportal.main.pojo;

public class LoginDetails {

	
	private int loginId;
	private String role;
	private String password;
	
	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String role, String password) {
		super();
		this.loginId = loginId;
		this.role = role;
		this.password = password;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", role=" + role + ", password=" + password + "]";
	}
	
	
	
	
}
