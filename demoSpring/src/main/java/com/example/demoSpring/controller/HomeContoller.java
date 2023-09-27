package com.example.demoSpring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.dao.Student;

//@RestController
@Controller
public class HomeContoller {

	@GetMapping("/home")
	@ResponseBody
	public String firstMethod() {
		return "inside the controller";
	}
	
	@GetMapping("/students")
	@ResponseBody
	public ArrayList<Student> getStudentList() {

		ArrayList<Student> Studentlist = new ArrayList<Student>();		

		Studentlist.add(new Student((long) 1, "A", 1, 100));
		Studentlist.add(new Student((long) 2, "B", 2, 100));
		return Studentlist;

	}
}
