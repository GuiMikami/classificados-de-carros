
<%@page import="br.com.melfhcars.model.Carro"%>
<%@page import="java.util.List"%>
<% List<Carro> decricaoCarro = (List < Carro >) request.getAttribute("descricao");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
  <title>Document</title>
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
            <li><a href="cadastroCarro.html" class="nav-link px-2 link-dark1">Vender carro</a></li>
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
          <img src="<%= decricaoCarro.get(0).getFotoCarro()%>" alt="Foto do carro">
        <div class="carInfo">
            <h2 id="nome-car">
                <%= decricaoCarro.get(0).getNomeCarro() %>
            </h2>
          <h3 id="valor-car">R$ <%= decricaoCarro.get(0).getValor()%></h3>

          <div class="detalhes">
              <span id="ano-car"><%= decricaoCarro.get(0).getAno()%> -</span>

              <span id="estado-car"><%= decricaoCarro.get(0).getEstado()%> -</span>

              <span id="Km-car"><%= decricaoCarro.get(0).getKm()%>Km</span>
          </div>
        </div>
        <button id="Chmar no Zap" class="btn btn-outline-success">
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
      <li>Transmissão
        <label> ? </label>
      </li>
      <li>Acionamento de Rodas</li>
      <li>Final da Placa</li>
    </ul>
    <ul class="descricao">
      <li>N° de Portas</li>
      <li>Documentação</li>
      <li>Estado de Uso</li>
    </ul>
  </div>

</body>

</html>