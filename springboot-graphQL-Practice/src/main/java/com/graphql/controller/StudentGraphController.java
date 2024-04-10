package com.graphql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.model.AddStudentInput;
import com.graphql.model.Student;
import com.graphql.model.SubjectNameFilter;
import com.graphql.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Controller
public class StudentGraphController implements GraphQLQueryResolver {

	@Autowired
	StudentService service;
	
	@QueryMapping("firstQuery")
	public String firstQuery() {
		return "Roshan";
	}

	@MutationMapping("fullName")
	public String fullName(@Argument String firstName, @Argument String lastName) {
		return firstName + "-" + lastName;
	}

	@QueryMapping("allStudent")
	public Flux<Student> getAllStudent(){
		return service.getAllStudent();
	}

	@MutationMapping("saveStudent")
	public Mono<Student> addStudent(@Argument AddStudentInput addStudentInput ){
//		System.out.println(addStudentInput.toString());
//		return null;
		return service.saveStudent(addStudentInput);
	}
	
	@MutationMapping("deleteStudent")
	public Mono<String> deleteStudentByID(@Argument String id ){
		return service.deleteByID(id);
	}

	@QueryMapping("getStudentByName")
	public Flux<Student> studentByName(@Argument String name,@Argument SubjectNameFilter subjectNameFilter){
		
		return service.getStudentByName(name,subjectNameFilter);
	}

	
}
