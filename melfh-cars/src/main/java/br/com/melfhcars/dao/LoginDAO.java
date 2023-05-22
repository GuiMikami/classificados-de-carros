package br.com.melfhcars.dao;

import br.com.melfhcars.model.Cliente;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public boolean validarLogin(Cliente cliente) {

        String SQL = "SELECT * FROM CLIENTE WHERE email = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getEmail());

            ResultSet rs = preparedStatement.executeQuery();

            System.out.println("sucess in select email");

            while(rs.next()){
                String password = rs.getString("senha");

                if(password.equals(cliente.getSenha())){
                    return true;
                }
            }
             connection.close();
            return  false;

        }catch (Exception e){
            System.out.println("Fail in connection da valida��o");
            return false;
        }

    }

    public String clinteCpf(Cliente cliente) {
        String cpf = null;

        String SQL = "SELECT CPF FROM CLIENTE WHERE EMAIL = ? AND SENHA = ?";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getEmail());
            preparedStatement.setString(2, cliente.getSenha());

            ResultSet rs = preparedStatement.executeQuery();

            System.out.println("sucess in select email");

                    if (rs.next()) {
                        cpf = rs.getString("CPF");
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cpf;
    }
}
