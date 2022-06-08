package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.RequirementDetails;
import com.hrportal.main.repository.RequirementDetailsRepositoryInterface;

@Service
public class RequirementDetailsService implements RequirementDetailsServiceInterface{
	
	@Autowired
	private RequirementDetailsRepositoryInterface requirementDetailsRepositoryInterface;

	@Override
	public boolean addRequirmentDetails(RequirementDetails requirementDetails) {
		// TODO Auto-generated method stub
		return requirementDetailsRepositoryInterface.addRequirmentDetails(requirementDetails);
	}

	@Override
	public boolean updateRequirmentDetails(RequirementDetails requirementDetails) {
		// TODO Auto-generated method stub
		return requirementDetailsRepositoryInterface.updateRequirmentDetails(requirementDetails);
	}

	@Override
	public boolean deleteRequirmentDetailsDetails(int jobId) {
		// TODO Auto-generated method stub
		return requirementDetailsRepositoryInterface.deleteRequirmentDetailsDetails(jobId);
	}

	@Override
	public RequirementDetails getRequirmentDetailsByJobId(int jobId) {
		// TODO Auto-generated method stub
		return requirementDetailsRepositoryInterface.getRequirmentDetailsByJobId(jobId);
	}

	@Override
	public List<RequirementDetails> getAllRequirmentDetails() {
		// TODO Auto-generated method stub
		return requirementDetailsRepositoryInterface.getAllRequirmentDetails();
	}





}