package com.ameya.daos.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ameya.daos.CustomerDAO;
import com.ameya.models.Customer;

@Repository("customerDao")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private DataSource dataSource;
	@Override
	public void create(Customer customer) {
		String SQL1="insert into Customer (id,name) values (?,?)";
		String SQL2="insert into Address (id,address,country) "
				+ "values (?,?,?)";
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		jdbcTemplate.update(SQL1,new Object[] {customer.getId(),
				customer.getFirstName()});
		System.out.println("Customer Table Updated");
		jdbcTemplate.update(SQL2,new Object[] {customer.getId(),
				customer.getAddress().getAddress(),
				customer.getAddress().getCountry()});
		System.out.println("Address Table Updated");
	}

}




