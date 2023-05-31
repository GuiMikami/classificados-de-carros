<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@ page contentType="text/html; charset=UTF-8" %>
    <html lang="en">

    <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
      <link href="descricaocarro.css" rel="stylesheet">
      <link href="header.css" rel="stylesheet">
      <title>Descrição do Carro</title>
    </head>

    <body>

      <header>
        <div class="Logo">
          <a href="home.jsp"> </a>
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
          <a href="cadastroCliente.html">Cadastrar-se</a>
        </div>
      </header>


      <div class="container">
        <div class="imagem">
          <img src=" ${requestScope.descricao.fotoCarro} " alt="Foto do carro">
        </div>
        <div class="carInfo">
          <h2 id="nome-car">
            ${requestScope.descricao.nomeCarro}
          </h2>
          <h3 id="valor-car">R$ ${requestScope.descricao.valor}</h3>
          <div class="detalhes">
            <span id="ano-car">${requestScope.descricao.ano} - </span>
            <span id="estado-car"> ${requestScope.descricao.estado} - </span>
            <span id="Km-car">${requestScope.descricao.km} Km </span>
            <br>
            <div class="btn">
              <button id="voltarHome" class="btn btn-outline-success">
                <a href="/home.jsp"> Voltar para Página Inicial</a>
              </button>
              <button id="Chamar-no-Zap" class="btn btn-outline-success">
                <a href="https://web.whatsapp.com">Chamar no whatsapp</a>
              </button>

            </div>

          </div>
        </div>
      </div>

      <div class="text-center">
        <h4>Caracteristicas</h4>
        <div class="containerGeral">

          <ul class="descricao">
            <li>Transmissão: ${requestScope.descricao.transmissao}
            </li>
            <li>Acionamento de Rodas: ${requestScope.descricao.acionamento}</li>
            <li>Final da Placa: ${requestScope.descricao.finalPlaca}</li>
          </ul>
          <ul class="descricao">
            <li>N° de Portas: 4</li>
            <li>Documentação: ${requestScope.descricao.documento}</li>
            <li>Estado de Uso: ${requestScope.descricao.condicoes}</li>
          </ul>
        </div>
      </div>
    </body>

    </html>