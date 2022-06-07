package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {

	public boolean addEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);
	public boolean deleteEmployeeDetails(int employeeId);
	public EmployeeDetails getEmployeeDetailsByEmployeeId(int employeeId);
	public  List<EmployeeDetails> getAllEmployeeDetails();

}
