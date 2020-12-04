<%-- 
    Document   : carrinho
    Created on : 04/12/2020, 19:15:09
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrinho</title>

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">
    </head>
    <body>
        <%@include file="../Menu_inc.jsp" %>
        <div class="main">

            <h1><a id="voltar" href="<c:url value="/CadastrarVendas"/>">◀</a>Carrinho</h1>

            <table class="tab">
                <thead>
                <th>Nome</th>
                <th>Email</th>
                <th>CPF</th>
                <th>Endereço</th>
                <th>Telefone${id}</th>
                </thead>
                <tbody>
                    <c:set var = "i" scope = "session" value = "${0}"/>
                    <c:forEach var="cliente" items="${listaClientes}">
                        <c:set var = "i" scope = "session" value = "${i+1}"/>
                        <tr id="row${i}">
                            <td></td>
                            <td>${cliente.email}</td>
                            <td>${cliente.cpf}</td>
                            <td>${cliente.endereco}</td>
                            <td>${cliente.telefone}</td>
                            <td class="options"><a href="AlteraCliente?cpf=${cliente.cpf}"><p id="alter" class="option">Alterar</p></a></td>
                            <td class="options"><a href="ExcluirCliente?cpf=${cliente.cpf}" onclick="return confirm('Confirma a exclusão do cliente ${cliente.nome}?')"><p id="excluir" class="option">Excluir</p></a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            
                <button type="submit" class="submit">Vender</button>
        </div>
    </body>
</html>
