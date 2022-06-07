package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.ProjectMaster;

@Repository
public class CandidateDetailsRepository implements CandidateDetailsRepositoryInterface {
	
	@Autowired
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private CandidateDetailsRowMapper candidateDetailsRowMapper;
	
	private static String SELECT_ALL_CANDIDATE_DETAILS="SELECT * FROM CANDIDATE_DETAILS ";
	private static String SELECT_SINGLE_CANDIDATE_DETAILS="SELECT * FROM CANDIDATE_DETAILS WHERE CANDIDATE_ID = ?";

	@Override
	public boolean addCandidateDetails(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCandidateDetails(CandidateDetails candidateDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCandidateDetailsDetails(int candidateId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CandidateDetails getCandidateDetailsByCandidateId(int candidateId) {
		Object[] args = { candidateId };
		CandidateDetails candidateDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_CANDIDATE_DETAILS, candidateDetailsRowMapper, args);
		return candidateDetails;
	}

	@Override
	public List<CandidateDetails> getAllCandidateDetails() {
		List<CandidateDetails> allCandidateDetails = jdbcTemplate.query(SELECT_ALL_CANDIDATE_DETAILS, candidateDetailsRowMapper);
		return allCandidateDetails;
	}

}
