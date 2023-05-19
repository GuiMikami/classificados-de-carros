<%@page import="java.util.List"%>
<%@page import="br.com.melfhcars.model.Carro"%>
<% List<Carro> listaCars = (List<Carro>) request.getAttribute("cars");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
    <title>Comprar Carros</title>
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
                    <li><a href="Anuncio.html" class="nav-link px-2 link-dark1">Comprar carro </a></li>
                    <li><a href="sobre.html" class="nav-link px-2 link-dark1">Um pouco sobre nós</a></li>
                </ul>

                <div class="col-md-3 text-end">

                    <a href="login.jsp"> <button type="button" class="btn btn-outline-primary me-2">Entrar</button></a>
                    <a href="cadastroCliente.html"><button type="button" class="btn btn-primary">Cadastrar-se</button></a>

                </div>
            </header>
        </div>
    </div>
</div>

<div class="container">
    <div class="container1">
<div class="sidebar">
    <div class="flex-shrink-0 p-3" style="width: 280px;">
        <svg class="bi pe-none me-2" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
        <div class="input-group">
            <input type="text" id="pesquisa" class="form-control">
            <button class="btn btn-primary">Pesquisar</button>
        </div>
    </div>
    <ul class="list-unstyled ps-0 bg-dark">
        <li class="mb-1">
            <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
                Marca
            </button>
            <div class="collapse show" id="home-collapse">
                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Toyota</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Honda</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Civic</a></li>
                </ul>
            </div>
        </li>
        <li class="mb-1">
            <button class="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
                Dashboard
            </button>
            <div class="collapse" id="dashboard-collapse">
                <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Overview</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Weekly</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Monthly</a></li>
                    <li><a href="#" class="link-body-emphasis d-inline-flex text-decoration-none rounded">Annually</a></li>
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