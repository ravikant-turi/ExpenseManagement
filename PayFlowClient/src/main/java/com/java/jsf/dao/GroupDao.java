package com.java.jsf.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jsf.model.Group;



public interface GroupDao {
	
//	List<Group> showAllGroup() ;
//	
//	String  addGroup(Group group);
	
	
	String addGroup(Group group);
    List<Group> showAllGroup();
    Group getGroupById(int id);

}
