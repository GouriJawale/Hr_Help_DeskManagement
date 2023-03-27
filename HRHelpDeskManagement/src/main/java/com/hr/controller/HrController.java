package com.hr.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.InterviewInfo;
import com.hr.service.InterviewService;

@RestController
@RequestMapping("/hr")

public class HrController {
	
	@Autowired(required=true)
	private InterviewService interviewservice;
	
	@GetMapping("/home")
	public String homePage()
	{
		return "Welcome to HR Hepldesk Management";
	}
	
	@PostMapping("/hrvalid")
	public ResponseEntity<InterviewInfo> addValidInterviewInfo(@Valid @RequestBody InterviewInfo e)
	{
		return new ResponseEntity<InterviewInfo>(interviewservice.saveInterviewInfo(e),HttpStatus.CREATED);
	}
	
	@GetMapping("/gethr")
	public ResponseEntity<InterviewInfo> getAllValidInterviewInfo(@Valid @RequestBody InterviewInfo e) {
		
		return new ResponseEntity<InterviewInfo>((InterviewInfo) interviewservice.getAllInterview(e),HttpStatus.CREATED);
	}
	
	@PutMapping("/hrvalid/{id}")
	public ResponseEntity<InterviewInfo> updateValidInterviewInfo(@PathVariable("id") int id,@Valid @RequestBody InterviewInfo e) {
		
		return new ResponseEntity<InterviewInfo>((InterviewInfo) interviewservice.updateInterviewInfo(e),HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/hrvalid/{id}")
	public void deleteValidInterview(@PathVariable("id") Integer id) {
		
		interviewservice.deleteInterviewInfo(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
