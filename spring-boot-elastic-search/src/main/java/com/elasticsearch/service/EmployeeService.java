package com.elasticsearch.service;

import java.util.List;

import com.elasticsearch.model.Employee;

public interface EmployeeService {

	 public Employee saveEmployee(Employee employee);
	 
	 public Iterable<Employee> findAllEmployees();
	 
	 public Iterable<Employee> findByName( String name);
	 
	 
}
