package com.prowings.beanScopes;

public class Address {

	private int pin;
	private String city;
	private String country;

	public int getPin() {
		return pin;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}

}
