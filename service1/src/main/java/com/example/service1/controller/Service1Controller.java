package com.example.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@GetMapping(name = "/say",value = "/say")
	public String newService() {
		return "this is service 1";		
	}

}
