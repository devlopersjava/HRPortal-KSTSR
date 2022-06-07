package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.service.CandidateDetailsServiceInterface;
import com.hrportal.main.service.ProjectMasterServiceInterface;

@RestController
//@CrossOrigin (origins = "*")
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("candidatedetails")
public class CandidateDetailsController {

	
	@Autowired
	private CandidateDetailsServiceInterface candidateDetailsService;
	
	@RequestMapping(value= "/candidatedetail/{candidateid}", method= RequestMethod.GET)
	public @ResponseBody CandidateDetails getCandidateDetailsByCandidateId(@PathVariable("candidateId") int candidateId){
		return candidateDetailsService.getCandidateDetailsByCandidateId(candidateId);
	}
		@RequestMapping(value = "candidatedetail", method =RequestMethod.GET)
		public @ResponseBody List<CandidateDetails> getAllCandidateDetails() {
			return candidateDetailsService.getAllCandidateDetails();
	}
}
