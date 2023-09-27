package com.example.restClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.restClient.dao.Student;

@RestController
@RequestMapping("/api/consume/book")
public class StudentController {

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student request) {
		String apiUrl = "http://practice-client/student";
		 System.out.println("...incoming request...");
        ResponseEntity<Student> response = restTemplate.postForEntity(apiUrl, request, Student.class);
        System.out.println("forwarded post request to http://practice-client/book...");
        return response;
	}
}
