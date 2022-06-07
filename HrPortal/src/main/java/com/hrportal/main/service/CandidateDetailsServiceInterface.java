package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.CandidateDetails;


public interface CandidateDetailsServiceInterface {
	
	public boolean addCandidateDetails(CandidateDetails candidateDetails);
	public boolean updateCandidateDetails(CandidateDetails candidateDetails);
	public boolean deleteCandidateDetailsDetails(int candidateId);
	public CandidateDetails getCandidateDetailsByCandidateId(int candidateId);
	public  List<CandidateDetails> getAllCandidateDetails();

}
