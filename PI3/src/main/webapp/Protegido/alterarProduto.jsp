<%-- 
    Document   : alterarProduto
    Created on : 19/10/2020, 19:50:43
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
        <h1><a id="voltar" href="index.jsp">◀</a>Produto ${produto.nome}</h1>
        <form action="AlterarProduto" method="POST">
            <input name="id" type="hidden" value="${produto.id}">
            <p class="p_form">Nome</p>
            <input name="nome" value="${produto.nome}">
            <p class="p_form">descrição</p>
            <input name="desc" value="${produto.descricao}">
            <p class="p_form">categoria</p>
            <input name="categoria" value="${produto.categoria}">
            <p class="p_form">Quantidade</p>
            <input name="qtd" value="${produto.quantidade}">
            <p class="p_form">preço</p>
            <input name="preco" value="${produto.preco}">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
