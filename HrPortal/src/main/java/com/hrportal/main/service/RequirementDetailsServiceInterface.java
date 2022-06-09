package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.RequirementDetails;

public interface RequirementDetailsServiceInterface {

	public boolean addRequirmentDetails(RequirementDetails requirementDetails);
	public boolean updateRequirmentDetails(RequirementDetails requirementDetails);
	public boolean deleteRequirmentDetailsDetails(int jobId);
	public RequirementDetails getRequirmentDetailsByJobId(int jobId);
	public  List<RequirementDetails> getAllRequirmentDetails();
	public List<RequirementDetails> getSingleRequestByProjectId(int projectId);

}
