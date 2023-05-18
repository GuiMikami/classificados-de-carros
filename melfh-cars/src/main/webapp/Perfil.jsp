<%@page import="java.util.List"%>
<%@page import="br.com.melfhcars.model.Carro"%>
<% List<Carro> tabelaCarro = (List<Carro>) request.getAttribute("listCar");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
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
    <link href="Perfil.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
    <main class="d-flex flex-nowrap">
        <h1 class="visually-hidden">Sidebars examples</h1>
      
        <div class="d-flex flex-column flex-shrink-0 p-3 text-bg-dark" style="width: 280px;">
          <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
            <svg class="bi pe-none me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
            <span class="fs-4">Sidebar</span>
          </a>
          <hr>
          <ul class="nav nav-pills flex-column mb-auto">
            <li class="nav-item">
              <a href="#" class="nav-link active" aria-current="page">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#home"/></svg>
                Home
              </a>
            </li>
            <li>

              <a href="anuncio.html" class="nav-link text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#speedometer2"/></svg>
                Comprar carro
              </a>
            </li>
            <li>
              <a href="cadastroCarro.jsp" class="nav-link text-white">
                    <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#table"/></svg>
                Vender seu Carro
              </a>
            </li>
            <li>
              <a href="sobre.html" class="nav-link text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
                Sobre Nós
              </a>
            </li>
            <li>
              <a href="#" class="nav-link text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
                Customers
              </a>
            </li>
          </ul>
          <hr>
        </div>

        <div class="container">
            <h1> Meus Carros </h1>
        <table class="table">
            <thead>
              <tr>
                <th scope="col" >Placa</th>
                <th scope="col">Carro</th>
                 <th class="hidden-column" scope="col">Final da Placa</th>
                <th scope="col">Ano</th>
                <th scope="col">Km</th>
                <th scope="col">Valor</th>
                <th class="hidden-column" scope="col">Transmissão</th>
                 <th class="hidden-column" scope="col">Acionamento</th>
                <th scope="col">   </th>
              </tr>
            </thead>
            <tbody>

                 <form action="/delete-car" method="post">
                    <% if (tabelaCarro != null) { %>
                   <% for (int i = 0; i < tabelaCarro.size(); i++) { %>

              <tr>
                <th scope="row"> <%=tabelaCarro.get(i).getPlaca()%> </th>
                <th scope="row"> <%=tabelaCarro.get(i).getNomeCarro()%> </th>
                <th class="hidden-column" scope="row"> <%=tabelaCarro.get(i).getFinalPlaca()%></th>
                <th scope="row"> <%=tabelaCarro.get(i).getAno()%> </th>
                <th scope="row"> <%=tabelaCarro.get(i).getKm()%> </th>
                <th scope="row"> <%=tabelaCarro.get(i).getValor()%> </th>
                 <th class="hidden-column" scope="row"> <%=tabelaCarro.get(i).getTransmissao()%></th>
                  <th class="hidden-column" scope="row">  <%=tabelaCarro.get(i).getAcionamento()%></th>

                <th scope="row">
                <div class="container">
                                <a href="/delete-car?placa=<%=tabelaCarro.get(i).getPlaca()%>"><button type="button" class="btn btn-danger">Deletar</button></a>
                                <a href="cadastroCarro.jsp?placa=<%= tabelaCarro.get(i).getPlaca() %>&nomeCarro=<%=tabelaCarro.get(i).getNomeCarro() %> &finalPlaca=<%= tabelaCarro.get(i).getFinalPlaca() %>&ano=<%=tabelaCarro.get(i).getAno()%>&km=<%=tabelaCarro.get(i).getKm()%>&valor=<%=tabelaCarro.get(i).getValor()%>&transmissao=<%=tabelaCarro.get(i).getTransmissao()%>&acionamento=<%=tabelaCarro.get(i).getAcionamento()%>"><button type="button" class="btn btn-warning">Alterar</button></a>
                            </div>
                            </th>

              </tr>
      <%}%>
      <%}%>
               </form>
            </tbody>
          </table>
        </div>
</body>
</html>
