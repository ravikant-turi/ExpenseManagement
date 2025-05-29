package com.java.jsf.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.ejb.model.User;
import com.java.jsf.dao.UserDao;
import com.java.jsf.util.HibernateUtil;

public class UseDaoImpl implements UserDao {

	SessionFactory sessionFactory;
	Session session;

	@Override
	public List<User> showAllUserH() {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction tans = session.beginTransaction();

		Query query = session.createQuery("from Book");

		List<User> userList = query.list();

		tans.commit();
		session.close();

		return userList;

	}

}
