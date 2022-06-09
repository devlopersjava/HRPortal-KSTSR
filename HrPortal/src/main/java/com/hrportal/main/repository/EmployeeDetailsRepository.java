package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.pojo.ProjectMaster;

import oracle.jdbc.OracleTemporalField;

@Repository
public class EmployeeDetailsRepository implements EmployeeDetailsRepositoryInterface{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeeDetailsRowMapper employeeDetailsRowMapper;
	
	private static String INSERT_EMPLOYEE_DETAILS = "INSERT INTO EMPLOYEE_DETAILS (EMPLOYEE_ID,LOGIN_ID,PROJECT_ID,FIRST_NAME,LAST_NAME,"
			+ "EMAIL_ID,CONTACT_NO,GENDER,DATE_OF_BIRTH,DATE_OF_JOINING,DESIGNATION,QUALIFICATION,PRIMARY_SKILL_1,PRIMARY_SKILL_2,"
			+ "PRIMARY_SKILL_3,MGR_ID)VALUES(SEQ2_EMPLOYEE_DETAILS.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static String SELECT_ALL_EMPLOYEE_DETAILS="SELECT * FROM EMPLOYEE_DETAILS";
	
	private static String SELECT_SINGLE_EMPLOYEE_DETAILS = "SELECT * FROM EMPLOYEE_DETAILS WHERE EMPLOYEE_ID=?";
	
	private static String UPDATE_EMPLOYEE_DETAILS = "UPDATE EMPLOYEE_DETAILS SET LOGIN_ID=?,PROJECT_ID=?,FIRST_NAME=?,LAST_NAME=?,"
			+ "EMAIL_ID=?,CONTACT_NO=?,GENDER=?, DATE_OF_BIRTH=?, DATE_OF_JOINING=?, DESIGNATION=?,QUALIFICATION=?,PRIMARY_SKILL_1=?,"
			+ "PRIMARY_SKILL_2=?,PRIMARY_SKILL_3=?,MGR_ID=?  WHERE EMPLOYEE_ID = ?";
	
	private static String DELETE_EMOPLOYEE_DETAILS="DELETE EMPLOYEE_DETAILS WHERE EMPLOYEE_ID=?";
	
	private static String SELECT_EMPLOYEE_BY_LOGIN_ID = "SELECT * FROM EMPLOYEE_DETAILS WHERE LOGIN_ID=?";
	
	private int resultCount;
	@Override
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails) {
		Object [] args = {employeeDetails.getLoginDetails().getLoginId(),employeeDetails.getProjectMaster().getProjectId()
				,employeeDetails.getFirstName(),employeeDetails.getLastName(),employeeDetails.getEmailId(),employeeDetails.getContactNo()
				,employeeDetails.getGender(),employeeDetails.getDateOfBirth(),employeeDetails.getDateOfJoining(),
				employeeDetails.getDesignation(),employeeDetails.getQualification(),employeeDetails.getPrimarySkill1()
				,employeeDetails.getPrimarySkill2(),employeeDetails.getPrimarySkill3(),employeeDetails.getMgrId()};
		resultCount=jdbcTemplate.update(INSERT_EMPLOYEE_DETAILS, args);
		if (resultCount>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		Object [] args = {employeeDetails.getLoginDetails().getLoginId(),employeeDetails.getProjectMaster().getProjectId(),employeeDetails.getFirstName(),
				employeeDetails.getLastName(),employeeDetails.getEmailId(),employeeDetails.getContactNo(),employeeDetails.getGender(),
				employeeDetails.getDateOfBirth(),employeeDetails.getDateOfJoining(),employeeDetails.getDesignation(),employeeDetails.getQualification(),
				employeeDetails.getPrimarySkill1(),employeeDetails.getPrimarySkill2(),employeeDetails.getPrimarySkill3(),
				employeeDetails.getMgrId(),employeeDetails.getEmployeeId()};
		resultCount = jdbcTemplate.update(UPDATE_EMPLOYEE_DETAILS, args);
		if (resultCount>0)
		return true;
		else
			return false;
	}

	@Override
	public boolean deleteEmployeeDetails(int employeeId) {
		Object [] args = {employeeId};
		resultCount = jdbcTemplate.update(DELETE_EMOPLOYEE_DETAILS, args);
		if(resultCount>0)
			return true;
		else
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

	@Override
	public EmployeeDetails getEmployeeDetailsByLoginId(int loginId) {
		Object[] args = {loginId};
     	EmployeeDetails employeeDetailsByLoginId = jdbcTemplate.queryForObject(SELECT_EMPLOYEE_BY_LOGIN_ID, employeeDetailsRowMapper, args);
		return employeeDetailsByLoginId;
	}


}
