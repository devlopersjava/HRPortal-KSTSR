package com.hrportal.main.pojo;

public class InterviewDetails {

	private int interviewId;
	private int aptitudeRound;
	private int technicalRound;
	private int hrRound;
	private String remarks;
	private String interviewStatus;
	EmployeeDetails interviewerId;
	CandidateDetails candidateId;
	
	public InterviewDetails() {
		// TODO Auto-generated constructor stub
	}

	public InterviewDetails(int interviewId, int aptitudeRound, int technicalRound, int hrRound, String remarks,
			String interviewStatus, EmployeeDetails interviewerId, CandidateDetails candidateId) {
		super();
		this.interviewId = interviewId;
		this.aptitudeRound = aptitudeRound;
		this.technicalRound = technicalRound;
		this.hrRound = hrRound;
		this.remarks = remarks;
		this.interviewStatus = interviewStatus;
		this.interviewerId = interviewerId;
		this.candidateId = candidateId;
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

	public EmployeeDetails getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(EmployeeDetails interviewerId) {
		this.interviewerId = interviewerId;
	}

	public CandidateDetails getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(CandidateDetails candidateId) {
		this.candidateId = candidateId;
	}

	@Override
	public String toString() {
		return "InterviewDetails [interviewId=" + interviewId + ", aptitudeRound=" + aptitudeRound + ", technicalRound="
				+ technicalRound + ", hrRound=" + hrRound + ", remarks=" + remarks + ", interviewStatus="
				+ interviewStatus + ", interviewerId=" + interviewerId + ", candidateId=" + candidateId + "]";
	}
	
	
	
	
	
	
	
	
}
