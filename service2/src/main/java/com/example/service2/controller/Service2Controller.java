package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@GetMapping(name = "/say",value = "/say")
	public String newService2() {
		return "this is service2.....";
	}
}
