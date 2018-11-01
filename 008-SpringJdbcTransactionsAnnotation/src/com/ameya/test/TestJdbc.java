package com.ameya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.models.Address;
import com.ameya.models.Customer;
import com.ameya.services.CustomerService;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CustomerService customerService=(CustomerService)ctx.getBean("customerService");
		Customer customer=createDummyCustomer();
		customerService.createCustomer(customer);
		
	}
	private static Customer createDummyCustomer() {
		Customer customer=new Customer();
		customer.setId(100);
		customer.setFirstName("Ameya");
		Address address=new Address();
		address.setId(100);
		address.setAddress("Kothrud11111111111111111");
		address.setCountry("India");
		customer.setAddress(address);
		return customer;
	}
}
