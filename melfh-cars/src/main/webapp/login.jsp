<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String erro = (String) request.getAttribute("erro");
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tela de Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="login.css" media="screen" />
    </head>

    <body>
    <div class="login-box">
        <div class="logo-container">
            <img src="img/Logo da Melph.png" width="140px" alt="">
        </div>
        <h2>Fazer Login</h2>
        <form action="/fazerLogin" method="post">
            <label for="email">E-mail:</label>
            <input type="text" id="email" name="email">
            <label for="password">Senha:</label>
            <input type="password" id="password" name="password">
            <input type="submit" value="Entrar">
            <p><%
                if(erro!= null){
                out.print(erro);
                }
             %></p>
        </form>
            <span>
                ${requestScope.message}
            </span>

        <div class ="signup-link-container">
            <p>Não possui uma conta? <a href="#">Fazer Cadastro</a></p>
        </div>
    </div>

    <span>
        ${requestScope.message}
    </span>

    </body>

</html>