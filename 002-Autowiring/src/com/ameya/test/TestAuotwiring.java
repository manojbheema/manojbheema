package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.models.Employee;

public class TestAuotwiring {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee)ctx.getBean("e1");
		System.out.println(e1);
		Employee e2=(Employee)ctx.getBean("e2");
		System.out.println(e2);
	}

}
