<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-10
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>List Category</title>
</head>
<body>
<style>
    table{
        border: 1px solid lightskyblue;
    }
    td{
        width: 200px;
        border: 1px solid lightskyblue;
        background-color: lightblue;
    }
</style>
<table align="center"border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
