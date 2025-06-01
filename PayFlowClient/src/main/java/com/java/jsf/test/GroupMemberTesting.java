package com.java.jsf.test;

import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.daoImpl.GroupMemberDaoImpl;

public class GroupMemberTesting {
	
	public static void main(String[] args) {
		
		GroupMemberDao gmdao=new GroupMemberDaoImpl();
		
		gmdao.getUsersByGroupId(36).forEach(System.out::println);
	}

}
