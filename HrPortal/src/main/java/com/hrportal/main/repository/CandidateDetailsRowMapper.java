package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.RequirementDetails;

@Component
public class CandidateDetailsRowMapper implements RowMapper<CandidateDetails> {
	
	@Autowired
	private RequirementDetailsRepository requirementDetailsRepository;
	@Override
	public CandidateDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int candidateId=resultSet.getInt("CANDIDATE_ID");
		LocalDate applicationDate = resultSet.getDate("APPLICATION_DATE").toLocalDate();
		String firstName= resultSet.getString("FIRST_NAME");
		String lastName=resultSet.getString("LAST_NAME");
		String emailId=resultSet.getString("EMAIL_ID");
		long contactNo=resultSet.getLong("CONTACT_NO");
		LocalDate dateOfBirth = resultSet.getDate("DATE_OF_BIRTH").toLocalDate();
		String qualification=resultSet.getString("QUALIFICATION");
		int experience=resultSet.getInt("EXPERIENCE");
		String primarySkill1=resultSet.getString("PRIMARY_SKILL_1");
		String primarySkill2=resultSet.getString("PRIMARY_SKILL_2");;
		String primarySkill3=resultSet.getString("PRIMARY_SKILL_3");;
		String applicationStatus = resultSet.getString("APPLICATION_STATUS");
		int fileId = resultSet.getInt("FILE_ID");
		
		int jobId = resultSet.getInt("JOB_ID");
		RequirementDetails requirementDetails = requirementDetailsRepository.getJobRequestDetailsByJobId(jobId);
		requirementDetails.setJobId(jobId);
		
		CandidateDetails candidateDetails = new CandidateDetails(candidateId, applicationDate, firstName, lastName, emailId, 
				contactNo, dateOfBirth, qualification, experience, primarySkill1, primarySkill2, primarySkill3, applicationStatus, 
				fileId, requirementDetails);
		return candidateDetails;
	
	}

}
