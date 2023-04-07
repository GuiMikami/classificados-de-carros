package br.com.melfhcars.dao;
import br.com.melfhcars.model.Carro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CarDAO {

    public void createCar(Carro carro) {

        String SQL = "INSERT INTO CARRO (NAME) VALUES (?)";

        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, carro.getModelo());
            preparedStatement.execute();
            connection.close();
        }catch (Exception e){
            System.out.println("Fail in connection");
        }
    }
}
