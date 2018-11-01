package com.ameya.daos;

import java.util.List;

import com.ameya.models.Student;

public interface StudentDAO {
	void create(String name,Integer age,Integer marks,String year);
	public List<Student> listStudents();
}
