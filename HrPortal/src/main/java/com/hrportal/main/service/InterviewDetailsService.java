package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.InterviewDetails;
import com.hrportal.main.repository.InterviewDetailsRepositoryInterface;
@Service
public class InterviewDetailsService implements InterviewDetailsServiceInterface{
	@Autowired
	private InterviewDetailsRepositoryInterface interviewDetailsRepository; 

	@Override
	public boolean addInterviewDetails(InterviewDetails interviewDetails) {
		// TODO Auto-generated method stub
		return interviewDetailsRepository.addInterviewDetails(interviewDetails);
	}

	@Override
	public boolean updateInterviewDetails(InterviewDetails interviewDetails) {
		// TODO Auto-generated method stub
		return interviewDetailsRepository.updateInterviewDetails(interviewDetails);
	}

	@Override
	public boolean deleteInterviewDetails(int interviewId) {
		// TODO Auto-generated method stub
		return interviewDetailsRepository.deleteInterviewDetails(interviewId);
	}

	@Override
	public InterviewDetails getInterviewDetailsByinterviewId(int interviewId) {
		// TODO Auto-generated method stub
		return interviewDetailsRepository.getInterviewDetailsByinterviewId(interviewId);
	}

	@Override
	public List<InterviewDetails> getAllInterviewDetails() {
		// TODO Auto-generated method stub
		return interviewDetailsRepository.getAllInterviewDetails();
	}

}
