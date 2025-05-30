package com.java.jsf.controller;

import java.util.List;

import com.java.jsf.dao.GroupDao;
import com.java.jsf.daoImpl.GroupDaoImpl;
import com.java.jsf.model.Group;

public class GroupController {

    private Group group ;

	private GroupDao groupDao ;

    private List<Group> groupList ;
    
    
    public GroupDao getGroupDao() {
		return groupDao;
	}

	public void setGroupDao(GroupDao groupDao) {
		this.groupDao = groupDao;
	}

    public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	

	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}

	
	
	public List<Group> Grouplist() {
         groupList = groupDao.showAllGroup();
         
         return groupList;
      
       
    }

    public String addGroup() {
      return   groupDao.addGroup(group);
       
    }
}
