package com.presly.marvin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.presly.marvin.model.Employee;
import com.presly.marvin.view.Repox;

@RestController
public class Controller2 {
	
@Autowired
	private Repox employeeService;
	
@RequestMapping(path="/rusangu", method=RequestMethod.GET)
	public List<Employee> getEmployeesAll()
	{
		return employeeService.findAll();
	}

@RequestMapping(value = "/rusangu/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
		return employeeService.findById(id).orElse(null);
	}

}
