<%-- 
    Document   : Menu_inc
    Created on : 01/12/2020, 18:03:35
    Author     : Gabriel
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .sidenav {
                height: 100%;
                width: 180px;
                position: fixed;
                z-index: 1;
                top: 0;
                left: 0;
                background-color: #444;
                overflow-x: hidden;
            }
            .sidebtn{
                font-family: 'Poppins', sans-serif;
                color: #fff;
                transition-duration: 0.3s;
            }
            .sidebtn:hover{
                color: #bbb;
                font-size: 18px;
            }
            .sidep{
                background-color: #555;
            }
            .sidep:hover{
                background-color: #777;
            }
            #sidetitle{
                text-align: center;
                color: #999;
            }
            #sair{
                background-color: #d64848;
                width: 180px;
            }
        </style>
    </head>
    <body>
        <div class="sidenav">
            <h1 id="sidetitle">Nerdolas</h1>
            <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                <%--<c:if test="${sessionScope.usuario.admin || sessionScope.usuario.gerente}">--%>
                <a class="sidebtn" href="<c:url value="/ListaClientes"/>"><p class='sidep'>Lista de Clientes</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.admin}">--%>
                <a class="sidebtn" href="<c:url value="/CadastrarCliente"/>"><p class='sidep'>Cadastrar Clientes</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                <%--<c:if test="${sessionScope.usuario.admin || sessionScope.usuario.gerente}">--%>
                <a class="sidebtn" href="<c:url value="/ListaProdutos"/>"><p class='sidep'>Lista de Produtos</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.admin}">--%>
                <a class="sidebtn" href="<c:url value="/CadastraProduto"/>"><p class='sidep'>Cadastrar Produtos</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.gerente} ">--%>
                <a class="sidebtn" href="<c:url value="/ListaRelatorio"/>"><p class='sidep'>Relatório</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.vendedor}">--%>
                <a class="sidebtn" href="<c:url value="/CadastrarVendas"/>"><p class='sidep'>Realizar Venda</p></a>
            <%--</c:if>--%>

            <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                <a class="sidebtn" href="<c:url value="/CadastraUsuario"/>"><p class='sidep'>Cadastrar Usuário</p></a>
            <%--</c:if>--%>
            <a class="sidebtn" href="<c:url value="/Logout_Servlet"/>" class="sair"><p id="sair">Sair</p></a>
        </div>
    </body>
</html>
