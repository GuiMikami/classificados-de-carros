package br.com.melfhcars.dao;

import br.com.melfhcars.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public void validarLogin(Login usuario) {

        String SQL = "SELECT * FROM usuario WHERE email = ? AND senha = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,usuario.getEmail());
            preparedStatement.setString(1,usuario.getSenha());

            ResultSet rs = preparedStatement.executeQuery();


            connection.close();

        }catch (Exception e){
            System.out.println("Fail in connection");
        }
    }
}
