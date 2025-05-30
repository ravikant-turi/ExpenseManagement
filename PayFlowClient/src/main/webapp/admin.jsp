<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
</head>

<body>

    <h:form>

        <h2>Admin Login</h2>

        <!-- Show login errors -->
        <h:messages globalOnly="true" layout="table" style="color: red;" />

        <h:outputLabel value="Admin Name: " />
        <h:inputText value="#{adminController.admin.adminname}" /><br/>

        <h:outputLabel value="Passcode: " />
        <h:inputSecret value="#{adminController.admin.passcode}" /><br/>

        <h:commandButton value="Sign In" action="#{adminController.signIn}" />
        <h:commandButton value="Sign Up" action="#{adminController.signUp}" />

    </h:form>

</body>
</html>
</f:view>
