package com.example.demo.springboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.springboot.model.Employees;
import com.example.demo.springboot.repository.EmployeeRepository;

@Service
public class EmployeesService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Iterable<Employees> getAllEmployees() {
		return this.employeeRepository.findAll();
	}

	public Optional<Employees> findEmployeesById(Long id) {
		return this.employeeRepository.findById(id);
	}
	
	public Object getEmployeesForDepartment(Long deptId) {
		return this.employeeRepository.getEmployeesForDepartment(deptId);
	}
	
	public Object getEmployeeFromDepartment(Long deptId, Long id) {
		return this.employeeRepository.getEmployeeFromDepartment(deptId, id);		
	}

}
