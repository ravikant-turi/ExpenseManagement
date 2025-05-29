package com.java.jsf.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jsf.dao.GroupDao;
import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.daoImpl.GroupDaoImpl;
import com.java.jsf.daoImpl.GroupMemberDaoImpl;
import com.java.jsf.model.Group;
import com.java.jsf.model.User;
import com.java.jsf.util.HibernateUtil;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Test for hibernate");
		
//		Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//
//            // Create a new User instance
//            User user = new User();
//            user.setId(1);          // assuming ID is int or Integer
//            user.setName("John Doe");
//            user.setEmail("john.doe@example.com");
//            // set other fields if any
//
//            // Save the user object
//            session.save(user);
//
//            tx.commit();
//            System.out.println("User saved successfully!");
//        } catch (Exception e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        // Close the SessionFactory (optional, usually at app shutdown)
//        HibernateUtil.getSessionFactory().close();
//        
//        
        
//		GroupTest();
		
		GroupMembertest();
        
    }
	
	public static void GroupTest() {
		
		GroupDao gpdao=new GroupDaoImpl();
		
		Group group=new Group();
		
		group.setName("Banglore tour");
		
		gpdao.addGroup(group);
	}
	
	public static void GroupMembertest() {
		GroupMemberDao gmdao=new GroupMemberDaoImpl();
		
		System.out.println("group Member are : ");
		
		gmdao.showAllGroup().forEach(System.out::println);
		
		
	}
    }
		
	

