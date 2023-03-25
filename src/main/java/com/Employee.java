package com;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private String location;
	private double salary;
	
	public Employee(int id, String name, String dept, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.location = location;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", location=" + location + ", salary="
				+ salary + "]";
	}

}
