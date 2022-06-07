package com.hrportal.main.pojo;

import java.time.LocalDate;

public class EmployeeDetails {

	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String emailId;
	private long contactNo;
	private String gender;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private String designation;
	private String qualification;
	private String primarySkill1;
	private String primarySkill2;
	private String primarySkill3;
	private int mgrId;
	LoginDetails loginId;
	ProjectMaster projectId;
	
		public EmployeeDetails() {
			// TODO Auto-generated constructor stub
		}

		public EmployeeDetails(int employeeId, String firstName, String lastName, String emailId, long contactNo,
				String gender, LocalDate dateOfBirth, LocalDate dateOfJoining, String designation, String qualification,
				String primarySkill1, String primarySkill2, String primarySkill3, int mgrId, LoginDetails loginId,
				ProjectMaster projectId) {
			super();
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.contactNo = contactNo;
			this.gender = gender;
			this.dateOfBirth = dateOfBirth;
			this.dateOfJoining = dateOfJoining;
			this.designation = designation;
			this.qualification = qualification;
			this.primarySkill1 = primarySkill1;
			this.primarySkill2 = primarySkill2;
			this.primarySkill3 = primarySkill3;
			this.mgrId = mgrId;
			this.loginId = loginId;
			this.projectId = projectId;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
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

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public LocalDate getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(LocalDate dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
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

		public int getMgrId() {
			return mgrId;
		}

		public void setMgrId(int mgrId) {
			this.mgrId = mgrId;
		}

		public LoginDetails getLoginId() {
			return loginId;
		}

		public void setLoginId(LoginDetails loginId) {
			this.loginId = loginId;
		}

		public ProjectMaster getProjectId() {
			return projectId;
		}

		public void setProjectId(ProjectMaster projectId) {
			this.projectId = projectId;
		}

		@Override
		public String toString() {
			return "EmployeeDetails [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", emailId=" + emailId + ", contactNo=" + contactNo + ", gender=" + gender + ", dateOfBirth="
					+ dateOfBirth + ", dateOfJoining=" + dateOfJoining + ", designation=" + designation
					+ ", qualification=" + qualification + ", primarySkill1=" + primarySkill1 + ", primarySkill2="
					+ primarySkill2 + ", primarySkill3=" + primarySkill3 + ", mgrId=" + mgrId + ", loginId=" + loginId
					+ ", projectId=" + projectId + "]";
		}
		
		
}
