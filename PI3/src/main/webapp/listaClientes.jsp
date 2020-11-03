<%-- 
    Document   : listaClientes
    Created on : 16/10/2020, 16:42:55
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
        <title>Lista de Clientes</title>

    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Lista completa de Clientes</h1>
        <table class="tab">
            <thead>
            <th>Nome</th>
            <th>Email</th>
            <th>CPF</th>
            <th>Endereço</th>
            <th>Telefone</th>
        </thead>
        <tbody>
            <c:set var = "i" scope = "session" value = "${0}"/>
            <c:forEach var="cliente" items="${listaClientes}">
                <c:set var = "i" scope = "session" value = "${i+1}"/>
                <tr id="row${i}">
                    <td>${cliente.nome}</td>
                    <td>${cliente.email}</td>
                    <td>${cliente.cpf}</td>
                    <td>${cliente.endereco}</td>
                    <td>${cliente.telefone}</td>
                    <td class="options"><a href="AlterarClientes?cpf=${cliente.cpf}"><p id="alter" class="option">Alterar</p></a></td>
                    <td class="options"><a href="ExcluirClientes?cpf=${cliente.cpf}" onclick="return confirm('Confirma a exclusão do cliente ${cliente.nome}?')"><p id="excluir" class="option">Excluir</p></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
