package com.java.jsf.daoImpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.model.GroupMember;
import com.java.jsf.util.HibernateUtil;


public class GroupMemberDaoImpl implements GroupMemberDao {

	SessionFactory sessionFactory;;

	Session session ;;

//	@Override
//	public List<GroupMember> showAllGroup() {
//
//		sessionFactory = HibernateUtil.getSessionFactory();
//
//		session = sessionFactory.openSession();
//
//		Transaction trans = session.beginTransaction();
//
//		Query query = session.createQuery("from GroupMember");
//
//		List<GroupMember> groupMemberList = query.list();
//
//		trans.commit();
//
//		session.close();
//
//		return groupMemberList;
//	}
//
//	@Override
//	public String addGroupMember(GroupMember groupMember) {
//
//		sessionFactory = HibernateUtil.getSessionFactory();
//
//		session = sessionFactory.openSession();
//
//		Transaction trans = session.beginTransaction();
//
//		session.save(groupMember);
//
//		trans.commit();
//
//		session.close();
//
//		return "successfully added ";
//	}
//
//	@Override
//	public List<com.java.jsf.model.User> showAllUserByGroupmemberId(int groupmem_Id) {
//		sessionFactory = HibernateUtil.getSessionFactory();
//		session = sessionFactory.openSession();
//		Transaction trans = session.beginTransaction();
//
//		Query query = session.createQuery("select gm.user from GroupMember gm where gm.id = :groupmem_Id");
//		query.setParameter("groupmem_Id", groupmem_Id);
//
//		List<com.java.jsf.model.User> userList = query.list();
//
//		trans.commit();
//		session.close();
//
//		return userList;
//	}
//
//	@Override
//	public List<Group> showGroupsUsingByGroupmemberI(int groupmem_Id) {
//		sessionFactory = HibernateUtil.getSessionFactory();
//		session = sessionFactory.openSession();
//		Transaction trans = session.beginTransaction();
//
//		Query query = session.createQuery("select gm.user from GroupMember gm where gm.id = :groupmem_Id");
//		query.setParameter("groupmem_Id", groupmem_Id);
//
//		List<com.java.jsf.model.Group> userList = query.list();
//
//		trans.commit();
//		session.close();
//
//		return userList;
		
//		return null;
//	}
		
		public void addGroupMember(GroupMember member) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(member);
	        tx.commit();
	        session.close();
	    }

	    public List<GroupMember> getMembersByGroupId(int groupId) {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        Query q = session.createQuery("from GroupMember where group.id = :groupId");
	        q.setParameter("groupId", groupId);
	        List<GroupMember> list = q.list();
	        session.close();
	        return list;
	    }
		
		

}