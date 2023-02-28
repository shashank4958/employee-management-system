
	// used to declare all the methods that we use as service
	// create employee service
	// delete employee
	// update employee
	// get all employee

package com.project72.employee.service;

import com.project72.employee.model.Employee;

public interface EmployeeService {
	

	
	Employee createEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);

}
