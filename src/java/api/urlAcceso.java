package api;

import bean.product;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dao.productDAO;

import javax.ws.rs.POST;

@Path("/")
public class urlAcceso {

    Gson g = new Gson();

    @Path("/product/lista")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @GET
    public Response listaProductos() {
        productDAO dao = new productDAO();
        JsonObject jobject = dao.productos();
        return Response.ok(g.toJson(jobject), MediaType.APPLICATION_JSON).build();
    }

    @Path("/product/save")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response guardar(product p) {
        product bean = p;
        productDAO dao = new productDAO(bean);
        boolean valida = dao.save();
        return Response.ok(valida).build();
    }

}
