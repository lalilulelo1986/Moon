package kz.lalafa;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class RestTest {

    @Context
    private UriInfo context;

    /** Creates a new instance of HelloWorld */
    public RestTest() {
    }

    /**
     * Retrieves representation of an instance of helloWorld.HelloWorld
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
        return "<html lang=\"en\"><body><h1>Hello, World!!</h1></body></html>";
    }


    @GET
    @Path("/{param}")
    @Produces("application/json")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "{\n" +
                "\t\"singer\":\"Metallica\",\n" +
                "\t\"title\":\"Enter Sandman\"\n" +
                "}";
        return Response.status(200).entity(output).build();
    }


}
