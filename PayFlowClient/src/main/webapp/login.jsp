<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>User Records</title>

	
</head>

<body >
     
    <h:form>

    <h2>User Login</h2>

    <!-- Show global messages like login error -->
    <h:messages globalOnly="true" layout="table" style="color: red;" />

    <h:outputLabel value="Username: " />
    <h:inputText value="#{loginController.login.username}" /><br/>

    <h:outputLabel value="Password: " />
    <h:inputSecret value="#{loginController.login.passcode}" /><br/>

    <h:commandButton value="Sign In" action="#{loginController.signIn}" />
    <h:commandButton value="Sign Up" action="#{loginController.signUp}" />

</h:form>
    
	

</body>
</html>
</f:view>
