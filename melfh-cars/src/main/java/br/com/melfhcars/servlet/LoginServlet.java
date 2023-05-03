package br.com.melfhcars.servlet;

import br.com.melfhcars.dao.LoginDAO;
import br.com.melfhcars.model.Cliente;
import br.com.melfhcars.model.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/fazerLogin")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("login.html");
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
                RequestDispatcher rd = request.getRequestDispatcher("Perfil.html");
                rd.forward(request,response);
            }else{
                System.out.println("Usuario e senha ta incorreto");
            }
        } catch (Exception e) {
            System.out.println(e + "erro");
        }

//        boolean loginSucesso = false;
//        if(usuario != null && usuario.getSenha().equals(senha)){
//                loginSucesso = true;
//        }
//        if(loginSucesso){
//            RequestDispatcher rd = request.getRequestDispatcher("principal.html");
//            rd.forward(request,response);
//            
//        }
//        else{
//            request.setAttribute("erro","emal/senha inválidos!");
//            RequestDispatcher rd = request.getRequestDispatcher("login.html");
//            rd.forward(request, response);
//        }
//    }
    }
}
