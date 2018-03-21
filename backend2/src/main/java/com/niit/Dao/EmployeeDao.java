package com.niit.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Employee;
@Repository("employeeDao")
public interface EmployeeDao {
	public List<Employee> getAllEmployees();

 public void insertEmployee(Employee employee);

}
