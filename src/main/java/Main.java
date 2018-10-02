import bd.Connect;
import model.Carro;

import java.sql.SQLException;

public class Main {

    public static void main (String...aacj) {
        Connect connect = null;
        try {
            Carro carro = new Carro(2, "chevete", 5);
            connect = new Connect();
            connect.insertCarro(carro);
            connect.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
