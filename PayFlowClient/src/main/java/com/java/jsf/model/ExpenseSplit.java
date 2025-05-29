package com.java.jsf.model;

public class ExpenseSplit {
    private int id;
    private Expense expense;
    private User user;
    private double amountOwed;

    public ExpenseSplit() {}

    public ExpenseSplit(int id, Expense expense, User user, double amountOwed) {
        this.id = id;
        this.expense = expense;
        this.user = user;
        this.amountOwed = amountOwed;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Expense getExpense() { return expense; }
    public void setExpense(Expense expense) { this.expense = expense; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public double getAmountOwed() { return amountOwed; }
    public void setAmountOwed(double amountOwed) { this.amountOwed = amountOwed; }
}
