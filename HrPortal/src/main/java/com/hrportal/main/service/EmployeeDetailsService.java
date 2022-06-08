package com.hrportal.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.repository.EmployeeDetailsRepository;

@Service
public class EmployeeDetailsService implements EmployeeDetailsServiceInterface {

	@Autowired
	private EmployeeDetailsRepository employeeDetailsRepository;
	
	@Override
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeDetails(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.getEmployeeDetailsByEmployeeId(employeeId);
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.getAllEmployeeDetails();
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByLoginId(int loginId) {
		// TODO Auto-generated method stub
		return employeeDetailsRepository.getEmployeeDetailsByLoginId(loginId);
	}





	
	
}
