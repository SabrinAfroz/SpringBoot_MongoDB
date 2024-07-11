package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Model.Student;

public interface StudentRepo extends MongoRepository<Student, Integer>{
	
	

}
