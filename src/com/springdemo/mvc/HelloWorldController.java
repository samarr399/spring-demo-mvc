package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-world-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}
	
	@RequestMapping("/use-model")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		String result = "Hi " + theName;
		model.addAttribute("message", result);
		return "hello-world";
	}
}
