<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
  <h:form>
    <h2>Add Expense</h2>

    <h:panelGrid columns="2">

      <!-- Group ID -->
      <h:outputLabel value="Group ID:" />
      <h:inputText value="#{expenseController.groupId}" />

      <!-- Paid By User ID -->
      <h:outputLabel value="User ID (Paid By):" />
      <h:inputText value="#{expenseController.userId}" />

      <!-- Description -->
      <h:outputLabel value="Description:" />
      <h:inputText value="#{expenseController.expense.description}" />

      <!-- Total Amount -->
      <h:outputLabel value="Total Amount:" />
      <h:inputText value="#{expenseController.expense.totalAmount}" />

      <!-- Expense Date -->
      <h:outputLabel value="Expense Date (yyyy-mm-dd):" />
      <h:inputText value="#{expenseController.expense.expenseDate}" />

      <!-- Submit Button -->
      <h:outputText />
      <h:commandButton value="Add Expense" action="#{expenseController.addExpensecontroller}" />

    </h:panelGrid>
  </h:form>
</f:view>
