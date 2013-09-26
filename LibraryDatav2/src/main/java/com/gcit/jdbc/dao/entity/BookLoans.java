package com.gcit.jdbc.dao.entity;

import java.sql.Date;

public class BookLoans {
	
	Book bookBorrowed;
	LibraryBranch branchBorrowed;
	Borrower borrower;
	Date dateOut;
	Date dueDate;
	
	
	public Book getBookBorrowed() {
		return bookBorrowed;
	}
	public void setBookBorrowed(Book bookBorrowed) {
		this.bookBorrowed = bookBorrowed;
	}
	public LibraryBranch getBranchBorrowed() {
		return branchBorrowed;
	}
	public void setBranchBorrowed(LibraryBranch branchBorrowed) {
		this.branchBorrowed = branchBorrowed;
	}
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	public Date getDateOut() {
		return dateOut;
	}
	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
	public String toString(){
		
		
		java.text.SimpleDateFormat sdf = 
			     new java.text.SimpleDateFormat("MM-dd-yyyy");
		String out = sdf.format(dateOut);
		String due = sdf.format(dueDate);
		return  borrower.getName() +" borrowed " + bookBorrowed.getTitle() +
				" from " + branchBorrowed.getBranchName() + " on " + out 
				+ " and it is due on "+ due;
	}
	
	/*public static void main(String args[]){
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("MM-dd-yyyy");

		String currentTime = sdf.format(dt);
		System.out.println(currentTime);
	}*/

}
