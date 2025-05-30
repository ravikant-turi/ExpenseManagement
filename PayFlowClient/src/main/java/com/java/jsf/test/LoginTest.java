package com.java.jsf.test;

import com.java.jsf.controller.LoginController;
import com.java.jsf.dao.Logindao;
import com.java.jsf.daoImpl.LogindaoImpl;
import com.java.jsf.model.Login;

public class LoginTest {
	
	public static void main(String[] args) {
		
		LoginController lg=new LoginController();
		
		
		Login login =new Login();
		
		login.setUsername("ravi");
		login.setPasscode("ravi");

		
		System.out.println(lg.signIn());
	}

}
