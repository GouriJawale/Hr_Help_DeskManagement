package com.hr.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.hr.entity.InterviewInfo;

@Service
public interface InterviewService {
	
	
	public InterviewInfo createInterviewInfo(InterviewInfo interwiewinfo);
	
	
	public InterviewInfo saveInterviewInfo(InterviewInfo interviewinfo);
	
	
	List<InterviewInfo> getAllInterview(InterviewInfo interviewinfo);
	
	
	public void deleteInterviewInfo(Integer id);
	
	
	public InterviewInfo updateInterviewInfo(InterviewInfo interviewinfo);


	

}
