package com.example.demoSpring.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.example.demoSpring.dao.Student;
import com.example.demoSpring.dao.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
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
