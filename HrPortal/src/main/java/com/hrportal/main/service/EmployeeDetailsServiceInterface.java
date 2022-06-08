package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.EmployeeDetails;


public interface EmployeeDetailsServiceInterface {
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean deleteEmployeeDetails(int employeeId);
	public EmployeeDetails getEmployeeDetailsByEmployeeId(int employeeId);
	public  List<EmployeeDetails> getAllEmployeeDetails();
	public EmployeeDetails getEmployeeDetailsByLoginId(int loginId);
	

}
