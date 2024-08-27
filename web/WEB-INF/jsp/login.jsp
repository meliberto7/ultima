
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Login</title>
    </head>
    <body>
        
        <h1>Login</h1>

        <form action="./logar" method="post">
            <input type="text" name="email" placeholder="Email">
            <input type="password" name="senha" placeholder="Senha"> <br> <br>
            <button type="submit">Logar</button>
        </form>

        <a href="./cadastro">Cadastrar</a>
        
    </body>
</html>
