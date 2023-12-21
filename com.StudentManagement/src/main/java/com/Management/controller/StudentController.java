package com.Management.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Management.entity.Student;
import com.Management.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService sserrvice;
	
	
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		List<Student> studentList=sserrvice.getAll();
		model.addAttribute("studentList",studentList);
		return "students";
	}
	@PostMapping("/add")
	public String addStudent(@ModelAttribute Student s)
	{
		 sserrvice.addStudent(s);
		 return "home";
		
	}
	@PutMapping("/update")
	public String update(@ModelAttribute Student s)
	{
		 sserrvice.updateStudent(s);
		 return "home";
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("id") int id)
	{
		System.out.println(id);
		 sserrvice.deleteStudent(id);
		 return "home";
	}
	@GetMapping("/fetch")
	public String fetch(@RequestParam("id") int id,Model model)
	{
		
		Student s= sserrvice.fetchStudent(id);
		 model.addAttribute("s", s);
		 return "fetchedStudent";
	}
	
	
}