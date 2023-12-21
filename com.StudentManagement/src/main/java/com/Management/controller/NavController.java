package com.Management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class NavController {

	@GetMapping("/")
    public String home()
    {
		return "home";
    }

	@GetMapping("/addStudent")
    public String addStudent()
    {
		return "addStudent";
    }
//	@GetMapping("/students")
//    public String students()
//    {
//		return "students";
//    }
	@GetMapping("/updateStudent")
    public String updateStudent()
    {
		return "updateStudent";
    }
	
	@GetMapping("/deleteStudent")
    public String deleteStudent()
    {
		return "DeleteStudent";
    }
	@GetMapping("/fetchStudent")
    public String fetchStudent()
    {
		return "fetchStudent";
    }
	
}
