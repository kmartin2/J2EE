package com.gcit.jdbc.dao.entity;

public class LibraryBorrower extends User {
	
	private Borrower myBorrower;

	public Borrower getMyBorrower() {
		return myBorrower;
	}

	public void setMyBorrower(Borrower myBorrower) {
		this.myBorrower = myBorrower;
	}

}
