package com.prowings.beanLifeCycle;

public class MyBean {

	private int id;
	private String name;

	public MyBean() {
		
	}

	public MyBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void myInitMethod()
	{
		System.out.println("inside myInitMethod()");
	}

	public void myDestroyMethod()
	{
		System.out.println("inside myDestroyMethod()");
	}
	
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [id=" + id + ", name=" + name + "]";
	}
}
