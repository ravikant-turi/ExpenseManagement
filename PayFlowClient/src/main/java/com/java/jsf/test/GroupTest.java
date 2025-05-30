package com.java.jsf.test;

import com.java.jsf.dao.GroupDao;
import com.java.jsf.daoImpl.GroupDaoImpl;

public class GroupTest {
	
	public static void main(String[] args) {
		
		GroupDao gpdao=new GroupDaoImpl();
		
		
		gpdao.showAllGroup().forEach(System.out::println);
		
	}

}
