package com.Management.service;

import java.util.List;

import com.Management.entity.Student;

public interface StudentService {
	 String  addStudent(Student s);
	List<Student> getAll();
	String updateStudent(Student s);
	
	int deleteStudent(int id);
	Student fetchStudent(int id);
	
}
