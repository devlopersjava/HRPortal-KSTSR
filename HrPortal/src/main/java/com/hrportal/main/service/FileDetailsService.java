package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.FileDetails;
import com.hrportal.main.repository.FileDetailsRepository;
import com.hrportal.main.repository.FileDetailsRepositoryInterface;

@Service
public class FileDetailsService implements FileDetailsServiceInterface {

	@Autowired
	private FileDetailsRepositoryInterface fileDetailsRepository;
	@Override
	public boolean addFileDetails(FileDetails fileDetails) {
		// TODO Auto-generated method stub
		return fileDetailsRepository.addFileDetails(fileDetails);
	}

	@Override
	public boolean updateFileDetails(FileDetails fileDetails) {
		// TODO Auto-generated method stub
		return fileDetailsRepository.updateFileDetails(fileDetails);
	}

	@Override
	public boolean deleteFileDetailsDetails(int fileId) {
		// TODO Auto-generated method stub
		return fileDetailsRepository.deleteFileDetailsDetails(fileId);
	}

	@Override
	public FileDetails getFileDetailsByFileId(int fileId) {
		// TODO Auto-generated method stub
		return fileDetailsRepository.getFileDetailsByFileId(fileId);
	}

	@Override
	public List<FileDetails> getAllFileDetails() {
		// TODO Auto-generated method stub
		return fileDetailsRepository.getAllFileDetails();
	}

}
