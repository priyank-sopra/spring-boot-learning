package com.example.demoSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.dao.Student;
import com.example.demoSpring.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student request){
		return new ResponseEntity<>(studentService.save(request), HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> findByStudentId(@PathVariable Long id){
		return new ResponseEntity<>(studentService.findByStudentId(id), HttpStatus.OK);
	}
}
