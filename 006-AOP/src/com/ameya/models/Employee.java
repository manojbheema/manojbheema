package com.ameya.models;

public class Employee {
	private int age;
	private String firstName;
	private String lastName;
	private double salary;
	public Employee() {}
	public Employee(int age, String firstName, String lastName, double salary) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public void printThrownException() {
		System.out.println("+++++ Exception Raised +++++");
		throw new IllegalArgumentException();
	}
}
