package com.java.ejb.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.java.ejb.dao.GroupDao;
import com.java.ejb.dao.UserDao;
import com.java.ejb.daoimpl.GroupDaoImpl;
import com.java.ejb.daoimpl.UserDaoImpl;
import com.java.ejb.model.User;
import com.java.ejb.util.ConnectionHelper;

public class TestConnection {
	
	
	public static void addUser() {
		
		User user = new User();
		user.setName("Henrick");
		user.setEmail("Henrick@gmail.com");
		
		UserDao userdao = new UserDaoImpl();
		try {
			userdao.addUser(user);
			System.out.println("User Added");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try (Connection conn = ConnectionHelper.getConnection()) {

			if (conn != null && !conn.isClosed()) {
				System.out.println("Database connection established successfully!");
			} else {
				System.out.println("Failed to establish database connection.❌");
			}
		} catch (Exception e) {
			System.out.println("❌ Error while connecting to database: " + e.getMessage());
			System.out.println("Error while connecting to database: " + e.getMessage());
			e.printStackTrace();
		}

//		UserDao userdao = new UserDaoImpl();
//
//		try {
//			userdao.getAllUsers().forEach(System.out::println);
//			
//		} catch (ClassNotFoundException | SQLException ex) {
//			// TODO Auto-generated catch block
//			ex.printStackTrace();
//		}
//
//		GroupDao gpdao = new GroupDaoImpl();
//
//		try {
//			gpdao.showAllGroup().forEach(System.out::println);
//		} catch (SQLException e) {
//
//		}
		
		addUser();
		
	}
}
