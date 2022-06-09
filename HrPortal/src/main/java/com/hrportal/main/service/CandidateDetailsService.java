package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.repository.CandidateDetailsRepository;

@Service
public class CandidateDetailsService implements CandidateDetailsServiceInterface {

	@Autowired
	private CandidateDetailsRepository candidateDetailsRepository;
	@Override
	public boolean addCandidateDetails(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.addCandidateDetails(candidateDetails);
	}

	@Override
	public boolean updateCandidateDetails(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.updateCandidateDetails(candidateDetails);
	}

	@Override
	public boolean deleteCandidateDetailsDetails(int candidateId) {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.deleteCandidateDetailsDetails(candidateId);
	}

	@Override
	public CandidateDetails getCandidateDetailsByCandidateId(int candidateId) {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.getCandidateDetailsByCandidateId(candidateId);
	}


	@Override
	public List<CandidateDetails> getAllCandidateDetails() {
		// TODO Auto-generated method stub
		return candidateDetailsRepository.getAllCandidateDetails();
	}



}
