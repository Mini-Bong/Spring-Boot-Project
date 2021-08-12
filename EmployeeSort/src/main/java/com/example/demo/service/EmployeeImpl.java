package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;

@Service
public class EmployeeImpl implements EmployeeService{
	
	List<Employee> list;
	public EmployeeImpl() {
		list = new ArrayList<>();
		list.add(new Employee(1, "Manish Gupta", "System Engineer", 12345));
		list.add(new Employee(2, "Anand Dubey", "Tech analyst", 9876));
		list.add(new Employee(3, "Ashu Khan", "Software Developware", 456765));
		
	}
	@Override
	public List<Employee> getEmployee(){
		return list;
	}
}
