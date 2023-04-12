package br.com.melfhcars.dao;
import br.com.melfhcars.model.Cliente;
import org.apache.taglibs.standard.lang.jstl.Evaluator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDAO {
    public void createCliente(Cliente cliente) {

        String SQL = "INSERT INTO CLIENTE (NOME,CPF,CONTATO,EMAIL,SENHA,GENERO,ESTADO,DATANASCIMENTO) VALUES (?,?,?,?,?,?,?,?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2,cliente.getCpf());
            preparedStatement.setString(3,cliente.getContato());
            preparedStatement.setString(4,cliente.getEmail());
            preparedStatement.setString(5, cliente.getSenha());
            preparedStatement.setString(6,cliente.getGenero());
            preparedStatement.setString(7,cliente.getEstado());
            preparedStatement.setString(8,cliente.getDataNascimento());

            preparedStatement.execute();
            connection.close();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Fail in connection");
        }
    }


}
