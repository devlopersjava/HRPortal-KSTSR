package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.pojo.ProjectMaster;
@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {

	
	@Autowired
	private LoginDetailsRowMapper loginDetailsRowMapper;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	private int resultCount;
	
	 
    private static String INSERT_LOGIN_DETAILS = "INSERT INTO LOGIN_DETAILS(LOGIN_ID,ROLE, PASSWORD) VALUES(SEQ_LOGIN_DETAILS.NEXTVAL,?,?)";
	private static String SELECT_ALL_LOGIN_DETAILS="SELECT * FROM LOGIN_DETAILS ";
	private static String SELECT_SINGLE_LOGIN_DETAILS="SELECT * FROM LOGIN_DETAILS WHERE LOGIN_ID = ?";
	private static String VALIDATE_LOGIN = "SELECT * FROM LOGIN_DETAILS WHERE LOGIN_ID = ? AND PASSWORD = ?";
	private static String UPDATE_LOGIN_DETAILS="UPDATE LOGIN_DETAILS SET ROLE = ?,PASSWORD=? WHERE LOGIN_ID = ?";
	private static String DELETE_LOGIN_DETAILS="DELETE LOGIN_DETAILS WHERE LOGIN_ID = ?";
	
	

	@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		Object [] args = {loginDetails.getRole(), loginDetails.getPassword()};
		resultCount = jdbcTemplate.update(INSERT_LOGIN_DETAILS, args);
		if (resultCount>0) 
			return true;
		else
		return false;
	}

	@Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {
		Object[] args = {loginDetails.getRole(),loginDetails.getPassword(),loginDetails.getLoginId()};
		resultCount = jdbcTemplate.update(UPDATE_LOGIN_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	
	}

	@Override
	public boolean deleteLoginDetails(int loginId) {
		Object[] args = { loginId};
		resultCount = jdbcTemplate.update(DELETE_LOGIN_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public LoginDetails getLoginDetailsByLoginId(int loginId) {
		Object[] args = { loginId };
		LoginDetails loginDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_LOGIN_DETAILS, loginDetailsRowMapper, args);
		return loginDetails;
	}

	@Override
	public List<LoginDetails> getAllLoginDetails() {
		List<LoginDetails> allLoginDetails = jdbcTemplate.query(SELECT_ALL_LOGIN_DETAILS, loginDetailsRowMapper);
		return allLoginDetails;
	}

	@Override
	public LoginDetails validateLogin(LoginDetails loginDetails) {
		
			Object[] args = {loginDetails.getLoginId(),loginDetails.getPassword()};
			LoginDetails loginDetailsValidate = jdbcTemplate.queryForObject(VALIDATE_LOGIN, loginDetailsRowMapper, args);
			return loginDetailsValidate;
		} 

}
