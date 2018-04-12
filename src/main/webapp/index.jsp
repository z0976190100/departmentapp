<%@ page language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<%@ page import="static com.service.utils.MessageManager.responseMessages" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab" rel="stylesheet">
    <title>login page</title>
</head>
<body style="font-family:'Roboto Slab'">

<h2>login to start</h2>

<hr/>

<form name="login-form" method="POST" action="/main">
    <input type="hidden" name="command" value="login"/>
    Login:<br/>
    <input type="text" name="login" value=""><br/>
    Password:<br/>
    <input type="password" name="pass" value=""><br/>
    <input type="submit" value="Start">
</form>

<c:forEach var="mess" items="${MessageManager.responseMessages.split(\"#\")}">
    <h3><c:out value="${mess}"/></h3>
</c:forEach>

<% responseMessages = ""; %>

</body>
</html>
