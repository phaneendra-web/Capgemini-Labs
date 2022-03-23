package cg.feb18.spring.lab1_1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
@ComponentScan

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		
		Employee emp= (Employee) context.getBean("employee");
		System.out.println(emp);
		((AbstractApplicationContext) context).close();


	}

}
