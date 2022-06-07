package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.pojo.RequirementDetails;
import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.service.RequirementDetailsServiceInterface;
import com.hrportal.main.service.ProjectMasterServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("jobrequestdetails")
public class RequirementDetailsController {
	
	@Autowired
	private RequirementDetailsServiceInterface jobRequestDetailsService;
	
	@RequestMapping(value = "jobrequestdetail", method =RequestMethod.GET)
	public @ResponseBody List<RequirementDetails> getAllJobRequestDetails() {
		return jobRequestDetailsService.getAllJobRequestDetails();
	}
	

	@RequestMapping(value= "/jobrequestdetail/{jobId}", method= RequestMethod.GET)
	public @ResponseBody RequirementDetails getProjectMasterById(@PathVariable("jobId") int jobId){
		return jobRequestDetailsService.getJobRequestDetailsByJobId(jobId);
	}

}
