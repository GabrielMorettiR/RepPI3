<%-- 
    Document   : index
    Created on : 18/10/2020, 18:12:33
    Author     : Gabriel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menu - Nerdolas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="../estilos.css" rel="stylesheet">

        <style>
            a{
                font-weight: bold;
                color: white;
                width: 200px;
                text-decoration: none;   
            }
            a:hover{
                color: #999;
            }
            .menuBtn{
                font-family: 'Poppins', sans-serif;
                transition-duration: 0.1s;
                background-color: #444;
                width: 200px;
                border: 2px solid white;
                border-radius: 1px;
            }
            .menuBtn:hover{
                font-size: 18px;
                color: #fff;
                background-color: #666;
                width: 240px;
            }
            .btns{
                width: 300px;
            }
            .user{
                background-color: inherit;
                color: #006699;
                font-family:  'Poppins', sans-serif;
                width: 100%;
            }
            .user:hover{
                text-decoration: underline;
                color: #006699;
                background-color: inherit;
            }
        </style>
    </head>
    <body>
        <div class="row" id="menu">
            <div class="col-sm-3">
                <h3 class='user'>
                    Bem vindo(a), <a>${sessionScope.usuario.nome}</a>
                    <br/>
                    Sessão de ${sessionScope.usuario.perfil}
                </h3>
            </div>
            <div class="col-sm-6" align="center">
                <h1>Sistema para Jogos Os Nerdolas</h1>
                <div class="btns">
                    <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                        <%--<c:if test="${sessionScope.usuario.admin || sessionScope.usuario.gerente}">--%>
                        <a href="<c:url value="/ListaClientes"/>"><p class='menuBtn'>Lista de Clientes</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.admin}">--%>
                        <a href="<c:url value="/CadastrarCliente"/>"><p class='menuBtn'>Cadastrar Clientes</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                        <%--<c:if test="${sessionScope.usuario.admin || sessionScope.usuario.gerente}">--%>
                        <a href="<c:url value="/ListaProdutos"/>"><p class='menuBtn'>Lista de Produtos</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.admin}">--%>
                        <a href="<c:url value="/CadastraProduto"/>"><p class='menuBtn'>Cadastrar Produtos</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                        <a href="<c:url value="/ListaRelatorio"/>"><p class='menuBtn'>Relatório</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.vendedor}">--%>
                        <a href="<c:url value="/CadastrarVendas"/>"><p class='menuBtn'>Realizar Venda</p></a>
                    <%--</c:if>--%>

                    <%--<c:if test="${sessionScope.usuario.gerente}">--%>
                        <a href="<c:url value="/CadastraUsuario"/>"><p class='menuBtn'>Cadastrar Usuário</p></a>
                    <%--</c:if>--%>
                </div>
            </div>
            <div class="col-sm-3" align='right'>
                <a href="<c:url value="/Logout_Servlet"/>" class="sair">Sair</a>
            </div>
        </div>
        <footer id='footer'>
            <p class='pfooter'>Desenvolvedores: 
                Bruno de Marzio 
                Ξ Gabriel Moretti 
                Ξ Ivan Takano 
                Ξ Leonardo Motta </p>
        </footer>
    </body>
</html>
