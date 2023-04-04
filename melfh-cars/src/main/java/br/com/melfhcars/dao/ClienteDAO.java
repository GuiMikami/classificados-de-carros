package br.com.melfhcars.dao;

import br.com.melfhcars.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDAO {
    public void createCliente(Cliente cliente) {

        String SQL = "INSERT INTO CLIENTE (NAME) VALUES (?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.execute();
            connection.close();
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Fail in connection");
        }
    }

}
