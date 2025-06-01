<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
  <h:form>
    <h:dataTable value="#{expenseController.expenseList}" var="exp" border="6">

      <h:column>
        <f:facet name="header">
          <h:outputText value="ID"/>
        </f:facet>
        <h:outputText value="#{exp.id}" />
      </h:column>

      <h:column>
        <f:facet name="header">
          <h:outputText value="Amount"/>
        </f:facet>
        <h:outputText value="#{exp.amount}" />
      </h:column>

      <h:column>
        <f:facet name="header">
          <h:outputText value="Description"/>
        </f:facet>
        <h:outputText value="#{exp.description}" />
      </h:column>

      <h:column>
        <f:facet name="header">
          <h:outputText value="Group"/>
        </f:facet>
        <h:outputText value="#{exp.group.name}" />
      </h:column>

      <h:column>
        <f:facet name="header">
          <h:outputText value="Paid By"/>
        </f:facet>
        <h:outputText value="#{exp.user.name}" />
      </h:column>

      <h:column>
        <f:facet name="header">
          <h:outputText value="Created At"/>
        </f:facet>
        <h:outputText value="#{exp.createdAt}" />
      </h:column>

    </h:dataTable>

    <br/>
    <h:commandButton value="Add Expense" action="addExpenses" />

  </h:form>
</f:view>
