package com.java.jsf.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jsf.model.Group;



public interface GroupDao {
	
	List<Group> showAllGroup() throws SQLException;
	
	void addGroup(Group group);

}
