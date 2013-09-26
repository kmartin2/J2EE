package com.gcit.jdbc.dao.entity;

import javax.persistence.Entity;

@Entity
public class Book {

	private String Title;
	private int BookId;
	private Publisher Pub; 
	
	
	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		this.BookId = bookId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public Publisher getPublisher() {
		return Pub;
	}

	public void setPublisher(Publisher pub) {
		this.Pub = pub;
	}
	
	public String toString(){
		return BookId+", "+Title+", "+ Pub.toString();
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
