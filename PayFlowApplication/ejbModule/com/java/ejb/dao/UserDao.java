package com.java.ejb.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.User;

public interface UserDao {


	String addUser(User user) throws SQLException, ClassNotFoundException;

	User getUserById(int id) throws SQLException, ClassNotFoundException;

	List<User> getAllUsers() throws SQLException, ClassNotFoundException;


}
