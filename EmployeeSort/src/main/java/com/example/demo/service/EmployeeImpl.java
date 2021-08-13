package com.example.demo.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;

class SortByPhone implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getEmpPhone() - o2.getEmpPhone());
	}
	
}

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
	
}
@Service
public class EmployeeImpl implements EmployeeService{
	
	List<Employee> list;
	public EmployeeImpl() {
		list = new ArrayList<>();
		list.add(new Employee(1, "Manish Gupta", "System Engineer", 7651940191L));
		list.add(new Employee(2, "Anand Dubey", "Tech analyst", 8765434567L));
		list.add(new Employee(3, "Ashu Khan", "Software Developware", 567899876L));
		
	}
	@Override
	public List<Employee> getEmployee(){
		return list;
	}
	
	@Override
	public Employee getOneEmployee(long empId) {
		Employee emp = null;
		for(Employee e: list) {
			if(e.getEmpId() == empId) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	
	@Override
	public String postEmployee(Employee emp) {
		list.add(emp);
		return "Employee added Sucessfully";
	}
	
	@Override
	public List<Employee>sortEmployee(String method){
		if(method.compareTo("ByName")==0) {
			Collections.sort(list, new SortByName());
		}
		else if(method.compareTo("ByPhone")==0) {
			Collections.sort(list, new SortByPhone());
		}
		else {
			return null;
		}
		return list;
	}
	
}
