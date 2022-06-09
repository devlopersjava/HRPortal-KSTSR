package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.InterviewDetails;
import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.service.InterviewDetailsServiceInterface;
import com.hrportal.main.service.ProjectMasterServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("interviewdetails")
public class InterviewDetailsController {
	
	@Autowired
	private InterviewDetailsServiceInterface interviewDetailsService;
	

	@RequestMapping(value= "/interviewdetail/{interviewId}", method= RequestMethod.GET)
	public @ResponseBody InterviewDetails getProjectMasterById(@PathVariable("interviewId") int interviewId){
		return interviewDetailsService.getInterviewDetailsByinterviewId(interviewId);
	}
	
	@RequestMapping(value = "interviewdetail", method =RequestMethod.GET)
	public @ResponseBody List<InterviewDetails> getAllInterviewDetails() {
		return interviewDetailsService.getAllInterviewDetails();
	}
	@RequestMapping(value= "/interviewdetail", method= RequestMethod.PUT)
	public boolean updateInterviewDetails(@RequestBody InterviewDetails interviewDetails){
		return interviewDetailsService.updateInterviewDetails(interviewDetails);
	}
	@RequestMapping(value= "/interviewdetail/{interviewid}", method= RequestMethod.DELETE)
	public boolean deleteInterviewDetails(@PathVariable("interviewid")  int interviewId){
		 return interviewDetailsService.deleteInterviewDetails(interviewId);
	}
	@RequestMapping(value = "/interviewdetail", method = RequestMethod.POST)
	public boolean addInterviewDetails(@RequestBody InterviewDetails interviewDetails) {
		return  interviewDetailsService.addInterviewDetails(interviewDetails);
	}

}
