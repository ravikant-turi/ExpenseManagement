package com.java.ejb.model;

public class GroupMember {
	private int id;
	private Group group;
	private User user;
	private java.util.Date joinedAt;

	public GroupMember() {
	}

	public GroupMember(int id, Group group, User user, java.util.Date joinedAt) {
		this.id = id;
		this.group = group;
		this.user = user;
		this.joinedAt = joinedAt;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public java.util.Date getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(java.util.Date joinedAt) {
		this.joinedAt = joinedAt;
	}
}
