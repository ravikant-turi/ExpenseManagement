package com.java.jsf.daoImpl;


import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.GroupDao;
import com.java.jsf.model.Group;
import com.java.jsf.util.HibernateUtil;

public class GroupDaoImpl implements GroupDao {

	SessionFactory sessionFactory;
	Session session;

	@Override
	public String addGroup(Group group) {

		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		session.save(group);

		trans.commit();

		session.close();
		
		return null;

	}

	@Override
	public List<Group> showAllGroup()  {
		sessionFactory = HibernateUtil.getSessionFactory();
	    session = sessionFactory.openSession();

	    String hql = "FROM Group";
	    Query query = session.createQuery(hql);
	    List<Group> groupList = query.list();

	    session.close();
	    return groupList;
	}



}
