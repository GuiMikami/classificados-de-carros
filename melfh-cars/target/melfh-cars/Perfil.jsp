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
              <a href="cadastroCarro.html" class="nav-link text-white">
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
                <th scope="col">Ano</th>
                <th scope="col">Km</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
              </tr>
              <tr>
                <th scope="row">2</th>
              </tr>
              <tr>
                <th scope="row">3</th>
              </tr>
            </tbody>
          </table>
            <div class="container">
                <button type="button" class="btn btn-warning">Primary</button>
                <button type="button" class="btn btn-danger">Secondary</button>
            </div>
        </div>
</body>
</html>
