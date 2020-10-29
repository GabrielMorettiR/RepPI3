<%-- 
    Document   : venda
    Created on : 27/10/2020, 14:54:24
    Author     : Gabriel
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Realizando vendinha</h1>
        <form action="CadastrarVenda" method="POST">
            <input name="idvenda" type="hidden" value="${venda.idVenda}">

            <p class="p_form">idproduto</p>
            <input name="idproduto">
            
<!--            <select name="produto" id="idproduto">
                <%--<c:forEach var="produto" items="${listaProduto}">--%>
                    <option value="${produto.id} - ${produto.nome}"></option>
                <%--</c:forEach>--%>
            </select>-->

            <p class="p_form">cpf do Cliente</p>
            <input name="cpf">
            
<!--            <select name="cpf" id="cpf">
                <%--<c:forEach var="cliente" items="${listaClientes}">--%>
                    <option value="${cliente.cpf}"></option>
                <%--</c:forEach>--%>
            </select>-->
                
            <p class="p_form">quantidade</p>
            <input name="quantidade">
            <p class="p_form">preço</p>
            <input name="preco">
            <p class="p_form">Id Filial</p>
            <input name="filial">
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
