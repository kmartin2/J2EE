package com.gcit.jdbc.dao.entity;

public class BookAuthor {
	
	private Book bookWritten;
	private String authorName;
	
	
	public Book getBooksWritten() {
		return bookWritten;
	}


	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void setBooksWritten(Book booksWritten){
		this.bookWritten = booksWritten;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append(authorName);
		return s.toString();
	}
}
