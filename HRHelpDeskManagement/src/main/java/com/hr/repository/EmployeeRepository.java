package com.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
