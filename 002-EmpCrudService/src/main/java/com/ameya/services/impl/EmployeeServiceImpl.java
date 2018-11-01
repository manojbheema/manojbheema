package com.ameya.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.daos.EmployeeDao;
import com.ameya.models.Employee;
import com.ameya.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}
	@Override
	public String addEmployee(Employee employee) {
		return (employeeDao.save(employee)!=null ?"Saved Successfully !!! " : "Error while Saving !!!");
	}
	@Override
	public String updateEmployee(Integer empId, Employee employee) {
		//findById returns Optional<Employee>,a container containing employee object get() returns the employee object within container
		//Optional is A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
		Optional<Employee> container=employeeDao.findById(empId);
		Employee empToUpdate=container.get();
		empToUpdate.setFirstName(employee.getFirstName());
		empToUpdate.setMidName(employee.getMidName());
		empToUpdate.setLastName(employee.getLastName());
		empToUpdate.setSalary(employee.getSalary());
		return (employeeDao.save(empToUpdate)!=null ?"Updated Successfully !!! " : "Error while Updating !!!");
	}

	@Override
	public Employee getEmployee(Integer empId) {
		
		
			return (employeeDao.findById(empId)).get();//findById returns Optional<Employee>,a container containing employee object get() returns the employee object within container
			//Optional is A container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value. 
	}

	@Override
	public String deleteEmployee(Integer empId) {
		String retVal="Deleted Successfully !!!";
		try {
			employeeDao.deleteById(empId);
			//employeeDao.delete(employee);-->delete by passing object
		}catch(Exception e) {
			retVal="Error while Deleting !!!";
		}
		return retVal;
	}
	@Override
	public Employee getByFirstNameIgnoreCase(String firstName) {
		Employee employee=employeeDao.getByFirstNameIgnoreCase(firstName);
		return employee;
	}

}
