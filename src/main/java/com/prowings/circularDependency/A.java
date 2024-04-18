package com.prowings.circularDependency;

public class A {
	B b;

	public A() {

		System.out.println("inside A constructor");
	}

	public A(B b) {
		super();
		this.b = b;
	}

//	@Post-construct approach to resolve an circular dependency-in this we write a init() method in bean class.And mention that method name in xml file at bean A 
	public void init() {
		b.setA(this);
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
