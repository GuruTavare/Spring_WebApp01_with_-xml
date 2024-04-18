package com.prowings;

import java.util.Map;
import java.util.Properties;

public class Employee {
	private int eId;
	private String eName;
	private String eDept;
	private Map<Integer, String> details;
	private Properties properties;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eId, String eName, String eDept, Map<Integer, String> details, Properties properties) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDept = eDept;
		this.details = details;
		this.properties = properties;
	}


	public int geteId() {
		return eId;
	}


	public String geteName() {
		return eName;
	}


	public String geteDept() {
		return eDept;
	}


	public Map<Integer, String> getDetails() {
		return details;
	}


	public Properties getProperties() {
		return properties;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public void seteDept(String eDept) {
		this.eDept = eDept;
	}


	public void setDetails(Map<Integer, String> details) {
		this.details = details;
	}


	public void setProperties(Properties properties) {
		this.properties = properties;
	}


	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eDept=" + eDept + ", details=" + details
				+ ", properties=" + properties + "]";
	}
	
	}
