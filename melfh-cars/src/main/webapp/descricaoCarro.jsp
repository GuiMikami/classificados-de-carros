<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <title>Descrição do Carro</title>
</head>

<body>
  <div class="container">
    <div class="bg-dark">
      <div class="logo titulo">
        <header
          class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
          <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-white text-decoration-none">
            <img src="img/Logo da Melph.png" width="140px" alt="">
          </a>

          <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><a href="cadastroCarro.jsp" class="nav-link px-2 link-dark1">Vender carro</a></li>
            <li><a href="anuncio.html" class="nav-link px-2 link-dark1">Comprar carro </a></li>
            <li><a href="sobre.html" class="nav-link px-2 link-dark1">Um pouco sobre nós</a></li>
          </ul>

          <div class="col-md-3 text-end">
            <button type="button" class="btn btn-outline-primary me-2">Login</button>
            <button type="button" class="btn btn-primary">Sign-up</button>
          </div>
        </header>
      </div>
    </div>
  </div>

  <div class="containerInfo">
    <div class="container">
      <div class="imagem">
          <img src=" ${requestScope.descricao.fotoCarro} " alt="Foto do carro">
        <div class="carInfo">
            <h2 id="nome-car">
        ${requestScope.descricao.nomeCarro}
            </h2>
          <h3 id="valor-car">R$ ${requestScope.descricao.valor}</h3>

          <div class="detalhes">
              <span id="ano-car">${requestScope.descricao.ano} - </span>

              <span id="estado-car"> ${requestScope.descricao.estado} - </span>

              <span id="Km-car">${requestScope.descricao.km} Km </span>
          </div>
        </div>
            <button id="Chamar-no-Zap" class="btn btn-outline-success">
                Voltar para Página Inicial
            </button>
        <button id="Chamar-no-Zap" class="btn btn-outline-success">
          Chamar no zap
        </button>
      </div>
    </div>
  </div>

    <div class="text-center">
      <h1>Caracteristicas</h1>
    </div>

    <h3>Geral</h3>
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

</body>

</html>