package com.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.model.Student;
import com.graphql.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/save")
	public Mono<Student> addStudent(@RequestBody Student student) {

		return service.addStudent(student);
	}

	@GetMapping("/get")
	public Flux<Student> getAllStudent() {

		return service.getAllStudent();
	}
}
