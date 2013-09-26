package com.gcit.jdbc.dao.entity;

public class Publisher {
	private String Name;
	private String Address;
	private String Phone;
	

	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public String toString(){
		return Name+", "+Address+", "+Phone;
	}
	
	
}
