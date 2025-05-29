package com.java.jsf.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public void addGroup(Group group) {

		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		session.save(group);

		trans.commit();

		session.close();

	}

	@Override
	public List<Group> showAllGroup() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
