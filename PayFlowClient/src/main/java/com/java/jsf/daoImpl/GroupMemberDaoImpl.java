package com.java.jsf.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.model.GroupMember;
import com.java.jsf.model.User;
import com.java.jsf.util.HibernateUtil;

public class GroupMemberDaoImpl implements GroupMemberDao {

	SessionFactory sessionFactory;

	Session session;

	@Override
	public List<GroupMember> showAllGroup() {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("from GroupMember");

		List<GroupMember> groupMemberList = query.list();

		trans.commit();

		session.close();

		return groupMemberList;
	}

	@Override
	public String addGroupMember(GroupMember groupMember) {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		session.save(groupMember);

		trans.commit();

		session.close();

		return "successfully added ";
	}

	@Override
	public List<User> showAllUserByGroupmemberId(int groupmem_Id) {
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("select gm.user from GroupMember gm where gm.id = :groupmem_Id");
		query.setParameter("groupmem_Id", groupmem_Id);

		List<User> userList = query.list();

		trans.commit();
		session.close();

		return userList;
	}

	@Override
	public int showGroupsUsingByGroupmemberI(int groupmem_Id) {

		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("select gm.group.id from GroupMember gm where gm.id = :groupmem_Id");
		query.setParameter("groupmem_Id", groupmem_Id);

		Integer groupId = (Integer) query.uniqueResult();

		trans.commit();
		session.close();

		return groupId != null ? groupId : 0;
	}

}
