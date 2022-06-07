package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.ProjectMaster;

public interface ProjectMasterRepositoryInterface {

	
	public boolean addNewProjectMaster(ProjectMaster projectMaster);
	public boolean updateProjectMaster(ProjectMaster projectMaster);
	public boolean deleteProjectMaster(int projectId);
	public ProjectMaster getProjectMasterById(int projectId );
	public List<ProjectMaster> getAllProjectMaster();
}
