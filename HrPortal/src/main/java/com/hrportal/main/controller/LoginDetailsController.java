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

import com.hrportal.main.pojo.LoginDetails;
import com.hrportal.main.pojo.ProjectMaster;
import com.hrportal.main.service.LoginDetailsService;
import com.hrportal.main.service.LoginDetailsServiceInterface;
import com.hrportal.main.service.ProjectMasterServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("logindetails")
public class LoginDetailsController {
	
	@Autowired
	private LoginDetailsServiceInterface loginDetailsService;
	

	@RequestMapping(value = "logindetail", method =RequestMethod.GET)
	public @ResponseBody List<LoginDetails> getAllLoginDetails() {
		return loginDetailsService.getAllLoginDetails();
	}
	
	@RequestMapping(value= "/logindetail/{loginId}", method= RequestMethod.GET)
	public @ResponseBody LoginDetails getLoginDetailsByLoginId(@PathVariable("loginId") int loginId){
		return loginDetailsService.getLoginDetailsByLoginId(loginId);
	}
	
	@RequestMapping(value = "logindetail", method =RequestMethod.POST)
	public LoginDetails validateLogin(@RequestBody  LoginDetails loginDetails) {
		return loginDetailsService.validateLogin(loginDetails);
	}
	@RequestMapping(value= "logindetail", method= RequestMethod.PUT)
	public boolean updateLoginDetails(@RequestBody LoginDetails newLoginDetails){
		return loginDetailsService.updateLoginDetails(newLoginDetails);
	}
	
	@RequestMapping(value= "/logindetail/{loginId}", method= RequestMethod.DELETE)
	public boolean deleteLoginDetails(@PathVariable("loginId")  int loginId){
		 return loginDetailsService.deleteLoginDetails(loginId);
	}
	
//	@RequestMapping(value = "/logindetail", method = RequestMethod.POST)
//	public boolean addLoginDetails(@RequestBody LoginDetails loginDetails) {
//		return loginDetailsService.addLoginDetails(loginDetails);
//	}

}
