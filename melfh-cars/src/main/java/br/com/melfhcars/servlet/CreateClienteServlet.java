package br.com.melfhcars.servlet;
import br.com.melfhcars.dao.ClienteDAO;
import br.com.melfhcars.model.Cliente;
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

        String clienteName = request.getParameter("cliente-name");
        var cliente = new Cliente();
        cliente.setNome(clienteName);

        var clienteDAO = new ClienteDAO();
        clienteDAO.createCliente(cliente);

        System.out.println(clienteName);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

}
