
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./Styles/styleHome.css">
        <title>Tela Inicial</title>
    </head>
    <body>
        <h1>Home</h1>
         <p>Parabéns Você logou</p>

        <div class="divTable">
            <table border="1px">
                <thead>
                    <th>
                        <td>Marca</td>
                        <td>Modelo</td>
                        <td>Ano</td>
                        <td>Preço diária</td>
                    </th>
                </thead>
                <tbody>
                    <c:forEach var="carro" items="${carros}">
                    <tr>
                        <td>${carro.colunas}</td>
                        <td>${carro.marca}</td>
                        <td>${carro.modelo}</td>
                        <td>${carro.ano}</td>
                        <td>${carro.preco_diaria}</td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>     

    </body>
</html>
