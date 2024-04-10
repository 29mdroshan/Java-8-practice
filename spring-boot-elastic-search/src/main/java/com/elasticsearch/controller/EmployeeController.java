package com.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elasticsearch.model.Employee;
import com.elasticsearch.service.EmployeeService;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
	return	service.saveEmployee(employee);
	
	}

	@GetMapping("/getAll")
	public Iterable<Employee> findAllEmployees() {
		return service.findAllEmployees();
	}

	@GetMapping("/getByName/{name}")
	public Iterable<Employee> findByFirstName(@PathVariable String name) {
		return service.findByName(name);
	}
}
