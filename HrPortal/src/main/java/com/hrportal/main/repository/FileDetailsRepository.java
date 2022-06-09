package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.FileDetails;

@Repository
public class FileDetailsRepository implements FileDetailsRepositoryInterface {

	@Autowired
	private FileDetailsRowMapper fileDetailsRowMapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
private int resultCount;
	
	private static String ADD_FILE_DETAILS = "INSERT INTO FILE_DETAILS (FILE_ID,CANDIDATE_ID,FILE_NAME,FILE_TYPE) VALUES (SEQ5_FILE_DETAILS.nextval,?,?,?)";
	private static String SELECT_ALL_FILE_DETAILS="SELECT * FROM FILE_DETAILS ";
	private static String SELECT_SINGLE_FILE_DETAILS="SELECT * FROM FILE_DETAILS WHERE FILE_ID = ?";
	private static String UPDATE_FILE_DETAILS = "UPDATE FILE_DETAILS SET CANDIDATE_ID = ?, FILE_NAME = ?,FILE_TYPE = ? WHERE FILE_ID = ?";
	public static String DELETE_FILE_DETAILS = "DELETE FILE_DETAILS WHERE FILE_ID = ?";
	
	
	
	@Override
	public boolean addFileDetails(FileDetails fileDetails) {
		Object [] args = {fileDetails.getCandidateDetails().getCandidateId(),fileDetails.getFileName(),fileDetails.getFileType()};
		resultCount = jdbcTemplate.update(ADD_FILE_DETAILS, args);
		if (resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public boolean updateFileDetails(FileDetails fileDetails) {
		Object [] args = {fileDetails.getCandidateDetails().getCandidateId(),fileDetails.getFileName(),fileDetails.getFileType(),fileDetails.getFileId()};
		resultCount = jdbcTemplate.update(UPDATE_FILE_DETAILS, args);
		if (resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public boolean deleteFileDetailsDetails(int fileId) {
		Object [] args = {fileId};
		resultCount = jdbcTemplate.update(DELETE_FILE_DETAILS, args);
		if(resultCount>0)
			return true;
		else
		return false;
	}

	@Override
	public FileDetails getFileDetailsByFileId(int fileId) {
		Object[] args = {fileId};
		FileDetails fileDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_FILE_DETAILS, fileDetailsRowMapper, args);
		return fileDetails;
	}

	@Override
	public List<FileDetails> getAllFileDetails() {
		List<FileDetails> allFileDetails = jdbcTemplate.query(SELECT_ALL_FILE_DETAILS, fileDetailsRowMapper);
		return allFileDetails;
	}

}
