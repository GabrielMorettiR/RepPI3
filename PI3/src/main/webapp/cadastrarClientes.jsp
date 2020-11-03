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
        <title>Cadastro de Clientes</title>
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Cadastro de Cliente</h1>
        <form action="CadastrarClientes" method="POST">
            <p class="p_form">Nome</p>
            <input name="nome" class="input_form">
            <p class="p_form">Email</p>
            <input name="Email" class="input_form">
            <p class="p_form">CPF</p>
            <input name="cpf" class="input_form">
            <p class="p_form">telefone</p>
            <input name="telefone" class="input_form">
            <p class="p_form">endereço</p>
            <input name="endereco" class="input_form">
            <button type="submit" class="submit">Enviar</button>
        </form>
    </body>
</html>
