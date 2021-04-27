package com.vishnu.beans;

public class Employee {
	private int id;
	private String employeename;
	private float salary;
	private String designation;

	public int getId() {
		return id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public float getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
