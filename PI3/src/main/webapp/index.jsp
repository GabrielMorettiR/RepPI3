<%-- 
    Document   : index
    Created on : 18/10/2020, 18:12:33
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menu - Nerdolas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="estilos.css" rel="stylesheet">

        <style>
            a{
                font-weight: bold;
                color: #3664d1;
            }
            p{
                font-family: 'Poppins', sans-serif;
                transition-duration: 0.15s;
                background-color: white;
                width: 10%;
                border: 2px solid #3664d1;
                border-radius: 5px;
            }
            p:hover{
                color: #fff;
                background-color: #3664d1;
                width: 8%;
            }

        </style>
    </head>
    <body>
        <div align="center">
            <h1>Sistema para Jogos Os Nerdolas</h1>
            <a href="ListarClientes"><p>Lista de Clientes</p></a>
            <a href="cadastrarClientes.jsp"><p>Cadastrar Clientes</p></a>
            <a href="ListarProduto"><p>Lista de Produtos</p></a>
            <a href="cadastrarProdutos.jsp"><p>Cadastrar Clientes</p></a>
        </div>
    </body>
</html>
