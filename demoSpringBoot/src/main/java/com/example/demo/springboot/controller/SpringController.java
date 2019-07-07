package com.example.demo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.springboot.services.EmployeesService;

@RestController
@RequestMapping("/spring")
public class SpringController {

	@Autowired
	private EmployeesService employeesService;

	@GetMapping("/greeting")
	public ResponseEntity<?> greeting() {
		String string = "Hello world from spring controller";
		return new ResponseEntity<String>(string, HttpStatus.OK);
	}

	@GetMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllEmployee() {
		return new ResponseEntity<Object>(this.employeesService.getAllEmployees(), HttpStatus.OK);
	}

	@GetMapping(value = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getEmployee(@PathVariable("id") long id) {
		return new ResponseEntity<Object>(this.employeesService.findEmployeesById(id), HttpStatus.OK);
	}

	@GetMapping(value = "/employee/dept/{deptId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getEmployeesOfDepartment(@PathVariable("deptId") long deptId) {		
		return new ResponseEntity<Object>(this.employeesService.getEmployeesForDepartment(deptId), HttpStatus.OK);
	}

	@GetMapping(value = "/employee/{deptId}/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getEmployeeFromDepartment(@PathVariable("deptId") long deptId,
			@PathVariable("id") long id) {
		return new ResponseEntity<Object>(this.employeesService.getEmployeeFromDepartment(deptId, id), HttpStatus.OK);
	}

}
