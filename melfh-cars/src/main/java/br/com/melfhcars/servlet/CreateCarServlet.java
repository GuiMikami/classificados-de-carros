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

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeCarro = request.getParameter("nomeCarro");
        String ano = request.getParameter("ano");
        String km = request.getParameter("quilometragem");
        String finalPlaca = request.getParameter("finalPlaca");
        String valor = request.getParameter("valor");
        String estado = request.getParameter("estado");
        String uf = request.getParameter("uf");
        String fotoCarro = request.getParameter("fotoCarro");

        var carro = new Carro();
        carro.setNomeCarro(nomeCarro);
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
