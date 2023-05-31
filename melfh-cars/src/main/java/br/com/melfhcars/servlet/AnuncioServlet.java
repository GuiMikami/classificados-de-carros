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

        String busca = req.getParameter("buscar");
        String ano = req.getParameter("ano");
        String estado = req.getParameter("estado");

        System.out.println(busca);

        if (busca != null && !busca.isEmpty() && ano==null && estado==null) {
            List<Carro> pesquisa = new CarDAO().Anuncios(busca);
            req.setAttribute("cars", pesquisa);

        } else if(ano!=null && !ano.isEmpty()){
            List<Carro> pesquisaAno = new CarDAO().AnunciosAno(ano);
            req.setAttribute("cars",pesquisaAno);

        }else if(estado!=null && !estado.isEmpty()){
            List<Carro> pesquisaEstado = new CarDAO().AnunciosAno(ano);
            req.setAttribute("cars",pesquisaEstado);
        }else {
            List<Carro> listarCarro = new CarDAO().Anuncios("");
            req.setAttribute("cars", listarCarro);
        }

        req.getRequestDispatcher("Anuncio.jsp").forward(req, resp);
    }


}
