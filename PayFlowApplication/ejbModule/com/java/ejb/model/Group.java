package com.java.ejb.model;

public class Group {

	private int id;

	private String name;

	private java.util.Date createdAt;

	public Group() {
	}

	public Group(int id, String name, java.util.Date createdAt) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", createdAt=" + createdAt + "]";
	}

}
