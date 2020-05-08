package com.demo.dto;

public class Salary {

	String empid;
	String name;
	int amount;
	
	
	
	public Salary(String empid, String name, int amount) {
		super();
		this.empid = empid;
		this.name = name;
		this.amount = amount;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
