package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.Group;
import com.java.jsf.model.GroupMember;
import com.java.jsf.model.User;

public interface GroupMemberDao {
	
//	List<GroupMember> showAllGroup();
//
//	String addGroupMember(GroupMember groupMember);
//	
//	List<User> showAllUserByGroupmemberId(int groupmem_Id);
//	
//	List<Group> showGroupsUsingByGroupmemberI(int groupmem_Id);
	
	
	// GroupMemberDao.java

	    void addGroupMember(GroupMember member);
	    List<GroupMember> getMembersByGroupId(int groupId);
	    
	    List<User> getUsersByGroupId(int groupId);
	

}
