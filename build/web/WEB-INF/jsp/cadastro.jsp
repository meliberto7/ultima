
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        
        <a href="./login">Voltar</a>

        <br>
        <br>

        <form action="./cadastrar" method="post">
            <input type="text" name="nome" placeholder="Nome"> <br> <br>
            <input type="text" name="email" placeholder="E-mail"> <br> <br>
            <input type="text" name="senha" placeholder="Senha"> <br> <br>
            <input type="text" name="telefone" placeholder="Telefone"> <br> <br>

            <button type="submit">Cadastrar</button>
        </form>

    </body>
</html>
