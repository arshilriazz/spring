package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@Column(name = "CustNo")
	private String ID;
	
	@Column(name = "CustName")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Internal")
	private char internal;
	
	@Column(name = "Contact")
	private String contact;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "Zip")
	private String zip;
	
	public Customer(String iD, String name, String address, char internal, String contact, String phone, String city,
			String state, String zip) {
		ID = iD;
		this.name = name;
		this.address = address;
		this.internal = internal;
		this.contact = contact;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Customer() {
		
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getInternal() {
		return internal;
	}
	public void setInternal(char internal) {
		this.internal = internal;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", address=" + address + ", internal=" + internal
				+ ", contact=" + contact + ", phone=" + phone + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
	
}
