package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.CarDAO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-car")
public class DeleteCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String placa = req.getParameter("placa");

        new CarDAO().deletarCarro(placa);

        resp.sendRedirect("/tela-perfil"); // precisa alterar redirecionamento

    }
}
