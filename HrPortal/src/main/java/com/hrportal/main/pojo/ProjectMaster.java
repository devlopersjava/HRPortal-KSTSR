package com.hrportal.main.pojo;

import java.time.LocalDate;

public class ProjectMaster {

	private int projectId;
	private String projectName;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public ProjectMaster() {
		// TODO Auto-generated constructor stub
	}

	public ProjectMaster(int projectId, String projectName, LocalDate startDate, LocalDate endDate) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProjectMaster [projectId=" + projectId + ", projectName=" + projectName + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}

	
}
