<!DOCTYPE html>
<html lang="pt-br">
<%@ page contentType="text/html; charset=UTF-8" %>

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="cadastroCarro.css" rel="stylesheet">
    <link href="header.css" rel="stylesheet">
    <title>Cadastrar Carro</title>


  </head>

  <body>
  <%
      if (session.getAttribute("cpfLogado") != null) {
      %>

    <header>
      <div class="logo">
        <a href="home.jsp"></a>
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

      <h1>Cadastre seu carro e encontre compradores interessados!</h1>



      <form action="/cadastro-carro" method="post" enctype="multipart/form-data">

            <div class="cpf-logado">
            <label for="cpf">CPF dono do Carro: </label>
              <input type="text" name="cpf" value="${sessionScope.cpfLogado}" readonly></input>
            </div>


        <div class="form-row">
          <div class="form-column">
            <label for="placa">Placa:</label>
            <input type="text" id="placa" name="placa" minlength="7" maxlength="7" value="${param.placa}" required>
          </div>
          <div class="form-column">
            <label for="marca">Marca/Modelo:</label>
            <input type="text" id="marca" name="marca" value="${param.nomeCarro}"
              placeholder="Modelo e Marca do seu carro" required>
          </div>
        </div>
        <div class="form-row">
          <div class="form-column">
            <label for="finalplaca">Final da Placa:</label>
            <input type="text" id="finalplaca" name="finalplaca" maxlength="1" value="${param.finalPlaca}" required>
          </div>
          <div class="form-column">
            <label for="ano">Ano:</label>
            <input type="text" id="ano" name="ano" value="${param.ano}" required>
          </div>
        </div>
        <div class="form-row">
          <div class="form-column">
            <label for="Km">Quilometragem:</label>
            <input type="number" id="km" name="km" maxlength="13" value="${param.km}" required>

          </div>
          <div class="form-column">
            <label for="valor">Preço:</label>
            <input type="number" id="valor" step="0.01" name="valor" value="${param.valor}" required>
          </div>
        </div>
        <div class="form-row">
          <div class="form-column">
            <label for="transmissao">Transmissão</label>
            <select id="transmissao" name="transmissao" required>
              <option value="">${param.transmissao}</option>
              <option value="automatico">Automatico</option>
              <option value="manual">Manual</option>
            </select>
          </div>
          <div class="form-column">
            <label for="acionamento">Acionamento de rodas:</label>
            <select id="acionamento" name="acionamento" required>
              <option value="">${param.acionamento}</option>
              <option value="2X4">2X4</option>
              <option value="4x4">4X4</option>
            </select>
          </div>
        </div>
        <div class="form-row">
          <div class="form-column">
            <label for="documento">Os documentos do seu carro estão:</label>
            <select id="documento" name="documento" required>
              <option value="">${param.documento}</option>
              <option value="emdia">Em Dia</option>
              <option value="Atrasado">Atrasado</option>
            </select>
          </div>
          <div class="form-column">
            <label for="condicao">Condição que seu carro se encontra?</label>
            <select id="condicao" name="condicao" required>
              <option value="">${param.condicoes}</option>
              <option value="novo">Novo</option>
              <option value="usado">Usado</option>
              <option value="regular">Regular</option>
              <option value="danificado">Danificado</option>
            </select>
          </div>
        </div>
        <div class="form-row">
          <div class="form-column">
            <label for="file">Choose file</label>
            <input type="file" name="file" id="file" accept="image/jpeg" ${param.imagem}>
          </div>
          <div class="form-column">
            <label for="estado">Estado:</label>
            <input type="text" id="estado" name="estado" maxlength="40" value="${param.estado}" required>
          </div>
        </div>
        <div class="cadastrar">
          <input type="submit" value="Cadastrar">
        </div>

    </div>
    </form>
    </div>
    <%
        } else {

            response.sendRedirect("login.jsp");
        }
        %>
  </body>

</html>