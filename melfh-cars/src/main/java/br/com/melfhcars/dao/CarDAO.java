package br.com.melfhcars.dao;
import br.com.melfhcars.model.Carro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDAO {

    public void createCar(Carro carro) {

        String SQL = "INSERT INTO CARRO (NAME) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, carro.getNomeCarro());
            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println("Fail in connection");
        }
    }

    public  List<Carro> mostarCarro() {

        String SQL = "SELECT NOMECARRO,ANO,QUILOMETRAGEM,ESTADO,VALOR CLIENTES WHERE ";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carro> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carName = resultSet.getString("NOMECARRO");
                String carAno = resultSet.getString("ANO");
                String carKm = resultSet.getString("QUILOMETRAGEM");
                String carEstado = resultSet.getString("ESTADO");
                String carValor = resultSet.getString("VALOR");

                Carro car = new Carro(carName,carAno,carKm,carValor,carEstado);

                cars.add(car);

            }
            System.out.println("success in select * car");

            connection.close();

            return cars;


        }catch (Exception e){
            System.out.println("fail in database connection");

            return Collections.emptyList();
        }
    }
}
