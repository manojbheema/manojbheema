package com.ameya.daos;



import org.springframework.data.repository.CrudRepository;

import com.ameya.models.Employee;


public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	public Employee getByFirstNameIgnoreCase(String firstName);
}

/*
 * count(),delete(),deleteAll(),deleteById(),existsById(),findAll(),findAllByID()
 * findById(),save(),saveAll()
 */











/*
public interface PersonRepository extends Repository<User, Long> {
	List<Person> findByEmailAddressAndLastname(EmailAddress emailAddress, String lastname);
	// Enables the distinct flag for the query
	List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
	List<Person> findPeopleDistinctByLastnameOrFirstname(String lastname, String firstname);
	// Enabling ignoring case for an individual property
	List<Person> findByLastnameIgnoreCase(String lastname);
	// Enabling ignoring case for all suitable properties
	List<Person> findByLastnameAndFirstnameAllIgnoreCase(String lastname, String firstname);
	// Enabling static ORDER BY for a query
	List<Person> findByLastnameOrderByFirstnameAsc(String lastname);
	List<Person> findByLastnameOrderByFirstnameDesc(String lastname);
}
*/