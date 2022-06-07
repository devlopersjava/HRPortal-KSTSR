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
	
	private static String SELECT_ALL_FILE_DETAILS="SELECT * FROM FILE_DETAILS ";
	private static String SELECT_SINGLE_FILE_DETAILS="SELECT * FROM FILE_DETAILS WHERE FILE_ID = ?";
	
	
	@Override
	public boolean addFileDetails(FileDetails fileDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateFileDetails(FileDetails fileDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFileDetailsDetails(int fileId) {
		// TODO Auto-generated method stub
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
