package com.java.jsf.controller;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.java.jsf.dao.ExpenseDao;
import com.java.jsf.dao.GroupDao;
import com.java.jsf.dao.GroupMemberDao;
import com.java.jsf.dao.UserDao;
import com.java.jsf.model.Expense;
import com.java.jsf.model.Group;
import com.java.jsf.model.GroupMember;
import com.java.jsf.model.User;



public class ExpenseController {

    private Expense expense = new Expense(); // for binding with JSF form
    private int groupId;
    private int userId;

    private ExpenseDao expenseDao;
    private GroupDao groupDao;
    private UserDao userDao;
    
    private Group group;
    
    
  
    public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	private GroupMember groupMember;
    
    private GroupMemberDao groupMemberDao;
    
    
    
    private User user;
    
    private List<User> listOfUser;
    
    
    

  

	public GroupMember getGroupMember() {
		return groupMember;
	}

	public void setGroupMember(GroupMember groupMember) {
		this.groupMember = groupMember;
	}

	public GroupMemberDao getGroupMemberDao() {
		return groupMemberDao;
	}

	public void setGroupMemberDao(GroupMemberDao groupMemberDao) {
		this.groupMemberDao = groupMemberDao;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getListOfUser() {
		return listOfUser;
	}

	public void setListOfUser(List<User> listOfUser) {
		this.listOfUser = listOfUser;
	}

	public ExpenseDao getExpenseDao() {
		return expenseDao;
	}

	public GroupDao getGroupDao() {
		return groupDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public ExpenseController() {
        System.out.println("ExpenseController created");
    }

    // === JSF Action Method ===
    public String addExpense() {
        try {
            if (groupDao == null || userDao == null || expenseDao == null) {
                System.err.println("One or more DAOs are not injected!");
                return null;
            }

            Group group = groupDao.getGroupById(groupId);
            User user = userDao.getUserById(userId);

            if (group == null || user == null) {
                System.err.println("Invalid group or user.");
                return null;
            }

            expense.setGroup(group);
            expense.setPaidBy(user);
//            expense.setCreatedAt(new Date());

            expenseDao.addExpense(expense);

            // reset for new entry
            expense = new Expense();

            return "showExpenses"; // navigation rule
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // === Used in Dropdowns ===
    public List<Group> getAllGroups() {
        if (groupDao == null) {
            System.err.println("groupDao is null in getAllGroups()");
            return Collections.emptyList();
        }
        return groupDao.showAllGroup();
    }

    public List<User> getAllUsers() {
        if (userDao == null) {
            System.err.println("userDao is null in getAllUsers()");
            return Collections.emptyList();
        }
        return userDao.showAllUserH();
    }
    
    public List<User> getAllUserformMember(){
    	
     return groupMemberDao.getUsersByGroupId(groupId);
    	
    }

    // === Getters and Setters ===
    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setExpenseDao(ExpenseDao expenseDao) {
        this.expenseDao = expenseDao;
        System.out.println("expenseDao injected: " + (expenseDao != null));
    }

    public void setGroupDao(GroupDao groupDao) {
        this.groupDao = groupDao;
        System.out.println("groupDao injected: " + (groupDao != null));
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("userDao injected: " + (userDao != null));
    }
    
   public String addExpensecontroller() {
	   
	   
	   System.out.println("==============================method id called ==================");
	   expenseDao.addExpense(expense);
	   return "message";
   }
   
}
