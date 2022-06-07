package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.InterviewDetails;

public interface InterviewDetailsServiceInterface {

	
	public boolean addInterviewDetails(InterviewDetails interviewDetails);
	public boolean updateInterviewDetails(InterviewDetails interviewDetails);
	public boolean deleteInterviewDetails(int interviewId);
	public InterviewDetails getInterviewDetailsByinterviewId(int interviewId);
	public  List<InterviewDetails> getAllInterviewDetails();

}
