package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.InterviewDetails;
import com.hrportal.main.pojo.ProjectMaster;

@Repository
public class InterviewDetailsRepository implements InterviewDetailsRepositoryInterface {
	
	@Autowired
	private InterviewDetailsRowMapper interviewDetailsRowMapper;

	@Autowired
private JdbcTemplate jdbcTemplate;
	private int resultCount;
	
	private static String INSERT_INTERVIEW_DETAILS = "INSERT INTO INTERVIEW_DETAILS(INTERVIEW_ID,CANDIDATE_ID,INTERVIEWER_ID "
			+ ",APTITUDE_ROUND ,TECHNICAL_ROUND ,HR_ROUND,REMARKS,INTERVIEW_STATUS) VALUES (SEQ6_INTERVIEW_DETAILS.nextval,?,?,?,?,?,?,?)";
	private static String SELECT_SINGLE_INTERVIEW_DETAILS="SELECT * FROM INTERVIEW_DETAILS WHERE INTERVIEW_ID = ?";
	private static String SELECT_ALL_INTERVIEW_DETAILS="SELECT * FROM INTERVIEW_DETAILS ";
	
	private static String UPDATE_INTERVIEW_DETAILS = "UPDATE INTERVIEW_DETAILS SET CANDIDATE_ID = ?,INTERVIEWER_ID=?,"
			+ "APTITUDE_ROUND = ?,TECHNICAL_ROUND = ?,HR_ROUND = ?,REMARKS=?,INTERVIEW_STATUS=? WHERE INTERVIEW_ID=?";
	
	private static String DELETE_INTERVIEW_DETAILS= "DELETE INTERVIEW_DETAILS WHERE INTERVIEW_ID = ? ";
	
	
	@Override
	public boolean addInterviewDetails(InterviewDetails interviewDetails) {
		Object []args = {interviewDetails.getCandidateDetails().getCandidateId(),interviewDetails.getEmployeeDetails().getEmployeeId(),
				interviewDetails.getAptitudeRound(),interviewDetails.getTechnicalRound(),interviewDetails.getHrRound(),
				interviewDetails.getRemarks(),interviewDetails.getInterviewStatus()};
		resultCount = jdbcTemplate.update(INSERT_INTERVIEW_DETAILS, args);
		if(resultCount>0)
		return true;
		else
		return false;
	}

	@Override
	public boolean updateInterviewDetails(InterviewDetails interviewDetails) {
		Object[]args= {interviewDetails.getCandidateDetails().getCandidateId(),interviewDetails.getEmployeeDetails().getEmployeeId(),
				interviewDetails.getAptitudeRound(),interviewDetails.getTechnicalRound(),interviewDetails.getHrRound(),
				interviewDetails.getRemarks(),interviewDetails.getInterviewStatus(),interviewDetails.getInterviewId()};
		resultCount = jdbcTemplate.update(UPDATE_INTERVIEW_DETAILS, args);
		if(resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteInterviewDetails(int interviewId) {
		Object [] args = {interviewId};
		resultCount = jdbcTemplate.update(DELETE_INTERVIEW_DETAILS, args);
		if (resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public InterviewDetails getInterviewDetailsByinterviewId(int interviewId) {
		Object[] args = {interviewId};
		InterviewDetails interviewDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_INTERVIEW_DETAILS, interviewDetailsRowMapper ,args );
		return interviewDetails;

		
	}

	@Override
	public List<InterviewDetails> getAllInterviewDetails() {
		List<InterviewDetails> allInterviewDetails = jdbcTemplate.query(SELECT_ALL_INTERVIEW_DETAILS, interviewDetailsRowMapper);
		return allInterviewDetails;
		
	}
	
	

}
