package com.example.employeeDepartment.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeDepartment.dao.Department;
import com.example.employeeDepartment.dao.Employee;
import com.example.employeeDepartment.dao.EmployeeDepartmentVO;

@RestController
public class HomeController {

	private List<Employee> createEmpList(){
		return Arrays.asList(
				new Employee(100, "Mukesh", "Noida", 10),
				new Employee(200, "maya", "Delhi", 20),
				new Employee(300, "Ram", "Delhi", 20),
				new Employee(400, "David", "Noida", 10)				
				);
	}
	
	private List<Department> createDeptList(){
		return Arrays.asList(
				new Department(10, "sales"),
				new Department(20, "purchase"),
				new Department(30, "programming")				
				);
	}
	
	@GetMapping("/empdept/{deptId}")
	public List<String> getEmployeeForDepartment(@PathVariable int deptId){
		System.out.println("inside getEmployeeForDepartment");
		return filterEmployeeUsingDepartment(deptId); 
	}
	
	private List<String>filterEmployeeUsingDepartment(int deptId){
		 	List<String> filteredList= new ArrayList<>();;
		 	List<Employee> originalList = createEmpList();
		 	
		 	for (Employee employee : originalList) {
		 		
		            if (Integer.compare(deptId,employee.getDeptid())==0) {
		                filteredList.add(employee.toString());
		           
		        }
		    }
		
		return filteredList;
	}
	
}
