<%-- 
    Document   : alterarCliente
    Created on : 17/10/2020, 18:16:28
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Alteração do melequin ${cliente.nome}</h1>
        <form action="AlterarClientes" method="POST">
            <p>Nome</p>
            <input name="nome" value="${cliente.nome}">
            <p>Email</p>
            <input name="email" value="${cliente.email}">
            <p>CPF</p>
            <input name="cpf" value="${cliente.cpf}" readonly="true">
            <p>telefone</p>
            <input name="telefone" value="${cliente.telefone}">
            <p>endereço</p>
            <input name="endereco" value="${cliente.endereco}">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
