package br.com.melfhcars.dao;

import br.com.melfhcars.model.Cliente;
import br.com.melfhcars.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public ResultSet validarLogin(Cliente cliente) {

        String SQL = "SELECT * FROM CLIENTE WHERE email = ? ";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getEmail());

            ResultSet rs = preparedStatement.executeQuery();

            return rs;

        }catch (Exception e){
            System.out.println("Fail in connection da valida��o");
            return null;
        }

    }
}
