package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:05:59 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BookAuthorsId generated by hbm2java
 */
@Embeddable
public class BookAuthorsId implements java.io.Serializable {

	private int bookId;
	private String authorName;

	public BookAuthorsId() {
	}

	public BookAuthorsId(int bookId, String authorName) {
		this.bookId = bookId;
		this.authorName = authorName;
	}

	@Column(name = "BookId", nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Column(name = "AuthorName", nullable = false, length = 45)
	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BookAuthorsId))
			return false;
		BookAuthorsId castOther = (BookAuthorsId) other;

		return (this.getBookId() == castOther.getBookId())
				&& ((this.getAuthorName() == castOther.getAuthorName()) || (this
						.getAuthorName() != null
						&& castOther.getAuthorName() != null && this
						.getAuthorName().equals(castOther.getAuthorName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBookId();
		result = 37
				* result
				+ (getAuthorName() == null ? 0 : this.getAuthorName()
						.hashCode());
		return result;
	}

}