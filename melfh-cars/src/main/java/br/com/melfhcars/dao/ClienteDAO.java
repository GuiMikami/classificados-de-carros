package br.com.melfhcars.dao;
import br.com.melfhcars.model.Cliente;


import java.sql.*;

public class ClienteDAO {
    public void createCliente(Cliente cliente) {

        String SQL = "INSERT INTO CLIENTE (NOME,CPF,CONTATO,EMAIL,SENHA,GENERO,ESTADO,DATANASCIMENTO) VALUES (?,?,?,?,?,?,?,?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1,cliente.getNome());
            preparedStatement.setString(2,cliente.getCpf());
            preparedStatement.setString(3,cliente.getContato());
            preparedStatement.setString(4,cliente.getEmail());
            preparedStatement.setString(5,cliente.getSenha());
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
    public boolean verificarEmailExistente(String email) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");


            String sql = "SELECT COUNT(*) FROM CLIENTE WHERE EMAIL = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);


            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean verificarCPFExistente(String cpf) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");


            String sql = "SELECT COUNT(*) FROM CLIENTE WHERE CPF = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, cpf);

            ResultSet resultSet = statement.executeQuery();


            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }


}
