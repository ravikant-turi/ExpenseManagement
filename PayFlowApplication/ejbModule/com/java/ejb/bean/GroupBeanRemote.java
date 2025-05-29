package com.java.ejb.bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

import com.java.ejb.model.Group;

@Remote
public interface GroupBeanRemote {
	List<Group> showAllGroup() throws SQLException;

}
