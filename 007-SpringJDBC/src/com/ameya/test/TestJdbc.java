package com.ameya.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ameya.daos.StudentDAO;
import com.ameya.models.Student;

public class TestJdbc {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO studentDao=(StudentDAO)ctx.getBean("studentDao");
		studentDao.create("Ameya", 16, 77, "1994");
		studentDao.create("Kshiti", 8, 88, "2018");
		studentDao.create("Amol", 16, 77, "1994");
		studentDao.create("Avani", 8, 88, "2018");
		studentDao.create("Rahul", 16, 77, "1994");
		studentDao.create("Shyam", 8, 88, "2018");
		System.out.println("----- Listing all Records -----");
		List<Student> students=studentDao.listStudents();
		for(Student student : students) {
			System.out.print("ID :: "+student.getId());
			System.out.print(", NAME :: "+student.getName());
			System.out.print(", MARKS :: "+student.getMarks());
			System.out.print(", YEAR :: "+student.getYear());
			System.out.println(", AGE :: "+student.getAge());
		}

	}

}
