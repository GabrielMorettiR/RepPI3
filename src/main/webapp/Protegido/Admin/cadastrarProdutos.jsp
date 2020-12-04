<%-- 
    Document   : cadastrarProdutos
    Created on : 19/10/2020, 00:28:22
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
        <title>Cadastro de Produtos</title>
    </head>
    <body>
        <%@include file="../Menu_inc.jsp" %>
        <div class="main">
            <h1><a id="voltar" href="Protegido/index.jsp">◀</a>Cadastrar novo produto</h1>
            <form action="CadastraProduto" method="POST">
                <p class="p_form">Nome</p>
                <input class="input_form" name="nome" required>
                <p class="p_form">descrição</p>
                <input class="input_form" name="desc">
                <p class="p_form">categoria</p>
                <input class="input_form" name="categoria" required>
                <select name="SelCateg" class="form-control">
                    <option>Lista de categorias</option>
                    <c:forEach var="categoria" items="${listaCategoria}">
                        <option value="${categoria.id}">
                            ${categoria.id} - ${categoria.titulo}
                        </option>
                    </c:forEach>
                </select>
                <p class="p_form">Quantidade</p>
                <input class="input_form" name="qtd" required>
                <p class="p_form">preço</p>
                <input class="input_form" name="preco" required>
                <button type="submit" class="submit">Enviar</button>
            </form>
        </div>
    </body>
</html>
