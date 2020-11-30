<%-- 
    Document   : cadastrarProdutos
    Created on : 19/10/2020, 00:28:22
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
        <title>Cadastro de Produtos</title>
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Cadastrar novo produto</h1>
        <form action="CadastrarProduto" method="POST">
            <p class="p_form">Nome</p>
            <input class="input_form" name="nome">
            <p class="p_form">descrição</p>
            <input class="input_form" name="desc">
            <p class="p_form">categoria</p>
            <input class="input_form" name="categoria">
            <p class="p_form">Quantidade</p>
            <input class="input_form" name="qtd">
            <p class="p_form">preço</p>
            <input class="input_form" name="preco">
            <button type="submit" class="submit">Enviar</button>
        </form>
    </body>
</html>
