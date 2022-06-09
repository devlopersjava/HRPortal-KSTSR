package com.hrportal.main.pojo;

public class FileDetails {

	

	private int fileId;
	private String fileName;
	private String fileType;
	private CandidateDetails candidateDetails;
	
	public FileDetails() {
		// TODO Auto-generated constructor stub
	}

	public FileDetails(int fileId, String fileName, String fileType, CandidateDetails candidateDetails) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileType = fileType;
		this.candidateDetails = candidateDetails;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	@Override
	public String toString() {
		return "FileDetails [fileId=" + fileId + ", fileName=" + fileName + ", fileType=" + fileType
				+ ", candidateDetails=" + candidateDetails + "]";
	}
	

	
}
