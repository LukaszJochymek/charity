<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lukasz
  Date: 19.05.2023
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> </title>

</head>
<body>
<form:form method="post" modelAttribute="donation">
    <form:checkboxes path="categories" items="${category}" itemLabel="name" itemValue="id"/>
    <form:select path="institution" items="${institution}" itemLabel="name" itemValue="id"/>
    <form:input path="zipCode" />
    <form:input path="street" />
    <form:input path="city"/>
    <form:input path="quantity"/>
    <form:textarea path="pickUpComment"/>
    <form:input type="date" path="pickUpDate"/>
    <form:input type="time" path="pickUpTime" />

</form:form>
</body>
</html>
