package com.java.jsf.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.Logindao;
import com.java.jsf.model.Login;
import com.java.jsf.util.HibernateUtil;

public class LogindaoImpl implements Logindao{
	
	SessionFactory sessionFactory;
	
	Session session;

	@Override
	public String SignUp(Login login) {
		
		sessionFactory= HibernateUtil.getSessionFactory();
		
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(login);
		
		trans.commit();
		
		session.close();
		
		return "successfully login";
		
		
	}

	@Override
	public String SignIn(Login login) {
		

		sessionFactory= HibernateUtil.getSessionFactory();
		
		session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		session.save(login);
		
		trans.commit();
		
		session.close();
		
		return "successfully login";
	}
	 
	
	

}
