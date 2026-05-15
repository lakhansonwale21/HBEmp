package com.tka.may_07;

public class Student {


	int Stuid;
	String name;
	String address;
	int mo_no;
	public Student() {
	
		// TODO Auto-generated constructor stub
	}
	public Student(int stuid, String name, String address, int mo_no) {
		super();
		Stuid = stuid;
		this.name = name;
		this.address = address;
		this.mo_no = mo_no;
	}
	public int getStuid() {
		return Stuid;
	}
	public void setStuid(int stuid) {
		Stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMo_no() {
		return mo_no;
	}
	public void setMo_no(int mo_no) {
		this.mo_no = mo_no;
	}
	
	
	
	
}
