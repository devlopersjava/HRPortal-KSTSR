package com.hrportal.main.pojo;

public class InterviewDetails {

	private int interviewId;
	private int aptitudeRound;
	private int technicalRound;
	private int hrRound;
	private String remarks;
	private String interviewStatus;
	private EmployeeDetails employeeDetails;
	private CandidateDetails candidateDetails;
	
	public InterviewDetails() {
		// TODO Auto-generated constructor stub
	}

	public InterviewDetails(int interviewId, int aptitudeRound, int technicalRound, int hrRound, String remarks,
			String interviewStatus, EmployeeDetails employeeDetails, CandidateDetails candidateDetails) {
		super();
		this.interviewId = interviewId;
		this.aptitudeRound = aptitudeRound;
		this.technicalRound = technicalRound;
		this.hrRound = hrRound;
		this.remarks = remarks;
		this.interviewStatus = interviewStatus;
		this.employeeDetails = employeeDetails;
		this.candidateDetails = candidateDetails;
	}

	public int getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}

	public int getAptitudeRound() {
		return aptitudeRound;
	}

	public void setAptitudeRound(int aptitudeRound) {
		this.aptitudeRound = aptitudeRound;
	}

	public int getTechnicalRound() {
		return technicalRound;
	}

	public void setTechnicalRound(int technicalRound) {
		this.technicalRound = technicalRound;
	}

	public int getHrRound() {
		return hrRound;
	}

	public void setHrRound(int hrRound) {
		this.hrRound = hrRound;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	@Override
	public String toString() {
		return "InterviewDetails [interviewId=" + interviewId + ", aptitudeRound=" + aptitudeRound + ", technicalRound="
				+ technicalRound + ", hrRound=" + hrRound + ", remarks=" + remarks + ", interviewStatus="
				+ interviewStatus + ", employeeDetails=" + employeeDetails + ", candidateDetails=" + candidateDetails
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
