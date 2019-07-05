package com.example.demo.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.springboot.model.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {
	
	
}
