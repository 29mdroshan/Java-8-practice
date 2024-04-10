package com.graphql.service;

import com.graphql.model.AddStudentInput;
import com.graphql.model.Student;
import com.graphql.model.SubjectNameFilter;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

	public Mono<Student> addStudent(Student student);
	
	public Mono<Student> saveStudent(AddStudentInput addStudentInput);
	
	public Flux<Student> getAllStudent();
	
	public Flux<Student> getStudentByName(String name,SubjectNameFilter subjectNameFilter);
	
	public Mono<String> deleteByID(String id);

}
