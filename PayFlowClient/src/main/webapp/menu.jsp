<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome - BookMyTrip</title>

    <style>
        body {
            background: linear-gradient(to right, #e0f7fa, #e1bee7);
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .message-box {
            background-color: white;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.2);
            text-align: center;
        }
        .message-box h2 {
            color: #6a1b9a;
        }
        .message-box p {
            font-size: 18px;
            color: #333;
            margin: 15px 0;
        }
        .trip-button {
            background-color: #8e24aa;
            color: white;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            text-decoration: none;
        }
        .trip-button:hover {
            background-color: #6a1b9a;
        }
    </style>
</head>

<body>
    <div class="message-box">
        <h2>Welcome to BookMyTrip 🎉</h2>
        <p>Book your own trip with your friends and create memories that last a lifetime!</p>

        <!-- Make a Trip button (redirects to addgroup.jsp) -->
        <h:form>
            <h:commandButton value="Make a Trip" action="addGroupWithFriends" styleClass="trip-button"/>
        </h:form>
        
        <h:form>
            <h:commandButton value="Make a Trip" action="exploreTrip" styleClass="trip-button"/>
        </h:form>
    </div>
</body>
</html>
</f:view>
