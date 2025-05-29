package com.java.ejb.bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

import com.java.ejb.model.User;

@Remote
public interface UserBeanRemote {


	List<User> showUsers() throws ClassNotFoundException, SQLException, SQLException;

	User searchUser(int userId) throws ClassNotFoundException, SQLException;

	String addUser(User user) throws ClassNotFoundException, SQLException;


}