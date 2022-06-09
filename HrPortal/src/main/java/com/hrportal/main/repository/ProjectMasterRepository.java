package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.ProjectMaster;

@Repository
public class ProjectMasterRepository implements ProjectMasterRepositoryInterface {

	
	@Autowired
	private ProjectMasterRowMapper projectMasterRowMapper;
	@Autowired
private JdbcTemplate jdbcTemplate;
	

	
private static String INSERT_PROJECT_MASTER = "INSERT INTO PROJECT_MASTER(PROJECT_ID,PROJECT_NAME,PROJECT_START_DATE,PROJECT_END_DATE)"
		+ " VALUES(SEQ1_PROJECT_MASTER.nextval,?,?,?)";
private static String SELECT_ALL_PROJECT_MASTER="SELECT* FROM PROJECT_MASTER ";
private static String SELECT_SINGLE_PROJECT_MASTER="SELECT * FROM PROJECT_MASTER WHERE PROJECT_ID = ?";
private static String UPDATE_PROJECT_MASTER="UPDATE PROJECT_MASTER SET PROJECT_NAME = ?,PROJECT_START_DATE=?,PROJECT_END_DATE=? WHERE PROJECT_ID = ?";
private static String DELETE_PROJECT_MASTER="DELETE PROJECT_MASTER WHERE PROJECT_ID = ?";
private int resultCount;


	@Override
	public boolean addNewProjectMaster(ProjectMaster projectMaster) {
		Object[] args = { projectMaster.getProjectName(),projectMaster.getStartDate(),projectMaster.getEndDate()};
		resultCount = jdbcTemplate.update(INSERT_PROJECT_MASTER, args);
		if (resultCount > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateProjectMaster(ProjectMaster projectMaster) {
		Object[] args = {projectMaster.getProjectName(),projectMaster.getStartDate(),projectMaster.getEndDate(),projectMaster.getProjectId()};
		resultCount = jdbcTemplate.update(UPDATE_PROJECT_MASTER, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteProjectMaster(int projectId) {
		Object[] args = { projectId};
		resultCount = jdbcTemplate.update(DELETE_PROJECT_MASTER, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public ProjectMaster getProjectMasterById(int projectId) {

		Object[] args = { projectId };
		ProjectMaster projectMaster = jdbcTemplate.queryForObject(SELECT_SINGLE_PROJECT_MASTER, projectMasterRowMapper, args);
		return projectMaster;
	}

	@Override
	public List<ProjectMaster> getAllProjectMaster() {
		List<ProjectMaster> allProjectMasters = jdbcTemplate.query(SELECT_ALL_PROJECT_MASTER, projectMasterRowMapper);
		return allProjectMasters;
	}

}
