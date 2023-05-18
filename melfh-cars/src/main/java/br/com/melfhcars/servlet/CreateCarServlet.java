package br.com.melfhcars.servlet;
import br.com.melfhcars.dao.CarDAO;
import br.com.melfhcars.dao.ClienteDAO;
import br.com.melfhcars.model.Carro;
import br.com.melfhcars.model.Cliente;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;
@WebServlet("/cadastro-carro")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        Map<String, String> parameters = uploadImage(request);
        String placa = parameters.get("placa");
        String nomeCarro = parameters.get("marca");
        String ano = parameters.get("ano");
        String km = parameters.get("km");
        String estado = parameters.get("estado");
        String valor = parameters.get("valor");
        String finalPlaca = parameters.get("finalplaca");
        String transmissao = parameters.get("transmissao");
        String acionamento = parameters.get("acionamento");
        String documento = parameters.get("documento");
        String condicao = parameters.get("condicao");
        String fotoCarro = parameters.get("image");


        var carro = new Carro();
        carro.setPlaca(placa.toUpperCase().trim());
        carro.setNomeCarro(nomeCarro);
        carro.setAno(ano);
        carro.setKm(km);
        carro.setFinalPlaca(finalPlaca);
        carro.setValor(valor);
        carro.setEstado(estado);
        carro.setFotoCarro(fotoCarro);
        carro.setAcionamento(acionamento);
        carro.setCondicoes(condicao);
        carro.setDocumento(documento);
        carro.setTransmissao(transmissao);


        var carroDAO = new CarDAO();
        carroDAO.createCar(carro);


        if (placa.isBlank()) {
            carroDAO.createCar(carro);
        }else {
            carroDAO.atualizarCarro(carro);
        }

        request.getRequestDispatcher("cadastroCarro.jsp").forward(request, response);

    }

    private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {
        Map<String, String> requestParameters = new HashMap<>();

        if (isMultipartContent(httpServletRequest)) {
            try {
                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                for (FileItem fileItem : fileItems) {
                    checkFieldType(fileItem, requestParameters);
                }
            } catch (Exception ex) {
                requestParameters.put("image", "IMG/default-car.jpg");
            }
        }
        return requestParameters;
    }

    private void checkFieldType(FileItem item, Map requestParameters)throws Exception {
        if (item.isFormField()) {
            requestParameters.put(item.getFieldName(), item.getString());

        } else {
            String fileName = processUploadedFile(item);
            requestParameters.put("image","img/".concat(fileName));
        }
    }

    private String processUploadedFile(FileItem fileItem) throws Exception {
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", " "));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        return fileName;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/cadastroCarro.jsp");
        dispatcher.forward(req,resp);
    }
}
