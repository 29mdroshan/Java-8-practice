package com.elasticsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elasticsearch.model.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Integer> {

	Iterable<Employee> findByEmpName(String name);

}
