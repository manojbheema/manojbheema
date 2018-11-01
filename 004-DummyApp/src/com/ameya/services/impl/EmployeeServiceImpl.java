package com.ameya.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.daos.EmployeeDAO;
import com.ameya.services.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDao;
//	public void setEmployeeDao(EmployeeDAO employeeDao) {
//		this.employeeDao = employeeDao;
//	}
	@Override
	public void createEmployee() {
		System.out.println("----Create Employee ---Service");
		employeeDao.create();
	}

}
