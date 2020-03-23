package com.cognizant.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.model.Student;
import com.cognizant.service.Studentrowmapper;

public class StudentDaoImpl implements Studentdao {

	private JdbcTemplate jdbctemplate;

	public void insert(Student student) {

		String sql = "insert into student values(?,?,?)";
		int insert = getJdbctemplate().update(sql, student.getId(), student.getName(), student.getMarks());
		System.out.println("No. of rows inserted: " + insert);

	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		String sql = "select * from student";
		Studentrowmapper st = new Studentrowmapper();
		List<Student> students = jdbctemplate.query(sql, st);
		
		return students;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
