<% String erro=(String) request.getAttribute("erro"); %>
    <!DOCTYPE html>
    <%@ page contentType="text/html; charset=UTF-8" %>
        <html>

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" type="text/css" href="login.css" media="screen" />
            <link rel="stylesheet" type="text/css" href="header.css" media="screen" />
            <title>Tela de Login</title>
        </head>

        <body>

            <header>
                <div class="logo">
                    <img src="img/Logo da Melph.png" width="140px" alt="logo">
                </div>
                <nav>
                    <ul>
                        <li><a href="home.jsp">Home</a></li>
                        <li><a href="cadastroCarro.jsp">Vender Carro</a></li>
                        <li><a href="Anuncio.jsp">Comprar Carro</a></li>
                        <li><a href="sobre.html">Sobre Nós</a></li>
                    </ul>
                </nav>
                <div class="user">
                    <a href="login.jsp">Entrar</a>
                    <a href="cadastroCliente.html">Cadastrar-se</a>
                </div>
            </header>

            <div class="container">
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
                        <p>
                            <% if(erro!=null){ out.print(erro); } %>
                        </p>
                    </form>
                    <c:if test="${not empty requestScope.invalidPasswordMessage}">
                        <span id="invalid-password-message"
                            style="color: ${requestScope.invalidPasswordColor};">${requestScope.invalidPasswordMessage}</span>
                    </c:if>
                </div>
            </div>
            <div class="signup-link-container">
                <p> Não possui uma conta? <a href="cadastroCliente.html">Fazer Cadastro</a></p>
            </div>
            </div>

        </body>

        </html>