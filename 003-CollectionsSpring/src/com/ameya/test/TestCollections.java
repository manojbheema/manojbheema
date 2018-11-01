package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.pojos.Customer;

public class TestCollections {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		Customer cust = (Customer) context.getBean("customerBean");
		System.out.println(cust);
	}
}