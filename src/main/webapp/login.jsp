<%-- 
    Document   : login
    Created on : 14/11/2020, 19:56:17
    Author     : Bruno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">        
        <title>Login</title>

    </head>
    <body>
        <h1>Tela de Login</h1>
        <c:if test="${param.erro == 1}">
            <div>Usuário não Encontrado</div>
        </c:if>
        <form action="LoginServlet" method="POST">
            <p class="p_form">Nome de Usuário: </p>
            <input name="login" class="input_form" required>
            <p class="p_form">Senha: </p>
            <input type="password" name="senha" class="input_form" required>
            <button type="submit" class="submit">Entrar</button>
        </form>
            <footer>
                Desenvolvido por Bruno de Marzio<br/>
                Gabriel Moretti<br/>
                Ivan Takano<br/>
                Leonardo Motta<br/>
            </footer>
    </body>
</html>
