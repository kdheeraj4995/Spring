package com.practice.spring;

public class User {
	private String name;
	private Address address;
	private Contact contact;

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
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+contact.getMobile()+", Email : "+contact.getEmail());
		System.out.println("Address : "+address.getCity()+", "+address.getCountry());
	}

}
