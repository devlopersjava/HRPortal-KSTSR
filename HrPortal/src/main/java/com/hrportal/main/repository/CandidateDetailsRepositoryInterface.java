package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.CandidateDetails;

public interface CandidateDetailsRepositoryInterface {
	public boolean addCandidateDetails(CandidateDetails candidateDetails);
	public boolean updateCandidateDetails(CandidateDetails candidateDetails);
	public boolean deleteCandidateDetailsDetails(int candidateId);
	public CandidateDetails getCandidateDetailsByCandidateId(int candidateId);
	public  List<CandidateDetails> getAllCandidateDetails();
}
