<%@page import="java.util.List" %>
  <%@page import="br.com.melfhcars.model.Carro" %>
    <% List<Carro> tabelaCarro = (List<Carro>) request.getAttribute("listCar");%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
          <%@ page contentType="text/html; charset=UTF-8" %>


            <!DOCTYPE html>
            <html lang="pt-br">

            <head>
              <meta charset="UTF-8">
              <meta http-equiv="X-UA-Compatible" content="IE=edge">
              <meta name="viewport" content="width=device-width, initial-scale=1.0">
              <title>Meus carros cadastrados</title>

              <link rel="stylesheet" href="novatelaperfil.css">
            </head>

            <body>

              <header>
                <div class="logo">
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
                  <c:choose>
                    <c:when test="${empty sessionScope.UsuarioLogado}">
                      <% response.sendRedirect(request.getContextPath() + "/login.jsp" ); %>
                    </c:when>
                    <c:otherwise>
                      <a href="/logout">Logout</a>
                    </c:otherwise>
                  </c:choose>
                </div>
              </header>



              <h1> Meus carros cadastrados </h1>
              <h2> <span>Sessão iniciada com CPF:${sessionScope.cpfLogado}</span></h2>
              <div class="container">
                <table class="table">
                  <thead>

                    <tr>
                      <th scope="col">Placa</th>
                      <th scope="col">Carro</th>
                      <th class="hidden-column" scope="col">Final da Placa</th>
                      <th scope="col">Ano</th>
                      <th scope="col">Km</th>
                      <th scope="col">Valor</th>
                      <th class="hidden-column" scope="col">Transmissão</th>
                      <th class="hidden-column" scope="col">Acionamento</th>
                      <th class="hidden-column" scope="col">documento</th>
                      <th class="hidden-column" scope="col">condição</th>
                      <th class="hidden-column" scope="col">Fotos do carro</th>
                      <th scope="col"> </th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="car" items="${listCar}">

                      <tr>
                        <th scope="row"> ${car.placa} </th>
                        <th scope="row"> ${car.nomeCarro} </th>
                        <th class="hidden-column" scope="row"> ${car.finalPlaca} </th>
                        <th scope="row"> ${car.ano} </th>
                        <th scope="row"> ${car.km} </th>
                        <th scope="row"> ${car.valor} </th>
                        <th class="hidden-column" scope="row"> ${car.transmissao} </th>
                        <th class="hidden-column" scope="row"> ${car.acionamento} </th>
                        <th class="hidden-column" scope="col">${car.documento}</th>
                        <th class="hidden-column" scope="col">${car.condicoes}</th>
                        <th class="hidden-column" scope="col">${car.fotoCarro}</th>
                        <th scope="row">
                          <form action="/delete-car" method="post">
                            <div class="btn">
                              <a href="/delete-car?placa=${car.placa}"><button type="button"
                                  class="btn btn-danger">Deletar</button></a>
                              <a
                                href="cadastroCarro.jsp?placa= ${car.placa}&nomeCarro=${car.nomeCarro}&finalPlaca=${car.finalPlaca}&ano=${car.ano}&km=${car.km}&valor=${car.valor}&transmissao=${car.transmissao}&acionamento=${car.acionamento}&documento=${car.documento}&condicoes=${car.condicoes}&imagem=${car.fotoCarro}"><button
                                  type="button" class="btn btn-warning">Alterar</button></a>
                            </div>
                        </th>

                      </tr>
                    </c:forEach>

                    </form>
                  </tbody>
                </table>
              </div>



              <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
                crossorigin="anonymous"></script>
              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
                crossorigin="anonymous">
            </body>

            </html>