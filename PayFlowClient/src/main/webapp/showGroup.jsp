<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
  <h:form>
    <h:dataTable value="#{groupController.getGroupList()}" var="grp" border="6" >

      <h:column>
      <f:facet name="header">
      <h:outputText value="id"/>
      </f:facet>
        <h:outputText value="#{grp.id}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="name"/>
      </f:facet>
        <h:outputText value="#{grp.name}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="createdAt"/>
      </f:facet>
        <h:outputText value="#{grp.createdAt}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="createdBy"/>
      </f:facet>
        <h:outputText value="#{grp.createdBy}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="noOfDays"/>
      </f:facet>
        <h:outputText value="#{grp.noOfDays}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="totalAmount"/>
      </f:facet>
        <h:outputText value="#{grp.totalAmount}" />
      </h:column>

      <h:column>
      <f:facet name="header">
      <h:outputText value="minimumAmount"/>
      </f:facet>
        <h:outputText value="#{grp.minimumAmount}" />
      </h:column>

    </h:dataTable>
    
        <h:commandButton value="add Group" action="addGroup" />
    
  </h:form>
</f:view>
