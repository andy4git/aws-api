import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CORSFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
    }
}


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/example")
public class ExampleResource {

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getData() {
        MyPojo data = new MyPojo("Hello", 42);

        ResponseBuilder response = Response.ok(data);
        response.header("Access-Control-Allow-Origin", "*");
        response.header("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        response.header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");

        return response.build();
    }
}
