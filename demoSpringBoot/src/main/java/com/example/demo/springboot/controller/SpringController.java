package com.example.demo.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springboot.model.Employees;
import com.example.demo.springboot.repository.EmployeeRepository;
import com.example.demo.springboot.services.EmployeesService;

@RestController
@RequestMapping("/spring")
public class SpringController {
	
	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/greeting")
	public ResponseEntity<?> greeting(){
		String string = "Hello world from spring controller";
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getEmployee(){	
		
		return new ResponseEntity<Iterable<Employees>>(this.employeesService.getAllEmployees(), HttpStatus.OK);
	}
}
