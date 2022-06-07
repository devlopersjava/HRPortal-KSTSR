package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.repository.LoginDetailsRepository;
import com.hrportal.main.repository.LoginDetailsRepositoryInterface;
@Service
public class LoginDetailsService implements LoginDetailsServiceInterface {

	@Autowired
	private LoginDetailsRepositoryInterface loginDetailsRepository;
	@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.addLoginDetails(loginDetails);
	}

	@Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {
		
		return loginDetailsRepository.updateLoginDetails(loginDetails);
	}

	@Override
	public boolean deleteLoginDetails(int loginId) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.deleteLoginDetails(loginId);
	}

	@Override
	public LoginDetails getLoginDetailsByLoginId(int loginId) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.getLoginDetailsByLoginId(loginId);
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		// TODO Auto-generated method stub
		return loginDetailsRepository.getAllLoginDetails();
	}

	@Override
	public LoginDetails validateLogin(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.validateLogin(loginDetails);
	}
	
	

}
