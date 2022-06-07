package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.RequirementDetails;
import com.hrportal.main.repository.RequirementDetailsRepositoryInterface;

@Service
public class RequirementDetailsService implements RequirementDetailsServiceInterface{
	
	@Autowired
	private RequirementDetailsRepositoryInterface jobRequestDetailsRepository;
	@Override
	public boolean addJobRequestDetails(RequirementDetails requirementDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateJobRequestDetails(RequirementDetails requirementDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteJobRequestDetailsDetails(int jobId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RequirementDetails getJobRequestDetailsByJobId(int jobId) {
		// TODO Auto-generated method stub
		return jobRequestDetailsRepository.getJobRequestDetailsByJobId(jobId);
	}

	@Override
	public List<RequirementDetails> getAllJobRequestDetails() {
		// TODO Auto-generated method stub
		return jobRequestDetailsRepository.getAllJobRequestDetails();
	}

}
