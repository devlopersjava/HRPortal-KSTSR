package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.repository.ProjectMasterRepositoryInterface;

@Service
public class ProjectMasterService implements ProjectMasterServiceInterface {

	
	@Autowired
	private ProjectMasterRepositoryInterface projectMasterRepository;
	
	@Override
	public boolean addNewProjectMaster(ProjectMaster projectMaster) {
		
		return projectMasterRepository.addNewProjectMaster(projectMaster);
	}

	@Override
	public boolean updateProjectMaster(ProjectMaster projectMaster) {
		
		return projectMasterRepository.updateProjectMaster(projectMaster);
	}

	@Override
	public boolean deleteProjectMaster(int projectId) {
		return projectMasterRepository.deleteProjectMaster(projectId);
	}

	@Override
	public ProjectMaster getProjectMasterById(int projectId) {
		return projectMasterRepository.getProjectMasterById(projectId);
	}

	@Override
	public List<ProjectMaster> getAllProjectMaster() {
		return projectMasterRepository.getAllProjectMaster();
	}

}
