package com.ameya.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private double salary;
	@Autowired
	private Project project;
	public Employee() {}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Project getProject() {
		return project;
	}
	//@Autowired
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", project=" + project + "]";
	}
	
}
