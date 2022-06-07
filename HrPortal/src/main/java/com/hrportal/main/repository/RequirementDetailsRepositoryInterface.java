package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.RequirementDetails;

public interface RequirementDetailsRepositoryInterface {

	
	public boolean addJobRequestDetails(RequirementDetails jobRquestDetails);
	public boolean updateJobRequestDetails(RequirementDetails jobRquestDetails);
	public boolean deleteJobRequestDetailsDetails(int jobId);
	public RequirementDetails getJobRequestDetailsByJobId(int jobId);
	public  List<RequirementDetails> getAllJobRequestDetails();
}
