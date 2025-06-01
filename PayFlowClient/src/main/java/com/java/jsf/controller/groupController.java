package com.java.jsf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.java.jsf.dao.GroupDao;
import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.dao.UserDao;
import com.java.jsf.model.Group;
import com.java.jsf.model.GroupMember;
import com.java.jsf.model.User;

public class GroupController {

    private Group group;
    private User user; // Single user object for current friend
    private List<User> friends = new ArrayList<>();

    private GroupDao groupDao;
    private UserDao userDao;
    private GroupMemberDao groupMemberDao;

    // Getters and Setters
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

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public GroupDao getGroupDao() {
        return groupDao;
    }

    public void setGroupDao(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public GroupMemberDao getGroupMemberDao() {
        return groupMemberDao;
    }

    public void setGroupMemberDao(GroupMemberDao groupMemberDao) {
        this.groupMemberDao = groupMemberDao;
    }

    // Add another friend (used from UI to grow the form)
    public void addFriend() {
        this.friends.add(new User());
    }

    // Main logic to create group and link users
    public String addGroup() {
        if (group == null || groupDao == null || userDao == null || groupMemberDao == null) {
            throw new IllegalStateException("Missing DAO or Group instance");
        }

//        group.setCreatedAt(new Date());
        groupDao.addGroup(group);

        for (User friend : friends) {
            userDao.addUser(friend);

            GroupMember member = new GroupMember();
            member.setGroup(group);
            member.setUser(friend);
//            member.setJoinedAt(new Date());

            groupMemberDao.addGroupMember(member);
        }

        return "showGroup";
    }

    public List<Group> getGroupList() {
        return groupDao.showAllGroup();
    }
}
