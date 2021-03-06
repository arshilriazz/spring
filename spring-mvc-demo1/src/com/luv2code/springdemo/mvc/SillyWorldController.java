package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/silly")
public class SillyWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")	
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")	
	public String processForm2(HttpServletRequest req, Model model) {
		String name = req.getParameter("studentName");
		model.addAttribute("message", name.toUpperCase());
		return "helloworld";
	}
	
	@RequestMapping("/processFormV3")	
	public String processForm3(@RequestParam("studentName") String name, Model model) {
		model.addAttribute("message", name.toUpperCase() + " Silly RIAZ");
		return "helloworld";
	}

}
