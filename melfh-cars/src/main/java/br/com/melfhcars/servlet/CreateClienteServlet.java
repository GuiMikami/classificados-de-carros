package br.com.melfhcars.servlet;
import br.com.melfhcars.dao.ClienteDAO;
import br.com.melfhcars.model.Cliente;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-cliente")
public class CreateClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String emailExiste = request.getParameter("email");
        String cpfExistente = request.getParameter("cpf");
        var clienteVerfifica = new ClienteDAO();

        if (clienteVerfifica.verificarCPFExistente(cpfExistente)) {
            request.setAttribute("erroCPF", "O CPF já está em uso");
            RequestDispatcher dispatcher = request.getRequestDispatcher("cadastroCliente.jsp");
            dispatcher.forward(request, response);

        } else if (clienteVerfifica.verificarEmailExistente(emailExiste)) {
            request.setAttribute("erro", "O e-mail já está em uso");
            RequestDispatcher dispatcher = request.getRequestDispatcher("cadastroCliente.jsp");
            dispatcher.forward(request, response);

        } else {
            String clienteName = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String celular = request.getParameter("celular");
            String estado = request.getParameter("estado");
            String genero = request.getParameter("genero");
            String datanascimento = request.getParameter("dataNasc");

            var cliente = new Cliente();
            cliente.setNome(clienteName);
            cliente.setCpf(cpf);
            cliente.setEmail(email);
            cliente.setSenha(senha);
            cliente.setContato(celular);
            cliente.setEstado(estado);
            cliente.setGenero(genero);
            cliente.setDataNascimento(datanascimento);

            var clienteDAO = new ClienteDAO();
            clienteDAO.createCliente(cliente);

            response.sendRedirect("login");

        }
    }

}
