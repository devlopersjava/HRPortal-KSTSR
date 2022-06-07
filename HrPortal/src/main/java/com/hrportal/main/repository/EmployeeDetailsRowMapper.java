package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.pojo.ProjectMaster;

@Component
public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {

	@Autowired
	LoginDetailsRepository loginDetailsRepository;
	@Autowired
	ProjectMasterRepository projectMasterRepository;
	
	
	@Override
	public EmployeeDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		
		int employeeId=resultSet.getInt("EMPLOYEE_ID");
		String firstName=resultSet.getString("FIRST_NAME");
		String lastName=resultSet.getString("LAST_NAME");
		String emailId=resultSet.getString("EMAIL_ID");
		long contactNo=resultSet.getLong("CONTACT_NO");
		String gender=resultSet.getString("GENDER");
		LocalDate dateOfBirth = resultSet.getDate("DATE_OF_BIRTH").toLocalDate();
		LocalDate dateOfjoining = resultSet.getDate("DATE_OF_JOINING").toLocalDate();
		String designation=resultSet.getString("DESIGNATION");
		String qualification=resultSet.getString("QUALIFICATION");
		String primarySkill1=resultSet.getString("PRIMARY_SKILL_1");
		String primarySkill2=resultSet.getString("PRIMARY_SKILL_2");
		String primarySkill3=resultSet.getString("PRIMARY_SKILL_3");
		int mgrId=resultSet.getInt("MGR_ID");
		
		int loginId= resultSet.getInt("LOGIN_ID") ;
		LoginDetails loginDetails=loginDetailsRepository.getLoginDetailsByLoginId(loginId);
		
		
		int projectId = resultSet.getInt("PROJECT_ID");
		ProjectMaster projectMaster = projectMasterRepository.getProjectMasterById(projectId);
	
		
		EmployeeDetails employeeDetails = new EmployeeDetails(employeeId, firstName, lastName, emailId, contactNo, gender, 
				dateOfBirth, dateOfjoining, designation, qualification, primarySkill1, primarySkill2, primarySkill3, mgrId, 
				loginDetails, projectMaster);
		
		return employeeDetails;
	}

}
