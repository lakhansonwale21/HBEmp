package com.tka.may_07;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	int  empid;
	String name;
	String role;
	double salary;
	
	@Override
	public String toString() {
	    return "Employee [id=" + empid +
	           ", name=" + name +
	           ", role=" + role +
	           ", salary=" + salary + "]";
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empid, String name, String role, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
		
		
	}
	
	
}
