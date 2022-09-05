package com.javainuse.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Employee;
import com.javainuse.repository.EmployeeRepository;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> firstPage() {
		return employeeRepository.findAll();
	}

	@DeleteMapping( "/emp/{id}" )
	public Employee delete(@PathVariable("id") long id) {
		Employee deletedEmp = null;
		Employee employee = employeeRepository.findById(id)
				.orElseThrow();
		employeeRepository.delete(employee);
		deletedEmp = employee;
	
		return deletedEmp;
	}

	@PostMapping
	public Employee create(@RequestBody Employee user) {
		
		employeeRepository.save(user);
		return user;
		
	}
	
	@PutMapping( "/emp/{id}" )
	public Employee update(@PathVariable("id") long id, @RequestBody Employee employeeDetails){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow();
		employee.setName(employeeDetails.getName());
		employee.setDesignation(employeeDetails.getDesignation());
		employee.setSalary(employeeDetails.getSalary());
		
		Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}
}

