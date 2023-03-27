package com.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.InterviewInfo;

public interface InterviewInfoRepository extends JpaRepository<InterviewInfo, Integer> {

}
