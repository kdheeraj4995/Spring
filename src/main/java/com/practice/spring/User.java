package com.practice.spring;

import java.util.List;

public class User {
	private String name;
	private Address address;
	private List<Contact> contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public void display() {
		System.out.println("Name : "+name);
		for(Contact c: contacts)
		System.out.println("Mobile : "+c.getMobile()+", Email : "+c.getEmail());
		System.out.println("Address : "+address.getCity()+", "+address.getCountry());
	}

}
