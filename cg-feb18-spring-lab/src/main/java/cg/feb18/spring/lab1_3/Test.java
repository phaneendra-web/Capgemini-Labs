package cg.feb18.spring.lab1_3;

import java.util.ArrayList;

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

		Employee emp1 =  context.getBean("employee",Employee.class);
		Employee emp2 =  context.getBean("employee1",Employee.class);
		SBU sbu = (SBU)context.getBean(SBU.class);
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		sbu.setList(list);
		

		System.out.println(sbu.toString());	

		((AbstractApplicationContext) context).close();
	}
}