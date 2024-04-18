package com.prowings.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beansScope.xml");
		
		Employee e1=context.getBean(Employee.class,"emp");
		System.out.println(e1.hashCode());
		Employee e2=context.getBean(Employee.class,"emp");
		System.out.println(e2.hashCode());
		
		System.out.println(e1==e2);
	}

}
