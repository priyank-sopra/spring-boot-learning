package com.example.serviceA.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/a")
public class ServiceAController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	private static final String BASE_URL = "http://localhost:8081/";
	
	private static final String SERVICE_A = "serviceA";
	
	int count=1;
	
	@GetMapping
	@CircuitBreaker(name = SERVICE_A, fallbackMethod = "serviceAFallback")
	public String serviceA() {
		String url = BASE_URL + "b";
        System.out.println("Retry method called " + count++ + " times at " + new Date());
		return restTemplate.getForEntity("http://localhost:8081/b", String.class).getBody();		
	}
	
	public String serviceAFallback(Exception e) {
		return "ServiceB is not available right now. This is fallback method for ServiceB";
	}

}
