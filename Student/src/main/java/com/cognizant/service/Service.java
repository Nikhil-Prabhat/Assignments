package com.cognizant.service;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

public class Service {
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cognizant/service/config.xml");
		StudentDaoImpl student = (StudentDaoImpl) context.getBean("student");
		
		student.insert(new Student(2,"Prabhat",98));
		
		List<Student> st = student.getAll();
		System.out.println(st);
		
	}
}
