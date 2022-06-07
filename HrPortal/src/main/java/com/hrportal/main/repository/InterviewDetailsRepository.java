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
	
	private static String SELECT_SINGLE_INTERVIEW_DETAILS="SELECT * FROM INTERVIEW_DETAILS WHERE INTERVIEW_ID = ?";
	private static String SELECT_ALL_INTERVIEW_DETAILS="SELECT * FROM INTERVIEW_DETAILS ";
	
	
	@Override
	public boolean addInterviewDetails(InterviewDetails interviewDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateInterviewDetails(InterviewDetails interviewDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteInterviewDetails(int interviewId) {
		// TODO Auto-generated method stub
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
