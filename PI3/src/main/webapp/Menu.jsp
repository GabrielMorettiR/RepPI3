<%-- 
    Document   : Menu
    Created on : 16/10/2020, 16:27:19
    Author     : Gabriel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
    <c:forEach var="i" begin="0" end="10">
        <p>${i}</p>
    </c:forEach>
        
    </body>
</html>
