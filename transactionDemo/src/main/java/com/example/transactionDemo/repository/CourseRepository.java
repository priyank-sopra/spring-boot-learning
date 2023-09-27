package com.example.transactionDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transactionDemo.repository.dao.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
