package com.hr.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hr.entity.Employee;
import com.hr.entity.InterviewInfo;
import com.hr.repository.InterviewInfoRepository;
import com.hr.service.InterviewService;


@Repository
public class InterviewServiceImpl implements InterviewService {

	
	
	@Autowired
	private InterviewInfoRepository interviewinforepository;

	@Override
	public InterviewInfo createInterviewInfo(InterviewInfo interwiewinfo) {
		
		return null;
}

	@Override
	public InterviewInfo saveInterviewInfo(InterviewInfo interviewinfo) {
		
		return interviewinforepository.save(interviewinfo);
	}

	@Override
	public List<InterviewInfo> getAllInterview(InterviewInfo interviewinfo) {
		
		 return interviewinforepository.findAll();
	}

	@Override
	public void  deleteInterviewInfo(Integer id) {
		 
			 
		interviewinforepository.deleteById(id);
		
		
	}

	@Override
	public InterviewInfo updateInterviewInfo(InterviewInfo interviewinfo) {
	
		InterviewInfo info=interviewinforepository.findById(interviewinfo.getId()).get();
		
		//info.setId(info.getId());
		//info.setName(info.getName());
		//info.setEmail(info.getEmail());
		//info.setMobNo(info.getMobNo());
		//info.setCollege(info.getCollege());
		//info.setQualification(info.getQualification());
		info.setDate(info.getDate());
		
		return interviewinforepository.save(info);
		
	}

}
