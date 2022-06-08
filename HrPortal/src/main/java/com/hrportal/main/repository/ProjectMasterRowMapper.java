package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.ProjectMaster;
@Repository
public class ProjectMasterRowMapper implements RowMapper<ProjectMaster> {

	
	@Override
	public ProjectMaster mapRow(ResultSet resultSet, int i) throws SQLException {
		int projectId= resultSet.getInt("PROJECT_ID");
		String projectName= resultSet.getString("PROJECT_NAME");
		LocalDate startDate = resultSet.getDate("PROJECT_START_DATE").toLocalDate();
		LocalDate endDate = resultSet.getDate("PROJECT_END_DATE").toLocalDate();
		
		ProjectMaster projectMaster = new ProjectMaster(projectId, projectName,startDate,endDate);
		System.out.println(projectMaster);
		return projectMaster;
	}
}
