
<%
    String erro = (String) request.getAttribute("erro");
%>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
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
        <form action="/login" method="post">
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
            <c:if test="${not empty requestScope.invalidPasswordMessage}">
                <span id="invalid-password-message" style="color: ${requestScope.invalidPasswordColor};">${requestScope.invalidPasswordMessage}</span>
            </c:if>


        <div class ="signup-link-container">
            <p> Não possui uma conta? <a href="#">Fazer Cadastro</a></p>
        </div>
    </div>

    </body>

</html>