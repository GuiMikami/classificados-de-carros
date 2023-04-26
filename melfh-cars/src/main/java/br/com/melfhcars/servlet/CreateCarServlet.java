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
        String nomeCarro = request.getParameter("marca" + " " +"modelo");
        String ano = request.getParameter("ano");
        String km = request.getParameter("quilometragem");
        String estado = request.getParameter("estado");
        String valor = request.getParameter("valor");
        String uf = request.getParameter("uf");
        String finalPlaca = request.getParameter("finalPlaca");
        String fotoCarro = request.getParameter("fotoCarro");

        var carro = new Carro();
        carro.setNomeCarro(nomeCarro);
        carro.setFinalPlaca(placa);
        carro.setAno(ano);
        carro.setKm(km);
        carro.setFinalPlaca(finalPlaca);
        carro.setValor(valor);
        carro.setEstado(estado);
        carro.setUf(uf);
        carro.setFotoCarro(fotoCarro);



        var carroDAO = new CarDAO();
        carroDAO.createCar(carro);

        System.out.println(nomeCarro);

        request.getRequestDispatcher("cadastroCarro.html").forward(request, response);


    }
}
