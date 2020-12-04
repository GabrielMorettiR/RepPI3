<%-- 
    Document   : alterarProduto
    Created on : 19/10/2020, 19:50:43
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
        <h1><a id="voltar" href="<c:url value="/ListarProduto"/>">◀</a>Produto ${produto.nome}</h1>
        <form action="AlteraProduto" method="POST">
            <input class="input_form" name="id" type="hidden" value="${produto.id}">
            <p class="p_form">Nome</p>
            <input class="input_form" name="nome" value="${produto.nome}" required>
            <p class="p_form">descrição</p>
            <input class="input_form" name="desc" value="${produto.descricao}" required>
            <p class="p_form">categoria</p>
            <input class="input_form" name="categoria" value="${produto.categoria}" required>
            <p class="p_form">Quantidade</p>
            <input class="input_form" name="qtd" value="${produto.quantidade}" required>
            <p class="p_form">preço</p>
            <input class="input_form" name="preco" value="${produto.preco}" required>
            <button type="submit" class="submit">Enviar</button>
        </form>
    </body>
</html>
