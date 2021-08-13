package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployee();
	public Employee getOneEmployee(long empId);
	public String postEmployee(Employee emp);
	public List<Employee> sortEmployee(String method);
}
