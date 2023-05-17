package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.CarDAO;
import br.com.melfhcars.model.Carro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;

@WebServlet("/tela-perfil")
public class ListCarPerfil extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Carro> listCar = new CarDAO().tebelaCarroPerfil();

        req.setAttribute("listCar",listCar);

        req.getRequestDispatcher("Perfil.jsp").forward(req,resp);
    }
}
