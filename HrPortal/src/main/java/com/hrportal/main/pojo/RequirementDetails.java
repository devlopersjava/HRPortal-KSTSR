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
	private EmployeeDetails employeeDetails;
	private ProjectMaster projectMaster;
	
	public RequirementDetails() {
		// TODO Auto-generated constructor stub
	}

	public RequirementDetails(int jobId, String qualification, String primarySkill1, String primarySkill2,
			String primarySkill3, String jobRequestStatus, int experience, int requiredNoOfEmployees, EmployeeDetails employeeDetails,
			ProjectMaster projectMaster) {
		super();
		this.jobId = jobId;
		this.qualification = qualification;
		this.primarySkill1 = primarySkill1;
		this.primarySkill2 = primarySkill2;
		this.primarySkill3 = primarySkill3;
		this.jobRequestStatus = jobRequestStatus;
		this.experience = experience;
		this.requiredNoOfEmployees = requiredNoOfEmployees;

		this.employeeDetails = employeeDetails;
		this.projectMaster = projectMaster;
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


	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public ProjectMaster getProjectMaster() {
		return projectMaster;
	}

	public void setProjectMaster(ProjectMaster projectMaster) {
		this.projectMaster = projectMaster;
	}

	@Override
	public String toString() {
		return "RequirementDetails [jobId=" + jobId + ", qualification=" + qualification + ", primarySkill1="
				+ primarySkill1 + ", primarySkill2=" + primarySkill2 + ", primarySkill3=" + primarySkill3
				+ ", jobRequestStatus=" + jobRequestStatus + ", experience=" + experience + ", requiredNoOfEmployees="
				+ requiredNoOfEmployees + ", employeeDetails=" + employeeDetails + ", projectMaster=" + projectMaster
				+ "]";
	}


	
	
	
	
}
