package com.ameya.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ameya.daos.CustomerDAO;
import com.ameya.models.Customer;
import com.ameya.services.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void createCustomer(Customer customer) {
		customerDao.create(customer);
	}
}
