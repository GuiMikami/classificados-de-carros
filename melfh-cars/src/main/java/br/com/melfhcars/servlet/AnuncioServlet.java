package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.CarDAO;
import br.com.melfhcars.model.Carro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Anuncio")
public class AnuncioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Carro> cars = new CarDAO().mostrarCarro();

        req.setAttribute("cars",cars);

        req.getRequestDispatcher("Anuncio.jsp").forward(req, resp);


    }


}
