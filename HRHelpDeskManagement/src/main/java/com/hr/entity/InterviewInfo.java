package com.hr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="InterviewInfo")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InterviewInfo {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private long mobNo;
	private String college;
	private String qualification;
	private String date;

}
