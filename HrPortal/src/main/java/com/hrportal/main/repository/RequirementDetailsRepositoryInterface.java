package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.RequirementDetails;

public interface RequirementDetailsRepositoryInterface {


	public boolean addRequirmentDetails(RequirementDetails requirementDetails);
	public boolean updateRequirmentDetails(RequirementDetails requirementDetails);
	public boolean deleteRequirmentDetailsDetails(int jobId);
	public RequirementDetails getRequirmentDetailsByJobId(int jobId);
	public  List<RequirementDetails> getAllRequirmentDetails();
}
