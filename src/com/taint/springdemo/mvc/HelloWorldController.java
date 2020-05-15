package com.taint.springdemo.mvc;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "form-name";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	/*
	 * @RequestMapping("/processFormVersionTwo") public String
	 * letShoutDude(HttpServletRequest request, Model model) {
	 * 
	 * String username = request.getParameter("username");
	 * 
	 * username = username.toUpperCase();
	 * 
	 * String result = "Yo !! " + username;
	 * 
	 * model.addAttribute("message", result);
	 * 
	 * return "helloWorld";
	 * }
	 */	
	
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(
			@RequestParam("username") String theName
			, Model model) {
		
//		String username = request.getParameter("username");
		
		theName = theName.toUpperCase();
		
		String result = "Hey my friend !! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
}
