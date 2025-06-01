<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
<head>
    <title>Add Expense</title>
</head>
<body>
    <f:view>
        <h:form>

            <h2>Add New Expense</h2>

            <h:outputLabel value="Amount: " for="amount" />
            <h:inputText id="amount" value="#{expenseController.expense.totalAmount}" /><br/><br/>

            <h:outputLabel value="Description: " for="desc" />
            <h:inputText id="desc" value="#{expenseController.expense.description}" /><br/><br/>

            <h:outputLabel value="Select Group:" for="group" />
            <h:selectOneMenu id="group" value="#{expenseController.groupId}">
                <f:selectItems value="#{expenseController.allGroups}" var="g"
                               itemValue="#{g.id}" itemLabel="#{g.name}" />
            </h:selectOneMenu><br/><br/>


            <h:outputLabel value="Paid By:" for="user" />
            <h:selectOneMenu id="user" value="#{expenseController.userId}">
                <f:selectItems value="#{expenseController.allUsers}" var="u"
                               itemValue="#{u.id}" itemLabel="#{u.name}" />
            </h:selectOneMenu><br/><br/>

            <h:commandButton value="Add Expense" action="#{expenseController.addExpense}" />

        </h:form>
    </f:view>
</body>
</html>
