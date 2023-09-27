package com.example.webClient.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webClient.dao.Employee;

@RestController
@RequestMapping("home")
public class HomeContoller {
	
	@GetMapping("/one")
	public List<Employee>welcome(){
		
		ArrayList<Employee> lst = new ArrayList<>();
		lst.add(new Employee("A", "1"));
		lst.add(new Employee("B", "1"));		
		
		return lst;
	}
}
