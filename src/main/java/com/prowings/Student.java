package com.prowings;

import java.util.List;
import java.util.Set;

public class Student {

	private int id;
	private String name;
	private Employee emp;
	private List<Address> addresses;
	private Set<String> character;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Set<String> getCharacter() {
		return character;
	}

	public void setCharacter(Set<String> character) {
		this.character = character;
	}

	public Student(int id, String name, List<Address> addresses, Set<String> character) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
		this.character = character;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addresses=" + addresses + ", character=" + character + "]";
	}
	
}
