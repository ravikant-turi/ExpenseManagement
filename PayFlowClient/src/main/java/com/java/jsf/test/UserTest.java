package com.java.jsf.test;

import com.java.jsf.dao.UserDao;
import com.java.jsf.daoImpl.UseDaoImpl;

public class UserTest {
	
	public static void main(String[] args) {
		
		System.out.println("User test is going on");
		
		UserDao userDao =new UseDaoImpl();
		
		userDao.showAllUserH().forEach(System.out::println);
	}

}
