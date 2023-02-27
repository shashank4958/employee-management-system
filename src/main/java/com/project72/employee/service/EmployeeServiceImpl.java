package com.project72.employee.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.project72.employee.entity.EmployeeEntity;
import com.project72.employee.model.Employee;
import com.project72.employee.repository.EmployeeRepository;

//implement business logic for all methods declared in service interface

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	
	@Override
	public Employee createEmployee(Employee employee) {
		
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employee, employeeEntity);
		employeeRepository.save(employeeEntity);
		return employee;
	}



    @Override
    public Employee getEmployeeById(Long id) {
        EmployeeEntity employeeEntity
                = employeeRepository.findById(id).get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }
	
	
	


}
