package com.example.transactionDemo.service;

import com.example.transactionDemo.repository.dao.Student;

public interface StudentService {
	
	public Student save(Student request);
	
	public Student findByStudentId(Long id);
	
}
