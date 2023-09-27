package com.example.employeeDepartment.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	public int empId; 
	public String name;
	public String address;
	public int deptid;
	
	@Override
	public String toString()
    { 
        // Return the attributes
        return "{"
        		+ "empId :" +empId+","
        		+ "name :" +name+","
        		+ "address :" +address
        		+ "}";
    }
}
