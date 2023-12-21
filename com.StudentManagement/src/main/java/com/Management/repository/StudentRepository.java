package com.Management.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	int deleteById(int id);
	Student findById(int id);
}
