package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	@Override
	public Employee loginPage(Employee employee) {
		Employee emp=dao.loginPage(employee);
		return emp;
	}

}
