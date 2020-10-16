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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>criando um novo mulequin</h1>
        <form action="CadastrarClientes" method="POST">
            <p>Nome</p>
            <input name="nome">
            <p>Email</p>
            <input name="Email">
            <p>CPF</p>
            <input name="cpf">
            <p>telefone</p>
            <input name="telefone">
            <p>endereço</p>
            <input name="endereco">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
