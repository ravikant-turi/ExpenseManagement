package com.java.ejb.model;

public class Expense {
	private int id;
	private Group group;
	private User paidBy;
	private String description;
	private double totalAmount;
	private java.util.Date expenseDate;
	private java.util.Date createdAt;

	public Expense() {
	}

	public Expense(int id, Group group, User paidBy, String description, double totalAmount, java.util.Date expenseDate,
			java.util.Date createdAt) {
		this.id = id;
		this.group = group;
		this.paidBy = paidBy;
		this.description = description;
		this.totalAmount = totalAmount;
		this.expenseDate = expenseDate;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public java.util.Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(java.util.Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}
}
