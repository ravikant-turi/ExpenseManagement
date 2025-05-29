package com.java.jsf.dao;

import com.java.jsf.model.Login;

public interface Logindao {
	
	String  SignUp(Login login);
	
	String SignIn(Login login);

}
