package com.example.transactionDemo.service.impl;

import java.util.Optional;

import com.example.transactionDemo.repository.CourseRepository;
import com.example.transactionDemo.repository.dao.Course;
import com.example.transactionDemo.repository.dao.Student;
import com.example.transactionDemo.service.CourceService;

public class CourceServiceImpl implements CourceService {
	
	public CourseRepository courseRepository;

	@Override
	public Course save(Course request) {		
		return courseRepository.save(request);
	}

	@Override
	public Course findByStudentId(Long id) {
		Optional<Course> crs = courseRepository.findById(id);
		
		if(crs.isPresent()) {
			return crs.get();
		}
		else {
			throw new RuntimeException("Record with Id: "+ id +" not found");
		}
	}

}
