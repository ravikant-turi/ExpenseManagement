
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>

<html>

<head><title>Add Group</title></head>

<body>

<h:form>

    <h3>Add Group</h3>

    <h:outputLabel value="Name: " />
    <h:inputText value="#{groupController.group.name}"/><br/><br/>

    <h:outputLabel value="Created By (Admin ID): " />
    <h:inputText value="#{groupController.group.createdBy}"/><br/><br/>

    <h:outputLabel value="No Of Days: " />
    <h:inputText value="#{groupController.group.noOfDays}"/><br/><br/>

    <h:outputLabel value="Total Amount: " />
    <h:inputText value="#{groupController.group.totalAmount}"/><br/><br/>

    <h:outputLabel value="Minimum Amount: " />
    <h:inputText value="#{groupController.group.minimumAmount}"/><br/><br/>

    <h:commandButton value="Save" action="#{groupController.addGroup}" />
    
    <h:commandButton value="Show All" action="showGroup" />

</h:form>

</body>

</html>

</f:view>
