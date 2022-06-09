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
	private int resultCount;
	
	@Autowired
	private CandidateDetailsRowMapper candidateDetailsRowMapper;
	
	private static String SELECT_ALL_CANDIDATE_DETAILS="SELECT * FROM CANDIDATE_DETAILS ";
	private static String SELECT_SINGLE_CANDIDATE_DETAILS="SELECT * FROM CANDIDATE_DETAILS WHERE CANDIDATE_ID = ?";
	
	private static String INSERT_CANDIDATE_DETAILS="INSERT INTO CANDIDATE_DETAILS(CANDIDATE_ID,JOB_ID,APPLICATION_DATE,FIRST_NAME"
			+ ",LAST_NAME,EMAIL_ID,CONTACT_NO,DATE_OF_BIRTH,QUALIFICATION,EXPERIENCE,PRIMARY_SKILL_1,PRIMARY_SKILL_2,"
			+ "PRIMARY_SKILL_3,APPLICATION_STATUS,FILE_ID) VALUES(SEQ4_CANDIDATE_DETAILS.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
	
	private static String UPDATE_CANDIDATE_DETAILS = "UPDATE CANDIDATE_DETAILS SET JOB_ID = ?,APPLICATION_DATE = ?,FIRST_NAME = ?,"
			+ "LAST_NAME = ?,EMAIL_ID = ?,CONTACT_NO = ?,DATE_OF_BIRTH = ?,QUALIFICATION = ?,EXPERIENCE = ?,PRIMARY_SKILL_1 = ?"
			+ ",PRIMARY_SKILL_2 = ?,PRIMARY_SKILL_3 = ?,APPLICATION_STATUS = ?,FILE_ID = ? WHERE CANDIDATE_ID=? ";
	private static String DELETE_CANDIDATE_DETAILS = "DELETE CANDIDATE_DETAILS WHERE CANDIDATE_ID = ?";
	@Override
	public boolean addCandidateDetails(CandidateDetails candidateDetails) {
		Object [] args = {candidateDetails.getRequirementDetails().getJobId(),candidateDetails.getApplicationDate(),
				candidateDetails.getFirstName(),candidateDetails.getLastName(),candidateDetails.getEmailId(),candidateDetails.getContactNo(),
				candidateDetails.getDateOfBirth(),candidateDetails.getQualification(),candidateDetails.getExperience(),
				candidateDetails.getPrimarySkill1(),candidateDetails.getPrimarySkill2(),candidateDetails.getPrimarySkill3(),
				candidateDetails.getApplicationStatus(),candidateDetails.getFileId()};
		resultCount=jdbcTemplate.update(INSERT_CANDIDATE_DETAILS, args);
		if (resultCount>0)
			return true;
		else
			return false;
	}
	@Override
	public boolean updateCandidateDetails(CandidateDetails candidateDetails) {
		Object[]args = {candidateDetails.getRequirementDetails().getJobId(),candidateDetails.getApplicationDate()
				,candidateDetails.getFirstName(),candidateDetails.getLastName(),candidateDetails.getEmailId(),candidateDetails.getContactNo(),
				candidateDetails.getDateOfBirth(),candidateDetails.getQualification(),candidateDetails.getExperience()
				,candidateDetails.getPrimarySkill1(),candidateDetails.getPrimarySkill2(),
				candidateDetails.getPrimarySkill3(),candidateDetails.getApplicationStatus(),candidateDetails.getFileId(),candidateDetails.getCandidateId()};
		resultCount = jdbcTemplate.update(UPDATE_CANDIDATE_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteCandidateDetailsDetails(int candidateId) {
		Object[] args = { candidateId};
		resultCount = jdbcTemplate.update(DELETE_CANDIDATE_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
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
