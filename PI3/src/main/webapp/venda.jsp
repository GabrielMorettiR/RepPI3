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
        <title>Venda</title>

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Nova Venda</h1>
        <form action="CadastrarVenda" method="POST">
            <p class="p_form">idproduto</p>
            <input class="input_form" name="idproduto">
            <p class="p_form">cpf do Cliente</p>
            <input class="input_form" name="cpf">
<!--            <select name="SelCliente" class="form-control">
                <c:forEach var="cliente" items="${listaClientes}">
                    <option value="${cliente.cpf}">
                        - ${cliente.cpf}
                    </option>
                </c:forEach>
            </select>-->

            <p class="p_form">quantidade</p>
            <input class="input_form" name="quantidade">
            <p class="p_form">preço</p>
            <input class="input_form" name="preco">
            <p class="p_form">Id Filial</p>
            <input class="input_form" name="filial">
            <button type="submit" class="submit">Enviar</button>
        </form>
    </body>
</html>
