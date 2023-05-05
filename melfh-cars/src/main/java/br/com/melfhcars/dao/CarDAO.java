package br.com.melfhcars.dao;
import br.com.melfhcars.model.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDAO {

    public void createCar(Carro carro) {

        String SQL = "INSERT INTO CARRO (PLACA, NOMECARRO, FINALPLACA, ANO, KM, VALOR, ESTADO, FOTOCARRO, TRANSMISSAO, ACIONAMENTO, DOCUMENTO, CONDICAO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, carro.getPlaca());
            preparedStatement.setString(2, carro.getNomeCarro());
            preparedStatement.setString(3, carro.getFinalPlaca());
            preparedStatement.setString(4, carro.getAno());
            preparedStatement.setString(5, carro.getKm());
            preparedStatement.setString(6, carro.getValor());
            preparedStatement.setString(7, carro.getEstado());
            preparedStatement.setString(8, carro.getFotoCarro());
            preparedStatement.setString(9, carro.getTransmissao());
            preparedStatement.setString(10, carro.getAcionamento());
            preparedStatement.setString(11, carro.getDocumento());
            preparedStatement.setString(12, carro.getCondicoes());


            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println(e + "Fail in connection carro");
        }
    }

    public List<Carro> mostarCarro() {

        String SQL = "SELECT TOP 4 NOMECARRO, ANO, KM, VALOR, ESTADO,FOTOCARRO FROM CARRO ORDER BY PLACA DESC";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carro> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carName = resultSet.getString("NOMECARRO");
                String carAno = resultSet.getString("ANO");
                String carKm = resultSet.getString("KM");
                String carEstado = resultSet.getString("ESTADO");
                String carValor = resultSet.getString("VALOR");
                String carFoto = resultSet.getString("FOTOCARRO");


                Carro car = new Carro(carName, carAno, carKm, carValor, carEstado, carFoto);

                cars.add(car);

            }
            System.out.println("success in select * car");

            connection.close();

            return cars;


        } catch (Exception e) {
            System.out.println("fail in database connection");

            return Collections.emptyList();
        }
    }

    public List<Carro> deletarCarro(String placa) {

        String SQL = "";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carro> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carName = resultSet.getString("NOMECARRO");
                String carAno = resultSet.getString("ANO");
                String carKm = resultSet.getString("KM");
                String carEstado = resultSet.getString("ESTADO");
                String carValor = resultSet.getString("VALOR");


                Carro car = new Carro(carName, carAno, carKm, carValor, carEstado,"");

                cars.add(car);

            }
            System.out.println("success in select * car");

            connection.close();

            return cars;
        }catch (Exception e) {
            System.out.println("fail in database connection");

            return Collections.emptyList();
        }
    }
}
