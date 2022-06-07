package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.RequirementDetails;
import com.hrportal.main.pojo.ProjectMaster;
@Repository
public class RequirementDetailsRepository implements RequirementDetailsRepositoryInterface {

	
	@Autowired
	private RequirementsDetailsRowMapper requirementsDetailsRowMapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;
//	private static String INSERT_JOB_REQUEST_DETAILS = "INSERT INTO REQUIRMENT_DETAILS(EMPLOYEE_ID, PROJECT_ID, "
//			+ "QUALIFICATION, PRIMARY_SKILL_1, PRIMARY_SKILL_2, PRIMARY_SKILL_3,"
//			+ "	JOB_REQUEST_STATUS, EXPERIENCE, REQUIRED_NO_OF_EMPLOYEES,AVAILABLE_EMPLOYEES,REQUIRED_NO_OF_CANDIDATES) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
//	
	private static String SELECT_ALL_REQUIRMENT_DETAILS="SELECT * FROM REQUIRMENT_DETAILS";
	private static String SELECT_SINGLE_REQUIRMENT_DETAILS="SELECT * FROM REQUIRMENT_DETAILS WHERE JOB_ID = ?";
	
//	
//	private static String UPDATE_JOB_REQUEST_DETAILS="UPDATE REQUIRMENT_DETAILS SET EMPLOYEE_ID = ?,PROJECT_ID = ?, QUALIFICATION=?,"
//			+ " PRIMARY_SKILL_1=?,PRIMARY_SKILL_2=?,PRIMARY_SKILL_3=?, JOB_REQUEST_STATUS=?, EXPERIENCE=?, REQUIRED_NO_OF_EMPLOYEES=?,AVAILABLE_EMPLOYEES=?,REQUIRED_NO_OF_CANDIDATES=?"
//			+ " WHERE JOB_ID = ?";
//	private static String DELETE_JOB_REQUEST_DETAILS="DELETE REQUIRMENT_DETAILS WHERE JOB_ID = ?";
	private int resultCount;
	
	
	@Override
	public boolean addJobRequestDetails(RequirementDetails jobRquestDetails) {
//		Object[] args = {jobRquestDetails.getEmployeeId(),jobRquestDetails.getJobId() ,jobRquestDetails.getQualification(), 
//				jobRquestDetails.getPrimarySkill1(),jobRquestDetails.getPrimarySkill2(), jobRquestDetails.getPrimarySkill3(),
//				jobRquestDetails.getJobRequestStatus(),jobRquestDetails.getExperience(),jobRquestDetails.getRequiredNoOfEmployees()};
//		resultCount = jdbcTemplate.update(INSERT_JOB_REQUEST_DETAILS, args);
//		if (resultCount > 0) {
//			return true;
//		} else
			return false;
		
	}

	@Override
	public boolean updateJobRequestDetails(RequirementDetails jobRquestDetails) {
//		Object[] args = {jobRquestDetails.getEmployeeId(),jobRquestDetails.getJobId() ,jobRquestDetails.getQualification(), 
//				jobRquestDetails.getPrimarySkill1(),jobRquestDetails.getPrimarySkill2(), jobRquestDetails.getPrimarySkill3(),
//				jobRquestDetails.getJobRequestStatus(),jobRquestDetails.getExperience(),jobRquestDetails.getRequiredNoOfEmployees(),
//				jobRquestDetails.getJobId()};
//		resultCount = jdbcTemplate.update(UPDATE_JOB_REQUEST_DETAILS, args);
//		if (resultCount > 0)
//			return true;
//		else
			return false;
	}

	@Override
	public boolean deleteJobRequestDetailsDetails(int jobId) {
//		Object[] args = {jobId};
//		resultCount = jdbcTemplate.update(UPDATE_JOB_REQUEST_DETAILS, args);
//		if (resultCount > 0)
//			return true;
//		else
			return false;
	}

	@Override
	public RequirementDetails getJobRequestDetailsByJobId(int jobId) {
		Object[] args = { jobId };
		RequirementDetails requirementDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_REQUIRMENT_DETAILS, requirementsDetailsRowMapper, args);
		return requirementDetails;
	}

	@Override
	public List<RequirementDetails> getAllJobRequestDetails() {
		List<RequirementDetails> requirementDetails = jdbcTemplate.query(SELECT_ALL_REQUIRMENT_DETAILS, requirementsDetailsRowMapper);
		return requirementDetails;
	}

}
