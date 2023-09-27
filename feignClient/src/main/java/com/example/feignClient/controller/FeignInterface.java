package com.example.feignClient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo", url="http://localhost:8081/user/")
public interface FeignInterface {

	@GetMapping("name")
	public String getName();
}
