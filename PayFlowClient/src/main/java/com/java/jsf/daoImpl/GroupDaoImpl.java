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

//	@Override
//	public String addGroup(Group group) {
//
//		sessionFactory = HibernateUtil.getSessionFactory();
//		session = sessionFactory.openSession();
//
//		Transaction trans = session.beginTransaction();
//
//		session.save(group);
//
//		trans.commit();
//
//		session.close();
//		
//		return null;
//
//	}
//
//	@Override
//	public List<Group> showAllGroup()  {
//		
//		sessionFactory = HibernateUtil.getSessionFactory();
//		
//	    session = sessionFactory.openSession();
//
//	    String hql = "FROM Group";
//	    
//	    Query query = session.createQuery(hql);
//	    
//	    List<Group> groupList = query.list();
//
//	    session.close();
//	    return groupList;
//	    
//	}
	 public String addGroup(Group group) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(group);
	        tx.commit();
	        session.close();
	        return "showGroup";
	    }

	    public List<Group> showAllGroup() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        List<Group> list = session.createQuery("from Group").list();
	        session.close();
	        return list;
	    }

	    public Group getGroupById(int id) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Group group = (Group) session.get(Group.class, id);
	        session.close();
	        return group;
	    }



}
