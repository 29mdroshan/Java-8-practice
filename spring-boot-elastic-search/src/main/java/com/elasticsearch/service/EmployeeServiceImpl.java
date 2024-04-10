package com.elasticsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elasticsearch.model.Employee;
import com.elasticsearch.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public Iterable<Employee> findAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Iterable<Employee> findByName(String name) {
		
		return repo.findByEmpName(name);
	}

}
