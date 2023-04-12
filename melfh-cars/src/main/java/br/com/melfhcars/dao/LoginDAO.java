package br.com.melfhcars.dao;

import br.com.melfhcars.model.Carro;
import br.com.melfhcars.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoginDAO {
    public void validarLogin(Login login) {

        String SQL = "INSERT INTO LOGIN (EMAIL, SENHA) VALUES (?,?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,login.getEmail());
            preparedStatement.setString(1,login.getSenha());
            preparedStatement.execute();
            connection.close();
        }catch (Exception e){
            System.out.println("Fail in connection");
        }
    }
}
