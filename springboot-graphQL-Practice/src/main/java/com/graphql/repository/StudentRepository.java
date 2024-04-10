package com.graphql.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.graphql.model.Student;

import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {

	Flux<Student> findByName(String name);

}
