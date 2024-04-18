package com.prowings.circularDependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Approach to resolve circular dependency by implementing
 * ApplicationContextAware(I) and InitializingBean(I)
 */
public class A2 implements ApplicationContextAware, InitializingBean {

	B b;
	private ApplicationContext context;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("inside set()A2");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		b = context.getBean(B.class, "b");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

}
