package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface Studentdao 
{
public void insert(Student student);
public List<Student> getAll();
}
