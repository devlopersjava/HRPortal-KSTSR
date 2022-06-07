package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.ProjectMaster;

@Repository
public class EmployeeDetailsRepository implements EmployeeDetailsRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeDetailsRowMapper employeeDetailsRowMapper;
	
	private static String INSERT_EMPLOYEE_DETAILS = "INSERT INTO EMPLOYEE_DETAILS (LOGIN_ID,PROJECT_ID,FIRST_NAME,LAST_NAME,"
			+ "EMAIL_ID,CONTACT_NO,GENDER,DATE_OF_BIRTH, DATE_OF_JOINING, DESIGNATION,QUALIFICATION,PRIMARY_SKILL_1,"
			+ "PRIMARY_SKILL_2,PRIMARY_SKILL_3,MGR_ID)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String SELECT_ALL_EMPLOYEE_DETAILS="SELECT * FROM EMPLOYEE_DETAILS";
	
	private static String SELECT_SINGLE_EMPLOYEE_DETAILS = "SELECT * FROM EMPLOYEE_DETAILS WHERE EMPLOYEE_ID=?";
	
	private static String UPDATE_EMPLOYEE_DETAILS = "UPDATE EMPLOYEE_DETAILS SET LOGIN_ID,PROJECT_ID,FIRST_NAME,LAST_NAME,"
			+ "EMAIL_ID,CONTACT_NO,GENDER, DATE_OF_BIRTH, DATE_OF_JOINING, DESIGNATION,QUALIFICATION,PRIMARY_SKILL_1,"
			+ "PRIMARY_SKILL_2,PRIMARY_SKILL_3,MGR_ID";
	
	private static String DELETE_EMOPLOYEE_DETAILS="DELETE EMPLOYEE_DETAILS WHERE EMPLOYEE_ID=?";
	
	private int resultount;
	@Override
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails) {
	return false;
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeDetails(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByEmployeeId(int employeeId) {
		Object[] args = {employeeId};
		EmployeeDetails employeeDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_EMPLOYEE_DETAILS,employeeDetailsRowMapper, args);
		return employeeDetails;
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		List<EmployeeDetails> allEmployeeDetails = jdbcTemplate.query(SELECT_ALL_EMPLOYEE_DETAILS, employeeDetailsRowMapper);
		return allEmployeeDetails;
	}

}
