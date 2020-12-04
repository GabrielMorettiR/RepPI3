<%-- 
    Document   : cadastrarUsuario
    Created on : 01/12/2020, 20:56:49
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
        <title>Cadastro de Usuários</title>
    </head>
    <body>
        <%@include file="../Menu_inc.jsp" %>
        <div class="main">
            <h1><a id="voltar" href="Protegido/index.jsp">◀</a>Cadastro de novo Usuário</h1>
            <form action="CadastraUsuario" method="POST">
                <p class="p_form">Nome</p>
                <input name="nome" class="input_form" required>
                <p class="p_form">Login</p>
                <input name="login" class="input_form" required>
                <p class="p_form">Senha</p>
                <input type='password' name="senha" class="input_form" required>
                <p class="p_form">Tipo de Perfil</p>
                <input name="perfil" class="input_form" required>
                <p class="p_form">Id Filial</p>
                <input name="filial" class="input_form" required>
                <button type="submit" class="submit">Enviar</button>
            </form>
        </div>
    </body>
</html>
