package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.RequirementDetails;

public interface RequirementDetailsServiceInterface {

	public boolean addJobRequestDetails(RequirementDetails requirementDetails);
	public boolean updateJobRequestDetails(RequirementDetails requirementDetails);
	public boolean deleteJobRequestDetailsDetails(int jobId);
	public RequirementDetails getJobRequestDetailsByJobId(int jobId);
	public  List<RequirementDetails> getAllJobRequestDetails();

}
