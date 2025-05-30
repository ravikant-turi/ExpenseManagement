package com.java.jsf.controller;


import com.java.jsf.dao.AdminDao;
import com.java.jsf.model.Admin;

public class AdminController {

    private Admin admin;
    private AdminDao adminDao;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public AdminDao getAdminDao() {
        return adminDao;
    }

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public String signUp() {
        return adminDao.SignUp(admin);
    }

    public String signIn() {
        return adminDao.SignIn(admin);
    }
}
