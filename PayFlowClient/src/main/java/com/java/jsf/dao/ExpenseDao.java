package com.java.jsf.dao;

import java.util.List;

import com.java.jsf.model.Expense;

public interface ExpenseDao {
	
	   void addExpense(Expense expense);

	    List<Expense> getExpensesByGroupId(int groupId);

	    List<Expense> getExpensesByUserId(int userId);

	    List<Expense> getExpensesByGroupAndUser(int groupId, int userId);

}
