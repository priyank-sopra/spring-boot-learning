package com.example.demoSpring.service;

import com.example.demoSpring.dao.Student;

public interface StudentService {
	
	public Student save(Student request);
	
	public Student findByStudentId(Long id);

}
