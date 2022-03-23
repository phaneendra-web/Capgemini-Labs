package com.cg.eis.bean;

public class Employee {
	int id;
	String name;
	int salary;
	String designation;
	String insuranceScheme;
	public int getId() {
		return id;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public Employee(int id, String name, int salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
}