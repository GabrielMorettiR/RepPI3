<%-- 
    Document   : listaVendas
    Created on : 28/10/2020, 18:41:08
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
        <h1><a id="voltar" href="index.jsp">◀</a>Relatório</h1>
        <table class="tab">
            <thead>
            <th>Id Venda</th>
            <th>Id Produto</th>
            <th>Cpf Cliente</th>
            <th>Quantidade</th>
            <th>Preço</th>
            <th>idFilial</th>
        </thead>
        <tbody>
        <c:forEach var="venda" items="${listaVendas}">
            <tr>
                <td>${venda.idVenda}</td>
                <td>${venda.idproduto}</td>
                <td>${venda.cpf}</td>
                <td>${venda.quantidade}</td>
                <td>R$ ${venda.preco}</td>
                <td>${venda.filial}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
