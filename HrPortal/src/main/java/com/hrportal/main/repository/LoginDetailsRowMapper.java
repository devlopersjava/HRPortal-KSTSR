package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.LoginDetails;

@Component
public class LoginDetailsRowMapper implements RowMapper<LoginDetails>{

	
	@Override
	public LoginDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int loginId= resultSet.getInt("LOGIN_ID");
		String role= resultSet.getString("ROLE");
		String password=resultSet.getString("PASSWORD");
		LoginDetails loginDetails = new LoginDetails(loginId, role, password);
		return loginDetails;
	}
}
