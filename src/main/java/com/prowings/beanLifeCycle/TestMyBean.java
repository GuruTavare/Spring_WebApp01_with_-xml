package com.prowings.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {

	public static void main(String[] args) {

		AbstractApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beanLifeCycle.xml");
		
		MyBean mb = cxt.getBean(MyBean.class, "myBean");
		
		System.out.println(mb);
		
		cxt.registerShutdownHook();
		
	}
}
