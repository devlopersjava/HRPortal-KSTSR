package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.LoginDetails;

public interface LoginDetailsServiceInterface {

	
	public boolean addLoginDetails(LoginDetails loginDetails);
	public boolean updateLoginDetails(LoginDetails loginDetails);
	public boolean deleteLoginDetails(int loginId);
	public LoginDetails getLoginDetailsByLoginId(int loginId);
	public  List<LoginDetails> getAllLoginDetails();
	public LoginDetails validateLogin(LoginDetails loginDetails);
}