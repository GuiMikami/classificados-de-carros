package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.LoginDAO;
import br.com.melfhcars.model.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/fazerLogin")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("login.html");
        rd.forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        var usuario = new Login();
        usuario.setEmail(email);
        usuario.setSenha(senha);

        boolean loginSucesso = false;

        if(usuario != null && usuario.getSenha().equals(senha)){
                loginSucesso = true;
        }
        if(loginSucesso){
            RequestDispatcher rd = request.getRequestDispatcher("principal.html");
            rd.forward(request,response);
        }
        else{
            request.setAttribute("erro","emal/senha inválidos!");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.forward(request, response);
        }
    }
}