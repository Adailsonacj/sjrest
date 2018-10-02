package bd;

import model.Carro;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    Connection con = null;

    public Connect() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/db_lojacarros";
        String user = "postgres";
        String password = "postgres";

        Class.forName("org.postgresql.Driver").newInstance();
        con = DriverManager.getConnection(url, user, password);
    }

    public void closeConnection() throws SQLException {
        con.close();
    }

    public void insertCarro(Carro carro) {

        try {
            PreparedStatement preparedStatement = con
                    .prepareStatement("INSERT INTO public.tbl_carro(id, modelo, valor) VALUES (?,?,?)");
            preparedStatement.setInt(1, carro.getId());
            preparedStatement.setString(2, carro.getModelo());
            preparedStatement.setFloat(3, carro.getValor());
            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Connect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }

    public Carro getUser(int id) {

        Carro carro = null;
        try {

            PreparedStatement preparedStatement = con
                    .prepareStatement("select * from user where id = ?");
            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {

                carro = new Carro(rs.getInt(1), rs.getString(2), rs.getShort(3));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Connect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
        return carro;
    }

    public void deleteUser(int id) {

        try {
            PreparedStatement preparedStatement = con
                    .prepareStatement("delete from user where id = ?");
            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(Connect.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        }
    }
}