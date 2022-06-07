package com.hrportal.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.FileDetails;
import com.hrportal.main.service.EmployeeDetailsServiceInterface;
import com.hrportal.main.service.FileDetailsServiceInterface;

@RestController
@CrossOrigin (origins = "*")
//@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("filedetails")
public class FileDetailsController {
	
	@Autowired
	private FileDetailsServiceInterface fileDetailsService;
	

	@RequestMapping(value= "/filedetail/{fileId}", method= RequestMethod.GET)
	public @ResponseBody FileDetails getfileDetailsByFileId(@PathVariable("fileId") int fileId){
		return fileDetailsService.getFileDetailsByFileId(fileId);
	}
		@RequestMapping(value = "filedetail", method =RequestMethod.GET)
		public @ResponseBody List<FileDetails> getAllFileDetails() {
			return fileDetailsService.getAllFileDetails();
					
	}

}
