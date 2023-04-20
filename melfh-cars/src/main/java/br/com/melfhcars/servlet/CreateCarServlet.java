package br.com.melfhcars.servlet;
import br.com.melfhcars.dao.CarDAO;
import br.com.melfhcars.model.Carro;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");
        var car = new Carro();
        car.setNomeCarro(carName);

        var carDAO = new Carro();
        //carDAO.createCar(Carro);

        System.out.println(carName);

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
