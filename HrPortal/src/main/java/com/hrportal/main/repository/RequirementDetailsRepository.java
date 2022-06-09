package com.hrportal.main.repository;

import java.util.List;
import java.util.Map;

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
	
	private static String INSERT_REQUIRMENT_DETAILS= "INSERT INTO REQUIRMENT_DETAILS(JOB_ID,EMPLOYEE_ID,PROJECT_ID, "
			+ "QUALIFICATION,PRIMARY_SKILL_1,PRIMARY_SKILL_2,PRIMARY_SKILL_3,"
			+ "JOB_REQUEST_STATUS,EXPERIENCE,REQUIRED_NO_OF_EMPLOYEES) "
			+ "VALUES(SEQ3_REQUIRMENT_DETAILS.nextval,?,?,?,?,?,?,?,?,?)";
	
	private static String SELECT_ALL_REQUIRMENT_DETAILS="SELECT * FROM REQUIRMENT_DETAILS";
	
	private static String SELECT_SINGLE_REQUIRMENT_DETAILS="SELECT * FROM REQUIRMENT_DETAILS WHERE JOB_ID = ?";
	
	private static String UPDATE_REQUIRMENT_DETAILS="UPDATE REQUIRMENT_DETAILS SET EMPLOYEE_ID = ?,PROJECT_ID = ?, QUALIFICATION=?,"
			+ " PRIMARY_SKILL_1=?,PRIMARY_SKILL_2=?,PRIMARY_SKILL_3=?, JOB_REQUEST_STATUS=?, EXPERIENCE=?, REQUIRED_NO_OF_EMPLOYEES=?"
			+ " WHERE JOB_ID = ?";
	
	private static String DELETE_REQUIREMENT_DETAILS="DELETE REQUIRMENT_DETAILS WHERE JOB_ID = ?";
	private static String GET_SINGLE_REQUEST_BY_PROJECT_ID="SELECT * FROM REQUIRMENT_DETAILS WHERE PROJECT_ID = ?";
	
	private int resultCount;


@Override
public boolean addRequirmentDetails(RequirementDetails requirementDetails) {
	Object[] args = {requirementDetails.getEmployeeDetails().getEmployeeId(),requirementDetails.getProjectMaster().getProjectId(),
			requirementDetails.getQualification(),requirementDetails.getPrimarySkill1(),requirementDetails.getPrimarySkill2(),requirementDetails.getPrimarySkill3(),
			requirementDetails.getJobRequestStatus(),requirementDetails.getExperience(),requirementDetails.getRequiredNoOfEmployees()};
	resultCount = jdbcTemplate.update(INSERT_REQUIRMENT_DETAILS, args);
	if (resultCount > 0) {
		return true;
	} else
		return false;
}
@Override
public boolean updateRequirmentDetails(RequirementDetails requirementDetails) {
	Object[] args = {requirementDetails.getEmployeeDetails().getEmployeeId(),requirementDetails.getProjectMaster().getProjectId(),
			requirementDetails.getQualification(),requirementDetails.getPrimarySkill1(),requirementDetails.getPrimarySkill2(),
			requirementDetails.getPrimarySkill3(),requirementDetails.getJobRequestStatus(),requirementDetails.getExperience(),
			requirementDetails.getRequiredNoOfEmployees(),requirementDetails.getJobId()};
	resultCount = jdbcTemplate.update(UPDATE_REQUIRMENT_DETAILS, args);
	if (resultCount > 0)
		return true;
	else
		return false;
}


@Override
public boolean deleteRequirmentDetailsDetails(int jobId) {
	Object[] args = { jobId};
	resultCount = jdbcTemplate.update(DELETE_REQUIREMENT_DETAILS, args);
	if (resultCount > 0)
		return true;
	else
		return false;
}


@Override
public RequirementDetails getRequirmentDetailsByJobId(int jobId) {
	Object[] args = { jobId };
	RequirementDetails requirementDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_REQUIRMENT_DETAILS, requirementsDetailsRowMapper, args);
	return requirementDetails;
}


@Override
public List<RequirementDetails> getAllRequirmentDetails() {
	List<RequirementDetails> requirementDetails = jdbcTemplate.query(SELECT_ALL_REQUIRMENT_DETAILS, requirementsDetailsRowMapper);
	return requirementDetails;
}
@Override
public List<RequirementDetails> getSingleRequestByProjectId(int projectid) {
	Object [] args = {projectid};
List <RequirementDetails> requirementDetails = jdbcTemplate.query(GET_SINGLE_REQUEST_BY_PROJECT_ID, requirementsDetailsRowMapper, args);
	return requirementDetails;
}
	


}
