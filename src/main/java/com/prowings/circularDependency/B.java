package com.prowings.circularDependency;

public class B {
	A a;

	public B() {
		super();
		System.out.println("inside a B constructor");
	}
//
//	public B(A a) {
//		super();
//		this.a = a;
//	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("inside set() B");
	}	
}
