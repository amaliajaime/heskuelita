<%--
  Created by IntelliJ IDEA.
  User: Amalia
  Date: 8/3/2019
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.capgemini.heskuelita.core.beans.User" contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>

<head>

    <meta charset="US-ASCII">

    <title>Login Page</title>

</head>


<body>


<%User us = (User)session.getAttribute ("user");%>
Bienvenido : <%=us.getUserName() + " [" + us.getEmail()  + "]"%>

</body>

</html>