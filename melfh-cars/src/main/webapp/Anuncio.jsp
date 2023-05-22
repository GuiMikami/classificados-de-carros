<%@page import="java.util.List"%>
<%@page import="br.com.melfhcars.model.Carro"%>
<% List<Carro> listaCars = (List<Carro>) request.getAttribute("cars");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
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
        
    <link href="Anuncio.css" rel="stylesheet">
    <link href="header.css" rel="stylesheet">
    <title>Comprar Carros</title>
</head>

<body>
<div class="container">
    <div class="bg-dark">
        <div class="logo titulo">
            <header>
                <div class="logo">
                    <img src="img/Logo da Melph.png" width="140px" alt="Logo da empresa">
                </div>
                <nav>
                    <ul>
                        <li><a href="home.jsp" >Home</a></li>
                        <li><a href="cadastroCarro.jsp" >Vender Carro</a></li>
                        <li><a href="Anuncio.jsp" >Comprar Carro</a></li>
                        <li><a href="sobre.html" >Sobre Nós</a></li>
                    </ul>
                </nav>
                <div class="user">
                    <a href="login.jsp">Entrar</a>
                    <a href="cadastroCliente.html">Cadastrar-se</a>
                </div>
            </header>
        </div>
    </div>
</div>
<br>
<div class="container">
    <div class="container1">
<div class="sidebar">
    <form action="/Anuncio" method="get">
    <div class="flex-shrink-0 p-3" style="width: 280px;">
        <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
        <div class="input-group">
            <input type="text" id="buscar" name="buscar" class="form-control">
            <button type="submit" class="btn btn-primary">Pesquisar</button>
        </div>
    </div>
</form>
    <ul class="list-unstyled ps-0 bg-dark">
        <li class="mb-1">
            <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
                Marca
            </button>
            <div class="collapse show" id="home-collapse">
                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                    <li class="link-item"><a href="/Anuncio?buscar=Toyota" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Toyota</a></li>
                    <li><a href="/Anuncio?buscar=Honda" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Honda</a></li>
                    <li><a href="/Anuncio?buscar=Fiat" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Fiat</a></li>
                    <li><a href="/Anuncio?buscar=Tesla" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Tesla</a></li>
                    <li><a href="/Anuncio?buscar=Chevrolet" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Chevrolet</a></li>
                    <li><a href="/Anuncio?buscar=Volkswagen" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Volkswagen</a></li>
                    <li><a href="/Anuncio?buscar=Nissan" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Nissan</a></li>
                    <li><a href="/Anuncio?buscar=Mercedes-Benz" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Mercedes-Benz</a></li>
                    <li><a href="/Anuncio?buscar=Audi" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Audi</a></li>
                    <li><a href="/Anuncio?buscar=BMW" class="link-body-emphasis d-inline-flex text-decoration-none rounded">BMW</a></li>
                    <li><a href="/Anuncio?buscar=Hyundai" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Hyundai</a></li>
                    <li><a href="/Anuncio?buscar=Kia" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Kia</a></li>
                    <li><a href="/Anuncio?buscar=Mazda" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Mazda</a></li>
                    <li><a href="/Anuncio?buscar=Subaru" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Subaru</a></li>

                </ul>
            </div>
        </li>
        <li class="mb-1">
            <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
                Ano
            </button>
            <div class="collapse"  id="dashboard-collapse">
                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2023</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2022</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2021</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2020</a></li>
                   <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2019</a></li>
                   <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2018</a></li>
                   <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2017</a></li>
                   <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">2016</a></li>
                </ul>
            </div>
        </li>
        <li class="mb-1">
            <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
                Orders
            </button>
            <div class="collapse" id="orders-collapse">
                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">New</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">New</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Processed</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Shipped</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Returned</a></li>
                </ul>
            </div>
        </li>
    </ul>
</div>
<div class="container">

            <div class="conatiner-fluid d-flex flex-wrap ">

                <% if (listaCars != null) { %>
                   <% for (int i = 0; i < listaCars.size(); i++) { %>

                <div class="card" style="width: 18rem;">
                    <img src= "<%=listaCars.get(i).getFotoCarro()%>" class="card-img-top" alt="...">
                    <div class="card-body">

                        <h5 class="card-title">
                            <%=listaCars.get(i).getNomeCarro()%>
                        </h5>

                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">
                            <label><%=listaCars.get(i).getAno()%></label>
                            <label> - </label>
                            <label><%=listaCars.get(i).getKm()%>Km</label>
                            <label> - </label>
                            <label><%=listaCars.get(i).getEstado()%></label>
                        </li>
                    </ul>
                    <div class="card-body">
                        <a href="/descricao-carro?placa=<%=listaCars.get(i).getPlaca()%>" class="card-link">R$ <%=listaCars.get(i).getValor()%></a>

                    </div>
                </div>
                <% } %>
               <% } else { %>
                    <jsp:forward page="/Anuncio" />
               <% } %>

            </div>
        </div>
</div>
</div>


</body>

</html>