package com.example.feignClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignClientController {
	
	@Autowired
	public FeignInterface feignInterface;
	
	@GetMapping("/username")
	public String getUsername() {
		return feignInterface.getName();
	}
		
		

}
