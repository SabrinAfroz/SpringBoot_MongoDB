package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@RestController
public class MainController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		studentRepo.save(student);
	}

}
