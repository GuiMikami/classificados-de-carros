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

    public List<Carro> mostrarCarro() {

        String SQL = "SELECT TOP 4 NOMECARRO, ANO, KM, VALOR, ESTADO,FOTOCARRO,PLACA FROM CARRO ORDER BY PLACA DESC";

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
                String carPlaca = resultSet.getString("PLACA");


                Carro car = new Carro(carName, carAno, carKm, carValor, carEstado, carFoto, carPlaca);

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

    public void deletarCarro(String placa) {

        String SQL = "DELETE CARRO WHERE PLACA = ? ";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, placa);
            preparedStatement.execute();

            System.out.println("success on delete car with placa: " + placa);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public Carro descricao(String placa){

        String SQL = "SELECT NOMECARRO, ANO, KM, VALOR, ESTADO,FOTOCARRO,TRANSMISSAO,ACIONAMENTO,DOCUMENTO,CONDICAO,FINALPLACA FROM CARRO WHERE PLACA = ? ";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, placa);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Carro> descricao = new ArrayList<>();

            while (resultSet.next()) {

                String carName = resultSet.getString("NOMECARRO");
                String carAno = resultSet.getString("ANO");
                String carKm = resultSet.getString("KM");
                String carEstado = resultSet.getString("ESTADO");
                String carValor = resultSet.getString("VALOR");
                String carFoto = resultSet.getString("FOTOCARRO");
                String carTransmissao = resultSet.getString("TRANSMISSAO");
                String carFinalPlaca = resultSet.getString("FINALPLACA");
                String carAcionamento = resultSet.getString("ACIONAMENTO");
                String carDocumento = resultSet.getString("DOCUMENTO");
                String carCondicao = resultSet.getString("CONDICAO");


                Carro car = new Carro(carName, carAno, carKm, carFinalPlaca, carValor, carEstado, carTransmissao, carAcionamento, carDocumento, carCondicao, carFoto);

                System.out.println("success in select * car");

                connection.close();


                return car;

            }



        } catch (Exception e) {

            System.out.println("fail in database connection");

        }

        return null;

    }


    public void atualizarCarro(Carro carro) {

        String SQL = "UPDATE CARRO SET NOMECARRO, ANO, KM, ESTADO, VALOR, FINALPLACA, = ? WHERE PLACA = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("sucess in database connection");

            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, carro.getNomeCarro());
            ps.setString(2, carro.getAno());
            ps.setString(3, carro.getKm());
            ps.setString(4, carro.getEstado());
            ps.setString(5, carro.getValor());
            ps.setString(6, carro.getFinalPlaca());

            System.out.println("sucess in update car");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");

        }


    }


}
