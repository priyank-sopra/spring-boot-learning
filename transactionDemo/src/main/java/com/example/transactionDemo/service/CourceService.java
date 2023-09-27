package com.example.transactionDemo.service;

import com.example.transactionDemo.repository.dao.Course;
import com.example.transactionDemo.repository.dao.Student;

public interface CourceService {
	
public Course save(Course request);
	
	public Course findByStudentId(Long id);

}
