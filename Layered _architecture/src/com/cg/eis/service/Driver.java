package com.cg.eis.service;

import java.util.*;
import java.util.Map.Entry;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeService;
public class Driver {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");

			System.out.println("Choose one option:\n"
					+ "1. Add Employee details\n"
					+ "2. Display employee based on scheme\n"
					+ "3. Delete an employee from Map\n");
		EmployeeService service=new EmployeeService();
		int op=sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Enter Employee Id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name:");
			String employeeName=sc.nextLine();
			System.out.println("Enter Salary:");
			int salary=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter designation:");
			String designation=sc.nextLine();
			System.out.println("Enter Insurance Scheme:");
			String insuranceScheme=sc.nextLine();
			Employee employee=new Employee(id,employeeName,salary,designation,insuranceScheme);
			service.addEmployee(employee);
			break;
		case 2:
			//Display employee based on scheme
			sc.nextLine();
			System.out.println("Enter Insurance Scheme:");
			insuranceScheme=sc.nextLine();
			System.out.println( service.getByInsuranceScheme(insuranceScheme) );
			break;
		case 3:
			//Delete an employee from Map
			System.out.println("Enter Employee Id:");
			id=sc.nextInt();
			service.deleteEmployee(id);
			System.out.println("Element removed sucessfully");
			break;
		default:
			break;
		}
		service.viewAllEmployee();

		
	}

}