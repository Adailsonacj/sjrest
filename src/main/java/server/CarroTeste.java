package server;

import bd.Connect;
import model.Carro;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response.Status;

@Path("/carro")
public class CarroTeste {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCarro(){
        return "Teste Json";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Carro getCarro(@QueryParam("id") int id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Connect connect = new Connect();
        Carro carro = connect.getUser(id);
        connect.closeConnection();
        return carro;
    }

    @PUT
    public Response createCarro(Carro carro) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Connect connect = new Connect();
        connect.insertCarro(carro);
        connect.closeConnection();
        return Response.status(Status.OK).build();
    }

    @DELETE
    public Response deleteCarro(@QueryParam("id") int id) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Connect connect = new Connect();
        connect.deleteUser(id);
        connect.closeConnection();
        return Response.status(Status.OK).build();
    }
}