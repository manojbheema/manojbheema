package com.ameya.daos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ameya.daos.StudentDAO;
import com.ameya.models.Student;
import com.ameya.utils.StudentRowMapper;

@Repository("studentDao")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static int id=1;
	
	@Override
	public void create(String name, Integer age, Integer marks, String year) {
		String SQL1="insert into student (id,name,age) values(?,?,?)";
		String SQL2="insert into marks (sid,marks,year) values(?,?,?)";
		jdbcTemplate.update(SQL1,id,name,age);
		System.out.println("Student Table Updated");
		jdbcTemplate.update(SQL2,id,marks,year);
		id+=1;
		System.out.println("Marks Table Updated");
	}

	@Override
	public List<Student> listStudents() {
		String SQL="select * from student, marks where student.id=marks.sid";
		List<Student>students=jdbcTemplate.query(SQL, new StudentRowMapper());
		return students;
	}

}
