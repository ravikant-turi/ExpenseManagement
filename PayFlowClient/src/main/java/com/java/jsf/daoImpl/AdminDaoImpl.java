package com.java.jsf.daoImpl;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.jsf.dao.AdminDao;
import com.java.jsf.model.Admin;
import com.java.jsf.util.HibernateUtil;
import com.java.jsf.util.PasswordUtil;

public class AdminDaoImpl implements AdminDao{

	
	
	SessionFactory sessionFactory;
    Session session;

    @Override
    public String SignUp(Admin admin) {
    	

        FacesContext context = FacesContext.getCurrentInstance();

        if (admin.getAdminname() == null || admin.getAdminname().trim().isEmpty()) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Admin name required", null));
            return null;
        }

        if (admin.getPasscode() == null || admin.getPasscode().trim().isEmpty()) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passcode required", null));
            return null;
        }

        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        // Hash the password
        String hashedPass = PasswordUtil.hashPassword(admin.getPasscode());
        admin.setPasscode(hashedPass);

        session.save(admin);
        tx.commit();
        session.close();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Admin registered successfully", null));

        return "null"; // 
    }

    @Override
    public String SignIn(Admin admin) {
        FacesContext context = FacesContext.getCurrentInstance();

        if (admin.getAdminname() == null || admin.getAdminname().trim().isEmpty()) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Admin name required", null));
            return null;
        }

        if (admin.getPasscode() == null || admin.getPasscode().trim().isEmpty()) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Passcode required", null));
            return null;
        }

        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();

        String hashedInput = PasswordUtil.hashPassword(admin.getPasscode());

        String hql = "FROM Admin WHERE adminname = :adminname AND passcode = :passcode";
        Query query = session.createQuery(hql);
        query.setParameter("adminname", admin.getAdminname());
        query.setParameter("passcode", hashedInput);

        Admin dbAdmin = (Admin) query.uniqueResult();
        session.close();

        if (dbAdmin != null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Login successful", null));
            return "menu"; // redirect to menu.xhtml (navigation rule in faces-config)
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Invalid admin name or passcode", null));
            return null;
        }
    }
}
