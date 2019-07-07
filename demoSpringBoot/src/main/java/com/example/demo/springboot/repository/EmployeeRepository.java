package com.example.demo.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.springboot.model.Employees;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {
	
	@Query("SELECT e FROM Employees e WHERE departmentId = :deptId")
    public List<Employees> getEmployeesForDepartment(@Param("deptId") Long deptId);
	
	@Query("SELECT e FROM Employees e WHERE e.departmentId = :deptId and e.employeeId = :id")
    public List<Employees> getEmployeeFromDepartment(@Param("deptId") Long deptId, @Param("id") Long id);

}
