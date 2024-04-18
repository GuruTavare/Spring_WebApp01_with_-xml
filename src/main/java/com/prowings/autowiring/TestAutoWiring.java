package com.prowings.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-autowire.xml");

		Person p = applicationContext.getBean(Person.class, "person");
		
		System.out.println(p);

	}

}
