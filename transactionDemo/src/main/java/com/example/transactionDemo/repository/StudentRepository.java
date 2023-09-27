package com.example.transactionDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transactionDemo.repository.dao.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
