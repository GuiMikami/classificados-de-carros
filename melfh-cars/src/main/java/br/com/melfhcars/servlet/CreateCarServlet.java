package br.com.melfhcars.servlet;
import br.com.melfhcars.dao.CarDAO;
import br.com.melfhcars.dao.ClienteDAO;
import br.com.melfhcars.model.Carro;
import br.com.melfhcars.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cadastro-carro")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String placa = request.getParameter("placa");
        String nomeCarro = request.getParameter("marca");
        String ano = request.getParameter("ano");
        String km = request.getParameter("km");
        String estado = request.getParameter("estado");
        String valor = request.getParameter("valor");
        String finalPlaca = request.getParameter("finalplaca");
        String transmissao = request.getParameter("transmissao");
        String acionamento = request.getParameter("acionamento");
        String documento = request.getParameter("documento");
        String condicao = request.getParameter("condicao");
        String fotoCarro = request.getParameter("fotoCarro");


        var carro = new Carro();
        carro.setPlaca(placa);
        carro.setNomeCarro(nomeCarro);
        carro.setAno(ano);
        carro.setKm(km);
        carro.setFinalPlaca(finalPlaca);
        carro.setValor(valor);
        carro.setEstado(estado);
        carro.setFotoCarro(fotoCarro);
        carro.setAcionamento(acionamento);
        carro.setCondicoes(condicao);
        carro.setDocumento(documento);
        carro.setTransmissao(transmissao);



        var carroDAO = new CarDAO();
        carroDAO.createCar(carro);

        System.out.println(nomeCarro);

        request.getRequestDispatcher("cadastroCarro.html").forward(request, response);


    }
}
