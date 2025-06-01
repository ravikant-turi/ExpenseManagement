<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<f:view>
  <h:head>
    <title>Group List</title>
  </h:head>
  <h:body>
    <h1>All Groups</h1>

    <h:dataTable value="#{groupController.groupList}" var="g" border="1">
      <h:column>
        <f:facet name="header">ID</f:facet>
        #{g.id}
      </h:column>
      <h:column>
        <f:facet name="header">Group Name</f:facet>
        #{g.name}
      </h:column>
      <h:column>
        <f:facet name="header">Created By</f:facet>
        #{g.createdBy}
      </h:column>
      <h:column>
        <f:facet name="header">Total Amount</f:facet>
        #{g.totalAmount}
      </h:column>
    </h:dataTable>

    <h:link outcome="addGroupWithFriends.jsp" value="Add New Group" />
  </h:body>
</f:view>
</html>
