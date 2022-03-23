package lab5;
import java.util.*;

import lab5_com.cg.eis.exception.EmployeeException;
public class Employee {
	
	private int id;
	private double salary;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		Employee emp= new Employee();
		emp.setId(id);
		emp.setSalary(salary);
		try {
			if(emp.salary<3000)  {throw new EmployeeException("Invalid");
			}
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Ended");
		sc.close();
		

	}

}
