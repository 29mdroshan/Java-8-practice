package com.graphql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.graphql.model.AddStudentInput;
import com.graphql.model.Student;
import com.graphql.model.SubjectNameFilter;
import com.graphql.model.Subjects;
import com.graphql.repository.StudentRepository;
import com.mongodb.Function;

import ch.qos.logback.core.testUtil.RandomUtil;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;

	Supplier<String> randomNumber = () -> {
		String str = "";
		for (int i = 0; i < 4; i++) {

			str += (int) (Math.random() * 10);

		}
		return str;
	};

	Function<AddStudentInput, Student> mapping = i -> {

		Student student = new Student();
		student.setId(randomNumber.get());
		student.setName(i.getName());
		student.setEmail(i.getEmail());
		student.setSubjects(i.getSubjects());
		return student;
	};

	@Override
	public Mono<Student> addStudent(Student student) {

		student.setId(randomNumber.get());
		return repo.save(student);
	}

	@Override
	public Flux<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Flux<Student> getStudentByName(String name, SubjectNameFilter subjectNameFilter) {
		var student=repo.findByName(name);
		if(subjectNameFilter == null) {
			return student;
		}
	
			return student.flatMap(i->{
				i.setSubjects(i.getSubjects().stream().filter(z->z.getSubjectName().equalsIgnoreCase(subjectNameFilter.toString())).toList());
				return Flux.just(i);
			});
		
	}

	@Override
	public Mono<Student> saveStudent(AddStudentInput addStudentInput) {

		return repo.save(mapping.apply(addStudentInput));
	}

	@Override
	public Mono<String> deleteByID(String id) {
		return repo.findById(id).switchIfEmpty(Mono.error(new Exception("Student not found"))).then(repo.deleteById(id))
				.then(Mono.just("Student Deleted")).log();
	}

}
