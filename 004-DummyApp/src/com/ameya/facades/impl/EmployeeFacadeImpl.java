package com.ameya.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ameya.facades.EmployeeFacade;
import com.ameya.services.EmployeeService;

@Component("employeeFacade")
public class EmployeeFacadeImpl implements EmployeeFacade {
	
	@Autowired
	private EmployeeService employeeService;
	
//	public void setEmployeeService(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}
	@Override
	public void addEmployee() {
		System.out.println("---- Add Employee---- Facade");
		employeeService.createEmployee();

	}

}
