package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page for employee";
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return this.employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getOneEmployee(@PathVariable String empId) {
		return this.employeeService.getOneEmployee(Long.parseLong(empId));
	}
	@PostMapping("/employee")
	public String postEmployee(@RequestBody Employee employee) {
		return this.employeeService.postEmployee(employee);
	}
	
	@GetMapping("/sortedEmployee/{method}")
	public List<Employee> sortEmployee(@PathVariable String method){
		return this.employeeService.sortEmployee(method);
	}
}
