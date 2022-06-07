package com.hrportal.main.pojo;

public class FileDetails {

	

	private int fileId;
	private String fileName;
	private String fileType;
	CandidateDetails candidateId;
	
	public FileDetails() {
		// TODO Auto-generated constructor stub
	}

	public FileDetails(int fileId, String fileName, String fileType, CandidateDetails candidateId) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileType = fileType;
		this.candidateId = candidateId;
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

	public CandidateDetails getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(CandidateDetails candidateId) {
		this.candidateId = candidateId;
	}

	@Override
	public String toString() {
		return "FileDetails [fileId=" + fileId + ", fileName=" + fileName + ", fileType=" + fileType + ", candidateId="
				+ candidateId + "]";
	}
	
	
}
