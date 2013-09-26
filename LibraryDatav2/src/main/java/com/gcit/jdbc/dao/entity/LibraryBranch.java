package com.gcit.jdbc.dao.entity;

public class LibraryBranch {
	
	private int branchId;
	private String branchName;
	private String address;
	
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return branchId+", "+branchName+", "+address;
	}
	
	public int hashCode(){
		return toString().hashCode();
	}
	
	public boolean equals(Object other){
		boolean result = false;
		if(this.hashCode()==other.hashCode())
			result = true;
		return result;
	}

}
