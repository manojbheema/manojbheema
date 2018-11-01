package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.models.Employee;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=(Employee)ctx.getBean("employee");
		employee.getAge();
		employee.getFirstName();
		employee.setAge(42);
		employee.printThrownException();
	}

}
