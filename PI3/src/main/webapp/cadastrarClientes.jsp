<%-- 
    Document   : cadastrarClientes
    Created on : 16/10/2020, 16:56:58
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
        <h1><a id="voltar" href="index.jsp">◀</a>criando um novo mulequin</h1>
        <form action="CadastrarClientes" method="POST">
            <p class="p_form">Nome</p>
            <input name="nome">
            <p class="p_form">Email</p>
            <input name="Email">
            <p class="p_form">CPF</p>
            <input name="cpf">
            <p class="p_form">telefone</p>
            <input name="telefone">
            <p class="p_form">endereço</p>
            <input name="endereco">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
