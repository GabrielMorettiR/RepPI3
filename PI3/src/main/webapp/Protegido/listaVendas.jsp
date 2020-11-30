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
        <title>Relatório de Vendas</title>

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">
    </head>
    <body>
        <h1><a id="voltar" href="index.jsp">◀</a>Relatório</h1>
        <form>
        <div>
                <p class="p_form">Cliente</p>
                <select name="SelCliente" class="form-control">
                    <option value="Todos">
                        Todos
                    </option>
                    <c:forEach var="cliente" items="${listaClientes}" varStatus="in">
                        <option value="${cliente.cpf}">
                            ${cliente.cpf} - ${cliente.nome}
                        </option>
                    </c:forEach>
                </select>
                <p class="p_form">Categorias</p>
                <select name="SelCateg" class="form-control">
                    <option id="todaCat">
                        Todas
                    </option>
                    <c:forEach var="venda" items="${listaProdutos}">
                        <option>

                        </option>
                    </c:forEach>
                </select>
                <p class="p_form">Filiais</p>
                <select name="SelFili" class="form-control">
                    <option id="todaFil">
                        Todas
                    </option>
                    <c:forEach var="venda" items="${listaVendas}">
                        <option>
                            ${venda.filial}
                        </option>
                    </c:forEach>
                </select>
                <button class="p_form">Buscar</button>
                
        </div>
        </form>
        <br/>
        <table class="tab">
            <thead>
            <th>Id Venda</th>
            <th>Cliente</th>
            <th>Cpf</th>
            <th>Produto</th>
            <th>Quantidade</th>
            <th>Preço</th>
            <th>Nome Filial</th>
            <th>Categoria</th>
        </thead>
        <tbody>
            <c:set var = "i" scope = "session" value = "${0}"/>
            <c:forEach var="relatorio" items="${listaVendas}">
                <c:set var = "i" scope = "session" value = "${i+1}"/>
                <tr>
                    <td>${relatorio.idVenda}</td>
                    <td>${relatorio.nomeCliente}</td>
                    <td>${relatorio.cpf}</td>
                    <td>${relatorio.nomeProduto}</td>
                    <td>${relatorio.quantidade}</td>
                    <td>${relatorio.preco}</td>
                    <td>${relatorio.filial}</td>
                    <td>${relatorio.categoria}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
