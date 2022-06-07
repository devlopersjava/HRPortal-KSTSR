package com.hrportal.main.pojo;

public class RequirementDetails {

	
	private int jobId;
	private String qualification;
	private String primarySkill1;
	private String primarySkill2;
	private String primarySkill3;
	private String jobRequestStatus;
	private int experience;
	private int requiredNoOfEmployees;
	private int availableEmployees;
	private int requiredNoOfCandidates;
	EmployeeDetails employeeId;
	ProjectMaster projectId;
	
	public RequirementDetails() {
		// TODO Auto-generated constructor stub
	}

	public RequirementDetails(int jobId, String qualification, String primarySkill1, String primarySkill2,
			String primarySkill3, String jobRequestStatus, int experience, int requiredNoOfEmployees,
			int availableEmployees, int requiredNoOfCandidates, EmployeeDetails employeeId, ProjectMaster projectId) {
		super();
		this.jobId = jobId;
		this.qualification = qualification;
		this.primarySkill1 = primarySkill1;
		this.primarySkill2 = primarySkill2;
		this.primarySkill3 = primarySkill3;
		this.jobRequestStatus = jobRequestStatus;
		this.experience = experience;
		this.requiredNoOfEmployees = requiredNoOfEmployees;
		this.availableEmployees = availableEmployees;
		this.requiredNoOfCandidates = requiredNoOfCandidates;
		this.employeeId = employeeId;
		this.projectId = projectId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
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

	public String getJobRequestStatus() {
		return jobRequestStatus;
	}

	public void setJobRequestStatus(String jobRequestStatus) {
		this.jobRequestStatus = jobRequestStatus;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getRequiredNoOfEmployees() {
		return requiredNoOfEmployees;
	}

	public void setRequiredNoOfEmployees(int requiredNoOfEmployees) {
		this.requiredNoOfEmployees = requiredNoOfEmployees;
	}

	public int getAvailableEmployees() {
		return availableEmployees;
	}

	public void setAvailableEmployees(int availableEmployees) {
		this.availableEmployees = availableEmployees;
	}

	public int getRequiredNoOfCandidates() {
		return requiredNoOfCandidates;
	}

	public void setRequiredNoOfCandidates(int requiredNoOfCandidates) {
		this.requiredNoOfCandidates = requiredNoOfCandidates;
	}

	public EmployeeDetails getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(EmployeeDetails employeeId) {
		this.employeeId = employeeId;
	}

	public ProjectMaster getProjectId() {
		return projectId;
	}

	public void setProjectId(ProjectMaster projectId) {
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "RequirementDetails [jobId=" + jobId + ", qualification=" + qualification + ", primarySkill1="
				+ primarySkill1 + ", primarySkill2=" + primarySkill2 + ", primarySkill3=" + primarySkill3
				+ ", jobRequestStatus=" + jobRequestStatus + ", experience=" + experience + ", requiredNoOfEmployees="
				+ requiredNoOfEmployees + ", availableEmployees=" + availableEmployees + ", requiredNoOfCandidates="
				+ requiredNoOfCandidates + ", employeeId=" + employeeId + ", projectId=" + projectId + "]";
	}
	
	
	
	
}
