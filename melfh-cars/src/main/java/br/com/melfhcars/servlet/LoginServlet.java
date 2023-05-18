package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.LoginDAO;
import br.com.melfhcars.model.Cliente;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            String email = request.getParameter("email");
            String senha = request.getParameter("password");

            var cliente = new Cliente();
            cliente.setEmail(email);
            cliente.setSenha(senha);
            
            LoginDAO usuarioDao = new LoginDAO();
            ResultSet rsUsuarioDao = usuarioDao.validarLogin(cliente);
            
            if (rsUsuarioDao.next()) {

                HttpSession session = request.getSession();
                session.setAttribute("UsuárioLogado", usuarioDao);
                response.sendRedirect("/tela-perfil"); // foi aqui a alteração
            }else{


                String invalidPasswordMessage = "Email/Senha inválidos!";
                String invalidPasswordColor = "red";
                request.setAttribute("invalidPasswordMessage", invalidPasswordMessage);
                request.setAttribute("invalidPasswordColor",invalidPasswordColor);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request,response);
            }
        } catch (Exception e) {
            System.out.println(e + "erro");
        }
    }
}
