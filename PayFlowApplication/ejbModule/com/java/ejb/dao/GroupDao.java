package com.java.ejb.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.ejb.model.Group;

public interface GroupDao {
	
	List<Group> showAllGroup() throws SQLException;

}
