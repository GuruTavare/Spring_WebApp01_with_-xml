package com.prowings.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependency {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-circularDependency.xml");
		
		//A a1=applicationContext.getBean(A.class,"A");
		A2 a2=applicationContext.getBean(A2.class,"a");
		
		B b1=applicationContext.getBean(B.class,"b");
		
		System.out.println(a2);
		
		System.out.println(b1);
	}
}
