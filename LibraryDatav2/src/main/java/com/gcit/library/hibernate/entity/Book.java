package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:05:59 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Book generated by hbm2java
 */
@Entity
@Table(name = "book", catalog = "library")
public class Book implements java.io.Serializable {

	private int bookId;
	private Publisher publisher;
	private String title;
	private Set<BookCopies> bookCopieses = new HashSet<BookCopies>(0);
	private Set<BookAuthors> bookAuthorses = new HashSet<BookAuthors>(0);
	private Set<BookLoans> bookLoanses = new HashSet<BookLoans>(0);

	public Book() {
	}

	public Book(int bookId, String title) {
		this.bookId = bookId;
		this.title = title;
	}

	public Book(int bookId, Publisher publisher, String title,
			Set<BookCopies> bookCopieses, Set<BookAuthors> bookAuthorses,
			Set<BookLoans> bookLoanses) {
		this.bookId = bookId;
		this.publisher = publisher;
		this.title = title;
		this.bookCopieses = bookCopieses;
		this.bookAuthorses = bookAuthorses;
		this.bookLoanses = bookLoanses;
	}

	@Id
	@Column(name = "BookId", unique = true, nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PublisherName")
	public Publisher getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Column(name = "Title", nullable = false, length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Set<BookCopies> getBookCopieses() {
		return this.bookCopieses;
	}

	public void setBookCopieses(Set<BookCopies> bookCopieses) {
		this.bookCopieses = bookCopieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Set<BookAuthors> getBookAuthorses() {
		return this.bookAuthorses;
	}

	public void setBookAuthorses(Set<BookAuthors> bookAuthorses) {
		this.bookAuthorses = bookAuthorses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Set<BookLoans> getBookLoanses() {
		return this.bookLoanses;
	}

	public void setBookLoanses(Set<BookLoans> bookLoanses) {
		this.bookLoanses = bookLoanses;
	}

}
