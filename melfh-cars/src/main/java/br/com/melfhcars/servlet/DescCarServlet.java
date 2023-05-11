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


@WebServlet("/descricao-carro")
public class DescCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String placa = req.getParameter("placa");

        Carro descricao = new CarDAO().descricao(placa);

        req.setAttribute("descricao", descricao);

        req.getRequestDispatcher("descricaoCarro.jsp").forward(req,resp);
    }
}
