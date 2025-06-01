<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
<head>
    <style>
        .grid-box {
            width: 150px;
            height: 150px;
            background-color: #f2f2f2;
            border: 2px solid #ccc;
            margin: 10px;
            text-align: center;
            vertical-align: middle;
            display: flex;
            flex-direction: column;
            justify-content: center;
            border-radius: 10px;
            font-family: Arial;
            box-shadow: 2px 2px 8px rgba(0,0,0,0.1);
        }
        .grid-container {
            display: flex;
            flex-wrap: wrap;
        }
    </style>
</head>

<body>
<f:view>
    <h:form>
        <h1>Explore the Trip</h1>

        <div class="grid-container">

            <div class="grid-box">
                <h:graphicImage value="cab.png" width="50" height="50" />
                <h:outputText value="Cab" />
            </div>

            <div class="grid-box">
                <h:graphicImage value="lunch.png" width="50" height="50" />
                <h:outputText value="Lunch" />
            </div>

            <div class="grid-box">
                <h:graphicImage value="breakfast.png" width="50" height="50" />
                <h:outputText value="Breakfast" />
            </div>

            <div class="grid-box">
                <h:graphicImage value="hotel.png" width="50" height="50" />
                <h:outputText value="Hotel" />
            </div>

            <div class="grid-box">
                <h:graphicImage value="sightseeing.png" width="50" height="50" />
                <h:outputText value="Sightseeing" />
            </div>

        </div>

    </h:form>
</f:view>
</body>
</html>
