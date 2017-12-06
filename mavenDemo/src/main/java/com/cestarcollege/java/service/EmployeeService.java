package com.cestarcollege.java.service;

import java.util.List;

import com.cestarcollege.java.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
	
}