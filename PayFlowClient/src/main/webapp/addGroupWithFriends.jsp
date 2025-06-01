<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<f:view>
<html>
<head>
    <title>Add Group</title>
</head>
<body>

<h:form>

    <h3>Create Group</h3>

    <h:outputLabel for="groupName" value="Group Name:" />
    <h:inputText id="groupName" value="#{groupController.group.name}" /><br/><br/>

    <h:outputLabel for="createdBy" value="Created By:" />
    <h:inputText id="createdBy" value="#{groupController.group.createdBy}" /><br/><br/>

    <h:outputLabel for="noOfDays" value="No of Days:" />
    <h:inputText id="noOfDays" value="#{groupController.group.noOfDays}" /><br/><br/>

    <h:outputLabel for="totalAmount" value="Total Amount:" />
    <h:inputText id="totalAmount" value="#{groupController.group.totalAmount}" /><br/><br/>

    <h:outputLabel for="minAmount" value="Minimum Amount:" />
    
    <h:inputText id="minAmount" value="#{groupController.group.minimumAmount}" /><br/><br/>

    <h3>Friends</h3>

    <h:dataTable value="#{groupController.friends}" var="friend" border="1">
        <h:column>
            <f:facet name="header">Name</f:facet>
            <h:inputText value="#{friend.name}" />
        </h:column>
        <h:column>
            <f:facet name="header">Email</f:facet>
            <h:inputText value="#{friend.email}" />
        </h:column>
    </h:dataTable>

    <br/>

    <h:commandButton value="Add Another Friend" action="#{groupController.addFriend}" /><br/><br/>
    <h:commandButton value="Save Group and Friends" action="#{groupController.addGroup}" />

</h:form>

</body>
</html>
</f:view>
