package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.FileDetails;
import com.hrportal.main.pojo.LoginDetails;

@Component
public class FileDetailsRowMapper implements RowMapper<FileDetails> {
	
	@Autowired
	CandidateDetailsRepository candidateDetailsRepository;

	
	@Override
	public FileDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int fileId = resultSet.getInt("FILE_ID");
		String fileName= resultSet.getString("FILE_NAME");
	     String fileType = resultSet.getString("FILE_TYPE");
	     
		int candidateId= resultSet.getInt("CANDIDATE_ID") ;
		CandidateDetails candidateDetails= candidateDetailsRepository.getCandidateDetailsByCandidateId(candidateId);
		
		
		FileDetails fileDetails = new FileDetails(fileId, fileName, fileType, candidateDetails);
		return fileDetails;
		
	}

}
