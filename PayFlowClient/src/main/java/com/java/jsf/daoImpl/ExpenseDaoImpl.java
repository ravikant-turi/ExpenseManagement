package com.java.jsf.daoImpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.jsf.dao.ExpenseDao;
import com.java.jsf.model.Expense;
import com.java.jsf.util.HibernateUtil;

public class  ExpenseDaoImpl implements ExpenseDao {

    public void addExpense(Expense expense) {
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(expense);
            tx.commit();
            session.close();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Expense> getExpensesByGroupId(int groupId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Expense where group.id = :groupId");
        query.setParameter("groupId", groupId);
        List<Expense> list = query.list();
        session.close();
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<Expense> getExpensesByUserId(int userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Expense where paidBy.id = :userId");
        query.setParameter("userId", userId);
        List<Expense> list = query.list();
        session.close();
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<Expense> getExpensesByGroupAndUser(int groupId, int userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Expense where group.id = :groupId and paidBy.id = :userId");
        query.setParameter("groupId", groupId);
        query.setParameter("userId", userId);
        List<Expense> list = query.list();
        session.close();
        return list;
    }
}
