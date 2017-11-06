package com.practice.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Trial trial;
	
	
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
	
	public Trial getTrial() {
		return trial;
	}

	public void setTrial(Trial trial) {
		this.trial = trial;
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
	
	public void init() {
		System.out.println("___Initializing User Bean___");
	}
	public void destroy() {
		System.out.println("___Destroying User Bean___");
	}
}
