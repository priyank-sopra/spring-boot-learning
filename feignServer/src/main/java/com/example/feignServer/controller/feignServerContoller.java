package com.example.feignServer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class feignServerContoller {
	
	@GetMapping("/name")
	public String getname() {
		return "Sopra";
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "address is Noida";
	}

}
