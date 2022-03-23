package cg.feb18.spring.lab1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext c= new AnnotationConfigApplicationContext(Test.class);
		Scanner sc= new Scanner(System.in);

		Employee emp2 =  context.getBean("employee2",Employee.class);
		Employee emp3 =  context.getBean("employee3",Employee.class);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("Enter Employee Id");
		int input=sc.nextInt();
		for(Employee i: list){
			if(i.getEmployeeId()==input) {
				System.out.println("Employee info...");
				System.out.println("Employee id"+i.getEmployeeId());
				System.out.println("Employee Name"+i.getEmployeeName());
				System.out.println("Employee salary"+i.getSalary());
				break;
			}
			
		}
		
		((AbstractApplicationContext) context).close();
		
	}
}