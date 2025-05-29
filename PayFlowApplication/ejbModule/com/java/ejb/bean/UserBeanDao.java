package com.java.ejb.bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.java.ejb.dao.UserDao;
import com.java.ejb.daoimpl.UserDaoImpl;
import com.java.ejb.model.User;

@Stateless
@Remote(UserBeanRemote.class)
public class UserBeanDao implements UserBeanRemote {

    static UserDao dao;

    static {
        dao = new UserDaoImpl();
    }

    public UserBeanDao() {
        // Default constructor
    }

    @Override
    public List<User> showUsers() throws ClassNotFoundException, SQLException {
        return dao.getAllUsers();
    }

    @Override
    public User searchUser(int userId) throws ClassNotFoundException, SQLException {
        return dao.getUserById(userId);
    }

    @Override
    public String addUser(User user) throws ClassNotFoundException, SQLException {
        return dao.addUser(user);
    }

	
}
