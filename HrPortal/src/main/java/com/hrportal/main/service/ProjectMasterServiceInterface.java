package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.ProjectMaster;

public interface ProjectMasterServiceInterface {

	
	public boolean addNewProjectMaster(ProjectMaster projectMaster);
	public boolean updateProjectMaster(ProjectMaster projectMaster);
	public boolean deleteProjectMaster(int projectId);
	public ProjectMaster getProjectMasterById(int projectId );
	public List<ProjectMaster> getAllProjectMaster();

}
