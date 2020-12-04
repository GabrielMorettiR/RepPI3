<%-- 
    Document   : alterarCliente
    Created on : 17/10/2020, 18:16:28
    Author     : Gabriel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="<c:url value="estilos.css"/>" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a id="voltar" href="<c:url value="/ListarClientes"/>">◀</a>Alteração do melequin ${cliente.nome}</h1>
        <form action="AlteraCliente" method="POST">
            <p class="p_form">Nome</p>
            <input class="input_form" name="nome" value="${cliente.nome}" required>
            <p class="p_form">Email</p>
            <input class="input_form" name="email" value="${cliente.email}" required>
            <p class="p_form">CPF</p>
            <input class="input_form" name="cpf" value="${cliente.cpf}" readonly="true">
            <p class="p_form">telefone</p>
            <input class="input_form" name="telefone" value="${cliente.telefone}" required>
            <p class="p_form">endereço</p>
            <input class="input_form" name="endereco" value="${cliente.endereco}" required>
            <button type="submit" class="submit">Enviar</button>
        </form>
    </body>
</html>
