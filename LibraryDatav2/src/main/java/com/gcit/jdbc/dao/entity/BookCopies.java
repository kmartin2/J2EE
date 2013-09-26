package com.gcit.jdbc.dao.entity;

public class BookCopies {
	
	Book bookInBranch;
	LibraryBranch branch;
	int numCopies;
	
	public Book getBookInBranch() {
		return bookInBranch;
	}
	public void setBookInBranch(Book bookInBranch) {
		this.bookInBranch = bookInBranch;
	}
	public LibraryBranch getBranch() {
		return branch;
	}
	public void setBranch(LibraryBranch branch) {
		this.branch = branch;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	
	public String toString(){
		return branch.getBranchName()+ " has " +numCopies+
				" copies of "+bookInBranch.getTitle(); 
	}
	


}
