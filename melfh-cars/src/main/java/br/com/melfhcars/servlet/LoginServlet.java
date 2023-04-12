package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.ClienteDAO;
import br.com.melfhcars.dao.LoginDAO;
import br.com.melfhcars.model.Cliente;
import br.com.melfhcars.model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        var senhaCadastro = new Login();
        senhaCadastro.setSenha(senha);
        var emailCadastro = new Login();
        emailCadastro.setEmail(email);

        var LoginDAO = new LoginDAO();
        LoginDAO.validarLogin(senhaCadastro);


        if(senha.equals(senha)){
            System.out.println("Login efetuado com sucesso! ");
        }else {
            System.out.println("Senha inválida! ");
        }
        request.getRequestDispatcher("login.html").forward(request, response);

    }
}