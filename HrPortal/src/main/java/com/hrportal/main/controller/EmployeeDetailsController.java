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

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.service.CandidateDetailsServiceInterface;
import com.hrportal.main.service.EmployeeDetailsServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("employeedetails")
public class EmployeeDetailsController {
	
	@Autowired
	private EmployeeDetailsServiceInterface employeeDetailService;
	
	

	@RequestMapping(value= "/employeedetailbyemployeeid/{employeeId}", method= RequestMethod.GET)
	public @ResponseBody EmployeeDetails getEmployeeDetailsByEmployeeId(@PathVariable("employeeId") int employeeId){
		return employeeDetailService.getEmployeeDetailsByEmployeeId(employeeId);
	}
		@RequestMapping(value = "employeedetail", method =RequestMethod.GET)
		public @ResponseBody List<EmployeeDetails> getAllEmployeeDetails() {
			return employeeDetailService.getAllEmployeeDetails();
	}
		
		@RequestMapping(value= "/employeedetail/{loginId}", method= RequestMethod.GET)
		public EmployeeDetails getEmployeeDetailsByLoginId (@PathVariable("loginId") int loginId){
			 return employeeDetailService.getEmployeeDetailsByLoginId(loginId);
		}
		@RequestMapping(value= "/employeedetail/{employeeId}", method= RequestMethod.DELETE)
		public @ResponseBody boolean deleteEmployeeDetails(@PathVariable("employeeId")  int employeeId){
			 return employeeDetailService.deleteEmployeeDetails(employeeId);
		}
		@RequestMapping(value= "/employeedetail", method= RequestMethod.PUT)
		public @ResponseBody boolean updateEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
			return employeeDetailService.updateEmployeeDetails(employeeDetails);
		}
		@RequestMapping(value = "/employeedetail", method = RequestMethod.POST)
		public boolean addEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
			return employeeDetailService.addEmployeeDetails(employeeDetails);  
		}


}
