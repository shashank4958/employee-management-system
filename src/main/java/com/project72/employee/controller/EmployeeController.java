package com.project72.employee.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project72.employee.model.Employee;
import com.project72.employee.service.EmployeeService;


@RestController
@RequestMapping("/api/registration/")


public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// import rest controller
	// request mapping
	// create employee post mapping
	// get list of employees get mapping
	// delete an employee
	// update an employee
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		
		return employeeService.createEmployee(employee);
	}
	
	
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = null;
        employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }


}
