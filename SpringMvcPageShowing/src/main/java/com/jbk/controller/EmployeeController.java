package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@PostMapping(value="/loginprocess")
	public ModelAndView loginPage(@ModelAttribute Employee employee,Model model) {
		Employee emp=service.loginPage(employee);
		if(emp!=null) {
			return new ModelAndView("home");
			
		}else {
		
		return new ModelAndView("addEmployee","msg","Invalid Creditials!!!");
		
		}
	}

}
