package com.example.serviceB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceBController {
	
	@GetMapping
	public String serviceB() {
		return "this is ServiceB called from ServiceA";
	}

}
