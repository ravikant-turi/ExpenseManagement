package com.java.controller;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.java.ejb.jsf.UserEjbImpl;
import com.java.ejb.model.User;

public class UserController {

	private User user;
    private com.java.ejb.model.User ejbUser ;
    private UserEjbImpl userejbImpl ;
    
    
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getEjbUser() {
		return ejbUser;
	}

	public void setEjbUser(User ejbUser) {
		this.ejbUser = ejbUser;
	}

	public UserEjbImpl getUserejbImpl() {
		return userejbImpl;
	}

	public void setUserejbImpl(UserEjbImpl userejbImpl) {
		this.userejbImpl = userejbImpl;
	}

	public List<User> showUserlist()
			throws ClassNotFoundException, NamingException, SQLException {
		return userejbImpl.showUsersEjb();
	}
	
	public String addUsercon(com.java.ejb.model.User user) throws ClassNotFoundException, SQLException {
		return userejbImpl.addUserEjb(user);
	}

}
