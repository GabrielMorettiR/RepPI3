<%-- 
    Document   : listaProdutos
    Created on : 18/10/2020, 23:18:49
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
        <link href="estilos.css" rel="stylesheet">
        <title>Lista de Produtos</title>
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Lista completa de Produtos</h1>
        <table class="tab">
            <thead>
                <th>Nome</th>
                <th>Descrição</th>
                <th>idCategoria</th>
                <th>Qtd.</th>
                <th>Preço</th>
            </thead>
            <tbody>
            <c:forEach var="produto" items="${listaProdutos}">
                <tr>
                    <td>${produto.nome}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.categoria}</td>
                    <td>${produto.quantidade}</td>
                    <td>R$ ${produto.preco}</td>
                    <td class="options"><a href="AlterarProduto?id=${produto.id}"><p id="alter" class="option">Alterar</p></a></td>
                    <td class="options"><a href="ExcluirProduto?id=${produto.id}" onclick="return confirm('Confirma a exclusão do produto ${produto.nome}?')"><p id="excluir" class="option">Excluir</p></a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </body>
</html>
