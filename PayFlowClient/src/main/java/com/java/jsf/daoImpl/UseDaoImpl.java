package com.java.jsf.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.UserDao;
import com.java.jsf.util.HibernateUtil;

import com.java.jsf.model.User;

public class UseDaoImpl implements UserDao {

	SessionFactory sessionFactory;
	Session session;

	@Override
	public List<User> showAllUserH() {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction tans = session.beginTransaction();

        Query query = session.createQuery("from User");

		List<User> userList = query.list();

		tans.commit();
		session.close();

		return userList;

	}

//	@Override
//	public String addUser(com.java.jsf.model.User user) {
//		sessionFactory =HibernateUtil.getSessionFactory();
//		
//		session=sessionFactory.openSession();
//		
//		Transaction trans=session.beginTransaction();
//		
//		session.save(user);
//		
//		trans.commit();
//		
//		session.close();
//		
//		return null;
//	}
	
	public void addUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    public User getUserByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from User where email = :email");
        q.setParameter("email", email);
        User user = (User) q.uniqueResult();
        session.close();
        return user;
    }
    
    @Override
    public User getUserById(int id) {
        Session session = sessionFactory.openSession();
        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans=session.beginTransaction();
        Query query = session.createQuery("from User");
        List<User> users = query.list();
        session.close();
        trans.commit();
        return users;
    }

    

}
