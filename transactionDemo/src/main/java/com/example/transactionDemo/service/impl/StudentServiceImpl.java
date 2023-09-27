package com.example.transactionDemo.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.transactionDemo.repository.StudentRepository;
import com.example.transactionDemo.repository.dao.Student;
import com.example.transactionDemo.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService  {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Student save(Student request) {
		return studentRepository.save(request);
	}
	
	public Student findByStudentId(Long id) {
		Optional<Student> stu = studentRepository.findById(id);
		
		if(stu.isPresent()) {
			return stu.get();
		}
		else {
			throw new RuntimeException("Record with Id: "+ id +" not found");
		}
	}

}
