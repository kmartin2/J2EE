package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:05:59 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BookLoansId generated by hbm2java
 */
@Embeddable
public class BookLoansId implements java.io.Serializable {

	private int bookId;
	private int branchId;
	private int cardNo;

	public BookLoansId() {
	}

	public BookLoansId(int bookId, int branchId, int cardNo) {
		this.bookId = bookId;
		this.branchId = branchId;
		this.cardNo = cardNo;
	}

	@Column(name = "BookId", nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Column(name = "BranchId", nullable = false)
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	@Column(name = "CardNo", nullable = false)
	public int getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BookLoansId))
			return false;
		BookLoansId castOther = (BookLoansId) other;

		return (this.getBookId() == castOther.getBookId())
				&& (this.getBranchId() == castOther.getBranchId())
				&& (this.getCardNo() == castOther.getCardNo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBookId();
		result = 37 * result + this.getBranchId();
		result = 37 * result + this.getCardNo();
		return result;
	}

}