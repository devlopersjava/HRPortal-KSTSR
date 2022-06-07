package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.InterviewDetails;
import com.hrportal.main.pojo.LoginDetails;

@Component
public class InterviewDetailsRowMapper implements RowMapper<InterviewDetails> {
	@Autowired
	EmployeeDetailsRepository employeeDetailsRepository;
	@Autowired
	CandidateDetailsRepository candidateDetailsRepository;
	
	public InterviewDetails mapRow(ResultSet resulSet, int i) throws SQLException {
		
		
		 int interviewId = resulSet.getInt("INTERVIEW_ID");
			int aptitudeRound=resulSet.getInt("APTITUDE_ROUND");
			 int technicalId=resulSet.getInt("TECHNICAL_ROUND");
			 int hrRound=resulSet.getInt("HR_ROUND");
		 String remarks= resulSet.getString("REMARKS");
			 String interviewStatus=resulSet.getString("INTERVIEW_STATUS");
			 
			int interviewerId= resulSet.getInt("INTERVIEWER_ID") ;
			EmployeeDetails employeeDetails=employeeDetailsRepository.getEmployeeDetailsByEmployeeId(interviewerId);
			int candidateId = resulSet.getInt("CANDIDATE_ID");
			CandidateDetails candidateDetails =candidateDetailsRepository.getCandidateDetailsByCandidateId(candidateId);
			
			InterviewDetails interviewDetails=new InterviewDetails(interviewId, aptitudeRound, technicalId, hrRound, remarks, interviewStatus, employeeDetails, candidateDetails);
			return interviewDetails;
		}
}
