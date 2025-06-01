package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.User;

public interface UserDao {
	
	List<User> showAllUserH();
//	
//	String addUser(User user);
	
	
	void addUser(User user);
	
    User getUserByEmail(String email);  // optional, to avoid duplicates
    
    
    User getUserById(int id);
    
    List<User> getAllUsers();
   

}
