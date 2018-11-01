package com.ameya.daos.impl;

import org.springframework.stereotype.Repository;

import com.ameya.daos.EmployeeDAO;

@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void create() {
		System.out.println("Employee Created---DAO");

	}

}
