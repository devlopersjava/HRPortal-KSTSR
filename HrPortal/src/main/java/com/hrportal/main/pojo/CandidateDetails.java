package com.hrportal.main.pojo;

import java.time.LocalDate;

public class CandidateDetails {

	private int candidateId;
	private LocalDate applicationDate; 
	private String firstName;
	private String lastName;
	private String emailId;
	private long contactNo;
	private LocalDate dateOfBirth;
	private String qualification;
	private int experience;
	private String primarySkill1;
	private String primarySkill2;
	private String primarySkill3;
	private String applicationStatus;
	private int fileId;
	private RequirementDetails requirementDetails;

public CandidateDetails() {
	// TODO Auto-generated constructor stub
}

public CandidateDetails(int candidateId, LocalDate applicationDate, String firstName, String lastName, String emailId,
		long contactNo, LocalDate dateOfBirth, String qualification, int experience, String primarySkill1,
		String primarySkill2, String primarySkill3, String applicationStatus, int fileId,
		RequirementDetails requirementDetails) {
	super();
	this.candidateId = candidateId;
	this.applicationDate = applicationDate;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.contactNo = contactNo;
	this.dateOfBirth = dateOfBirth;
	this.qualification = qualification;
	this.experience = experience;
	this.primarySkill1 = primarySkill1;
	this.primarySkill2 = primarySkill2;
	this.primarySkill3 = primarySkill3;
	this.applicationStatus = applicationStatus;
	this.fileId = fileId;
	this.requirementDetails = requirementDetails;
}

public int getCandidateId() {
	return candidateId;
}

public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}

public LocalDate getApplicationDate() {
	return applicationDate;
}

public void setApplicationDate(LocalDate applicationDate) {
	this.applicationDate = applicationDate;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

public String getPrimarySkill1() {
	return primarySkill1;
}

public void setPrimarySkill1(String primarySkill1) {
	this.primarySkill1 = primarySkill1;
}

public String getPrimarySkill2() {
	return primarySkill2;
}

public void setPrimarySkill2(String primarySkill2) {
	this.primarySkill2 = primarySkill2;
}

public String getPrimarySkill3() {
	return primarySkill3;
}

public void setPrimarySkill3(String primarySkill3) {
	this.primarySkill3 = primarySkill3;
}

public String getApplicationStatus() {
	return applicationStatus;
}

public void setApplicationStatus(String applicationStatus) {
	this.applicationStatus = applicationStatus;
}

public int getFileId() {
	return fileId;
}

public void setFileId(int fileId) {
	this.fileId = fileId;
}

public RequirementDetails getRequirementDetails() {
	return requirementDetails;
}

public void setRequirementDetails(RequirementDetails requirementDetails) {
	this.requirementDetails = requirementDetails;
}

@Override
public String toString() {
	return "CandidateDetails [candidateId=" + candidateId + ", applicationDate=" + applicationDate + ", firstName="
			+ firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", contactNo=" + contactNo
			+ ", dateOfBirth=" + dateOfBirth + ", qualification=" + qualification + ", experience=" + experience
			+ ", primarySkill1=" + primarySkill1 + ", primarySkill2=" + primarySkill2 + ", primarySkill3="
			+ primarySkill3 + ", applicationStatus=" + applicationStatus + ", fileId=" + fileId
			+ ", requirementDetails=" + requirementDetails + "]";
}



}

