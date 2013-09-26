package com.gcit.jdbc.dao.entity;

public class Librarian extends User {
	
	private LibraryBranch myBranch;

	public LibraryBranch getBranch() {
		return myBranch;
	}

	public void setBranch(LibraryBranch myBranch) {
		this.myBranch = myBranch;
	}
	
	

}
