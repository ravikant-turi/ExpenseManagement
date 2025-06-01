<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<f:view>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <h:form>
        <h2>Add a New User</h2>

        <h:panelGrid columns="2" cellpadding="5">
            <h:outputLabel for="name" value="Name:" />
            <h:inputText id="name" value="#{groupController.user.name}" required="true" />

            <h:outputLabel for="email" value="Email:" />
            <h:inputText id="email" value="#{groupController.user.email}" required="true" />

            <!-- Add more user fields as needed -->

            <h:commandButton value="Save User" action="#{groupController.addUser}" />
        </h:panelGrid>
    </h:form>
</body>
</html>
</f:view>
