@Path("/api")
public class MyResource {

    @GET
    @Path("/data")
    public Response getData() {
        return Response.ok("Data retrieved successfully").build();
    }

    @OPTIONS
    @Path("{path: .*}")  // Matches all paths
    public Response handlePreflight() {
        ResponseBuilder response = Response.ok();
        response.header("Access-Control-Allow-Origin", "*");
        response.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
        return response.build();
    }


    @GET
    @Path("/data")
    public Response getData() {
        ResponseBuilder response = Response.ok("Data retrieved successfully");
        response.header("Access-Control-Allow-Origin", "*");
        response.header("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        response.header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
        return response.build();
    }

    @POST
    @Path("/submit")
    public Response postData(String data) {
        ResponseBuilder response = Response.ok("Data submitted successfully");
        response.header("Access-Control-Allow-Origin", "*");
        response.header("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        response.header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization");
        return response.build();
    }    
}
