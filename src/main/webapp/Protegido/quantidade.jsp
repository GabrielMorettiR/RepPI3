<%-- 
    Document   : quantidade
    Created on : 04/12/2020, 20:18:28
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css2?family=Commissioner&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link href="../estilos.css" rel="stylesheet">
        <title>Sucesso!</title>
        <style>
            a{
                font-weight: bold;
                color: white;
                width: 100px;
                text-decoration: none;
                text-align: center;
            }
            p{
                font-family: 'Poppins', sans-serif;
                transition-duration: 0.1s;
                background-color: #444;
                width: 100px;
                border: 2px solid white;
                border-radius: 1px;
            }
            p:hover{
                font-size: 18px;
                color: #fff;
                background-color: #666;
                width: 110px;
            }
        </style>
    </head>
    <body>
        <h1>Erro ao executar a operação: A quantidade solicitada é maior do que a quantidade do produto em estoque</h1>
        <a href="index.jsp"><p>Voltar</p></a>
    </body>
</html>
