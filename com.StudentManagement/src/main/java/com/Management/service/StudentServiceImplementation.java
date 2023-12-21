package com.Management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.entity.Student;
import com.Management.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> getAll() {
		return repo.findAll();
	}

	@Override
	public String addStudent(Student s) {
		repo.save(s);
		return "added";
	}

	@Override
	public String updateStudent(Student s) {
		repo.save(s);
		return null;
	}

	@Override
	public int deleteStudent(int id) {
		repo.deleteById(id);
		return 0;
	}

	@Override
	public Student fetchStudent(int id) {
		
		return repo.findById(id);
	}

	

}
