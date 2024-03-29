<% String erro=(String) request.getAttribute("erro"); %>
    <%@ page contentType="text/html; charset=UTF-8" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Página de Login</title>
            <link rel="stylesheet" href="login.css">
        </head>

        <body>

        <%
        if (session.getAttribute("cpfLogado") != null) {
            response.sendRedirect("/tela-perfil");
        }
        %>
            <div class="login">
                <form action="/login" method="post">
                    <img src="img/Logo da Melph.png" width="140px" alt="">
                    <h2>Seja bem vindo!</h2>
                    <h2>Faça seu login para iniciar a sessão</h2>

                    <div class="box-user">
                        <input type="text" id="email" name="email" required>
                        <label>E-mail</label>
                    </div>
                    <div class="box-user">
                        <input type="password" id="password" name="password" required>
                        <label>Senha</label>
                    </div>
                    <div class="entrar">
                        <input type="submit" value="Entrar">
                        <p>
                            <% if(erro!=null){ out.print(erro); }%>
                        </p>
                        <c:if test="${not empty requestScope.invalidPasswordMessage}">
                            <span id="invalid-password-message"
                                style="color: ${requestScope.invalidPasswordColor};">${requestScope.invalidPasswordMessage}</span>
                        </c:if>
                    </div>


                    <div class="register">
                        <p> Não possui uma conta? <a href="cadastroCliente.html">Fazer Cadastro</a></p>
                    </div>

                </form>
            </div>
        </body>

        </html>