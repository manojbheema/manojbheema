package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.facades.EmployeeFacade;

public class TestDummyApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeFacade employeeFacade=(EmployeeFacade)ctx.getBean("employeeFacade");
		employeeFacade.addEmployee();
	}

}
