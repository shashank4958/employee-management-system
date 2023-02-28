package com.project72.employee.service;

import java.util.List;

import com.project72.employee.model.Employee;

public interface EmployeeService {
	
	// used to declare all the methods that we use as service
	// create employee service
	// delete employee
	// update employee
	// get all employee
	
	Employee createEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);

	List<Employee> getAllEmployees();

}
