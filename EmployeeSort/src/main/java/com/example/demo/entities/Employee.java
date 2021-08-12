package com.example.demo.entities;

public class Employee {
	private int empId;
	private String empName;
	private String empDetail;
	private long empPhone;
	
	public Employee(int empId, String empName, String empDetail, long empPhone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDetail = empDetail;
		this.empPhone = empPhone;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDetail() {
		return empDetail;
	}
	public void setEmpDetail(String empDetail) {
		this.empDetail = empDetail;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDetail=" + empDetail + ", empPhone="
				+ empPhone + "]";
	}
	
}
