<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="cadastroCliente.css">
    <link rel="stylesheet" href="header.css">
</head>

<body>

    <header>
        <div class="logo">
            <a href="home.jsp" </a>
                <img src="img/Logo da Melph.png" width="140px" alt="Logo da empresa">
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
            <a href="cadastroCliente.jsp">Cadastrar-se</a>
        </div>
    </header>

    <div class="container">
        <form action="/create-cliente" method="post">
            <h1>Cadastre-se agora para explorar uma ampla seleção de carros de QUALIDADE!</h1>

            <label for="nome">Nome:</label>
            <input maxlength="100" type="text" id="nome" name="nome" required placeholder="Nome completo">

            <div class="form-row">
                <div class="form-column">
                    <label for="cpf">CPF:</label>
                    <input maxlength="11" type="text" id="cpf" name="cpf" required>
                    <c:if test="${not empty erroCPF}">
                            <p>${erroCPF}</p>
                        </c:if>
                </div>

                <div class="form-column">
                    <label for="dataNasc">Data de Nascimento:</label>
                    <input type="date" id="dataNasc" name="dataNasc" required>
                </div>
            </div>
            <div class="form-row">
                <div class="form-column">
                    <label for="genero">Gênero:</label>
                    <select id="genero" name="genero" required>
                        <option value=""></option>
                        <option value="masculino">Masculino</option>
                        <option value="feminino">Feminino</option>
                        <option value="outro">Outro</option>
                    </select>
                </div>
                <div class="form-column">
                    <label for="email">Email:</label>
                    <input maxlength="80" type="email" id="email" name="email" required
                        placeholder="exemplo@exemplo.com">
                        <c:if test="${not empty erro}">
                                <p>${erro}</p>
                            </c:if>
                </div>
            </div>
            <div class="form-row">
                <div class="form-column">
                    <label for="senha">Senha:</label>
                    <input maxlength="13" type="password" id="senha" name="senha" required>
                </div>
                <div class="form-column">
                    <label for="estado">Estado:</label>
                    <input type="text" id="estado" name="estado" required>
                </div>
            </div>

            <div class="form-row">
                <div class="form-column">
                    <label for="celular">Contato:</label>
                    <input maxlength="11" type="tel" id="celular" name="celular" required>
                </div>
                <div class="form-column">
                    <button class="cadastrar" type="submit">Cadastrar</button>
                </div>

            </div>

    </div>
    </form>
    </div>
</body>

</html>