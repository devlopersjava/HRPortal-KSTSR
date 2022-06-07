package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.RequirementDetails;
import com.hrportal.main.pojo.ProjectMaster;

@Component
public class RequirementsDetailsRowMapper implements RowMapper<RequirementDetails> {
	
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	ProjectMasterRepository projectMasterRepository;

	@Override
	public RequirementDetails mapRow(ResultSet resultSet, int i) throws SQLException {

		int jobId = resultSet.getInt("JOB_ID");
		String qualification=resultSet.getString("QUALIFICATION");
		String primarySkill1 = resultSet.getString("PRIMARY_SKILL_1");
		String primarySkill2= resultSet.getString("PRIMARY_SKILL_2");;
		String primarySkill3= resultSet.getString("PRIMARY_SKILL_3");;
		String jobRequestStatus=resultSet.getString("JOB_REQUEST_STATUS");;
		int experience = resultSet.getInt("EXPERIENCE");
		int requiredNoOfEmployees= resultSet.getInt("REQUIRED_NO_OF_EMPLOYEES");
		int availableEmployees=resultSet.getInt("AVAILABLE_EMPLOYEES");
		int requiredNoOfCandidates = resultSet.getInt("REQUIRED_NO_OF_CANDIDATES");
		
		int employeeId = resultSet.getInt("EMPLOYEE_ID");
		EmployeeDetails employeeDetails = employeeDetailsRepository.getEmployeeDetailsByEmployeeId(employeeId);
		
		int projectid = resultSet.getInt("PROJECT_ID");
		ProjectMaster projectMaster= projectMasterRepository.getProjectMasterById(projectid);
		
		RequirementDetails requirementDetails = new RequirementDetails(jobId, qualification, primarySkill1, primarySkill2, primarySkill3, jobRequestStatus, experience, 
				requiredNoOfEmployees, availableEmployees, requiredNoOfCandidates, employeeDetails, projectMaster);

		return requirementDetails;
	
	}
	;
}
