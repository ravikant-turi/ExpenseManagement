package com.java.jsf.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.jsf.dao.ExpenseDao;
import com.java.jsf.daoImpl.ExpenseDaoImpl;
import com.java.jsf.model.Expense;
import com.java.jsf.model.Group;
import com.java.jsf.model.User;

public class ExpenseTest {
	
	public static void main(String[] args) throws ParseException {
		
		ExpenseDao expenseDao=new ExpenseDaoImpl();
		
//		
//		private Group group;
//	    private User paidBy;
//	    private String description;
//	    private double totalAmount;
//	    private java.util.Date expenseDate;
//	    private java.util.Date createdAt;
		
		User user=new User();
		user.setId(10);
		
		Group group=new Group();
		group.setId(10);;
		
		Expense expense=new Expense();
		
		expense.setDescription("dinner");
		
		expense.setGroup(group);
		
		expense.setPaidBy(user);
		
		expense.setTotalAmount(11111);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		Date utilDate = sdf.parse("05-05-2025"); // java.util.Date
		
//		expense.setExpenseDate(utilDate);
		
		expenseDao.addExpense(expense);
	}

}
