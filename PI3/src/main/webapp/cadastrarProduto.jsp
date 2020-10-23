<%-- 
    Document   : cadastrarProduto
    Created on : 17/10/2020, 14:49:00
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Produto:</h1>
        <form action="CadastrarProduto" method="POST">
            <p>Nome:</p>
            <input name="nome">
            <p>Categoria:</p>
            <input name="categoria">
            <p>Quantidade:</p>
            <input name="quantidade">
            <p>Preço</p>
            <input name="preço">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
