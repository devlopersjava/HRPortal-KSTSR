package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.service.ProjectMasterServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("projectmasterdetails")
public class ProjectMasterController {
	
	@Autowired
	private ProjectMasterServiceInterface projectMasterService;
	
	@RequestMapping(value = "projectmaster", method =RequestMethod.POST)
	public boolean addNewProjectMaster(@RequestBody ProjectMaster projectMaster) {
		return projectMasterService.addNewProjectMaster(projectMaster);
	}
	
	@RequestMapping(value = "projectmaster", method =RequestMethod.GET)
	public @ResponseBody List<ProjectMaster> getAllProjectMaster() {
		return projectMasterService.getAllProjectMaster();
	}
	
	@RequestMapping(value= "/projectmaster/{projectId}", method= RequestMethod.GET)
	public @ResponseBody ProjectMaster getProjectMasterById(@PathVariable("projectId") int projectId){
		return projectMasterService.getProjectMasterById(projectId);
	}
	
	@RequestMapping(value= "/projectmaster/{projectId}", method= RequestMethod.DELETE, consumes = "application/json", produces ="application/json")
	public @ResponseBody boolean deleteProjectMaster(@PathVariable("projectId")  int projectId){
		 return projectMasterService.deleteProjectMaster(projectId);
	}
	
	@RequestMapping(value= "/projectmaster", method= RequestMethod.PUT)
	public @ResponseBody boolean updateProjectMaster(@RequestBody ProjectMaster newproject){
		return projectMasterService.updateProjectMaster(newproject);
	}

	
}
