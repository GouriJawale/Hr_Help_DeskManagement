package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.hr.controller,"+"com.hr.service")
public class HrHelpDeskManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrHelpDeskManagementApplication.class, args);
	}

}
