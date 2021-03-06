package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:05:59 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Librarian generated by hbm2java
 */
@Entity
@Table(name = "librarian", catalog = "library")
public class Librarian implements java.io.Serializable {

	private String username;
	private LibraryBranch libraryBranch;
	private String password;

	public Librarian() {
	}

	public Librarian(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Librarian(String username, LibraryBranch libraryBranch,
			String password) {
		this.username = username;
		this.libraryBranch = libraryBranch;
		this.password = password;
	}

	@Id
	@Column(name = "Username", unique = true, nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BranchId")
	public LibraryBranch getLibraryBranch() {
		return this.libraryBranch;
	}

	public void setLibraryBranch(LibraryBranch libraryBranch) {
		this.libraryBranch = libraryBranch;
	}

	@Column(name = "Password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
