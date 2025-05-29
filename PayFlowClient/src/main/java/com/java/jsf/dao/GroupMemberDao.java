package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.GroupMember;
import com.java.jsf.model.User;

public interface GroupMemberDao {
	

	List<GroupMember> showAllGroup();
	
	String addGroupMember(GroupMember groupMember);
	
	List<User> showAllUserByGroupmemberId(int groupmem_Id);
	
	int showGroupsUsingByGroupmemberI(int groupmem_Id);
	
	


}
