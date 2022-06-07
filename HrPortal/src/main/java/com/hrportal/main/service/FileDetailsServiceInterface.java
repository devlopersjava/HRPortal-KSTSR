package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.FileDetails;

public interface FileDetailsServiceInterface {

	
	public boolean addFileDetails(FileDetails fileDetails);
	public boolean updateFileDetails(FileDetails fileDetails);
	public boolean deleteFileDetailsDetails(int fileId);
	public FileDetails getFileDetailsByFileId(int fileId);
	public  List<FileDetails> getAllFileDetails();
}
