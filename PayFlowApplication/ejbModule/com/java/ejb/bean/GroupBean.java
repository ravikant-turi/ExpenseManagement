package com.java.ejb.bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.java.ejb.dao.GroupDao;
import com.java.ejb.daoimpl.GroupDaoImpl;
import com.java.ejb.model.Group;

/**
 * Session Bean implementation class GroupBean
 */
@Stateless
@LocalBean
public class GroupBean implements GroupBeanRemote {
	
	static GroupDao groupdao;
	
	static {
		groupdao=new GroupDaoImpl();
	}

    /**
     * Default constructor. 
     */
    public GroupBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Group> showAllGroup() throws SQLException {
		
		return groupdao.showAllGroup();
	}

}
