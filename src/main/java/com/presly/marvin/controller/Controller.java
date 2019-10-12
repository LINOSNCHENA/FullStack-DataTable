package com.presly.marvin.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.presly.marvin.view.Repox;
import com.presly.marvin.model.Employee;

@RestController
//	@RequestMapping("full")
@CrossOrigin(origins = "http://localhost:4200")

public class Controller {
	@Autowired
	Repox employeesOfCMIS;

 // http://8080/full/accounts/	
@PostMapping(path = "accounts")											 // POST
	public Employee addItem(@RequestBody Employee employeeAppointed)
		 { return employeesOfCMIS.save(employeeAppointed); }
 
// http://8080/full/accounts/	
@GetMapping(path = "accounts/{id}")									 	//	GET (x2)
	public Employee getItem(@PathVariable("id") int id)
	{ return employeesOfCMIS.findById(id).orElse(null);}
@GetMapping(path = "accounts")
	public List<Employee> getItems()
	{ return employeesOfCMIS.findAll();	}
		
// http://8080/full/account/:[id]										//	UPDATE(*2)
@PutMapping(path = "accounts")
	public Employee saveOrUpdateItem(@RequestBody Employee employeeCurrent) 
	{ return employeesOfCMIS.save(employeeCurrent);	}	

@PutMapping(path = "accounts/{id}")										
	public Employee updateItemById(@PathVariable int id, 
	@Valid @RequestBody Employee employeePromoted) 
{
	Employee employeeZ = employeesOfCMIS.findById(id).orElse(null);
	employeeZ.setName(employeePromoted.getName());		
	employeeZ.setDept(employeePromoted.getDept());		
	employeeZ.setPost(employeePromoted.getPost());
	employeeZ.setSalary(employeePromoted.getSalary());
	employeeZ.setStatus(employeePromoted.getStatus());
	Employee updatedItem = employeesOfCMIS.save(employeeZ);		
	return updatedItem;	
}

@PatchMapping(path = "accounts/{id}")									// PATCH-(*1)
	public Employee patchUpdateItemById(@PathVariable int id, 
	@Valid @RequestBody Employee employeeDemoted) 
{
	Employee employeeY = employeesOfCMIS.findById(id).orElse(null);
	employeeY.setName(employeeDemoted.getName());
	employeeY.setDept(employeeDemoted.getDept());		
	employeeY.setPost(employeeDemoted.getPost());
	employeeY.setSalary(employeeDemoted.getSalary());
	employeeY.setStatus(employeeDemoted.getStatus());
	Employee updatedItem = employeesOfCMIS.save(employeeY);
	return updatedItem; 
}

@DeleteMapping(path = "accounts/{id}")							   // DELETING(*2)
	public String deleteItem(@PathVariable int id)
	{	
	employeesOfCMIS.deleteById(id);		
	return "Employees' record erased successfully";	
	}

@DeleteMapping(path = "accounts")								
	public void deleteAllItems(Employee employeeFired) 
	{	
	employeesOfCMIS.deleteAll();	
	}
}
