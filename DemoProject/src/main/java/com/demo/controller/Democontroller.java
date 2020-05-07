package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.Employee;
import com.demo.dto.Salary;

@RestController
public class Democontroller {

	@GetMapping("getDetails")
	public Employee getDetails() {
		
		Salary sal = new Salary("E001", "ShreeJi", 292929);
		Employee emp1 = new Employee(1010, "ALASH", sal);
		
	
		return emp1;
	}
}
