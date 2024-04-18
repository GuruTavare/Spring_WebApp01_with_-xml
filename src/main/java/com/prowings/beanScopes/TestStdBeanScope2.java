package com.prowings.beanScopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStdBeanScope2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beansScope.xml");
		
		Student s1 = context.getBean("std",Student.class);
		System.out.println(s1);
		Student s2= context.getBean("std",Student.class);
		System.out.println(s2);
		
		System.out.println(s1==s2);
		
		System.out.println(s1.getAddress()==s2.getAddress());
		
		
	}

}
