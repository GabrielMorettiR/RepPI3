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
        <%@include file="../Menu_inc.jsp" %>
        <div class="main">

            <h1><a id="voltar" href="Protegido/index.jsp">◀</a>Nova Venda</h1>
            <form action="CadastrarVendas" method="POST">
                <p class="p_form">idproduto</p>
                <input class="input_form" name="idproduto" id="idproduto" onblur="mostraPreco();" required>
                <select name="SelProd" class="form-control">
                    <option>Lista de produtos</option>
                    <c:forEach var="produto" items="${listaProdutos}">
                        <option value="${produto.id}">
                            ${produto.id} - ${produto.nome}
                        </option>
                    </c:forEach>
                </select>
                <p class="p_form">cpf do Cliente</p>
                <input class="input_form" name="cpf" required>
                <select name="SelCliente" class="form-control">
                    <option>Lista de clientes</option>
                    <c:forEach var="cliente" items="${listaClientes}">
                        <option value="${cliente.cpf}">
                            ${cliente.cpf} - ${cliente.nome}
                        </option>
                    </c:forEach>
                </select>

                <p class="p_form">quantidade</p>
                <input class="input_form" name="quantidade" required>
<!--                <p class="p_form">preço</p>
                <input class="input_form" name="preco" type="">-->
                <p class="p_form">Id Filial</p>
                <input class="input_form" name="filial" readonly="true" value="${sessionScope.usuario.idperfil}">
                <select name="SelFilial" class="form-control">
                    <option>Lista de filiais</option>
                    <c:forEach var="filial" items="${listaFiliais}">
                        <option value="${filial.id}">
                            ${filial.id} - ${filial.nome}
                        </option>
                    </c:forEach>
                </select>
                <!--<a href="<c:url value="/SalvaCarrinho?id=8"/>"><p>+ Carrinho</p></a>-->
                <button type="submit" class="submit">Vender</button>
            </form>
        </div>
    </body>
</html>
