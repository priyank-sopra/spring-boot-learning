package com.example.transactionDemo.service;

import org.springframework.stereotype.Service;

import com.example.transactionDemo.repository.CourseRepository;
import com.example.transactionDemo.repository.StudentRepository;
import com.example.transactionDemo.repository.dao.Course;
import com.example.transactionDemo.repository.dao.Student;
import com.example.transactionDemo.repository.dao.StudentVO;

@Service
public class CustomService {
	
	public CourseRepository courseRepository;
	private StudentRepository studentRepository;
	
	public StudentVO saveCustomData(StudentVO studentVO) {
		
		Course crs = new Course(studentVO.courseId, studentVO.description);
		courseRepository.save(crs);
		
		Student stu = new Student(studentVO.id, studentVO.firstName, studentVO.age, studentVO.marks);		
		studentRepository.save(stu);	
		
		
		return studentVO;		
	}

}
