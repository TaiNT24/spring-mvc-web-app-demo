package com.taint.springdemo.mvc;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import com.taint.springdemo.model.Student;

@Component
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// add Student obj to model
		theModel.addAttribute("student", new Student());
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String showForm(@ModelAttribute("student") Student student) {
		
		return "student-info";
	}
	
}
