package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml");

		Student s = applicationContext.getBean(Student.class, "std");
		Student s1 = applicationContext.getBean(Student.class, "std");
		System.out.println(s == s1);
		System.out.println(s);
				
		Employee e=applicationContext.getBean(Employee.class,"emp");
		System.out.println(e);
	
	}
}
