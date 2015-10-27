package pkg1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by bharati on 27/10/2015.
 */


@Path("orders")
public class Orders {

    @GET
    @Path("/")
    @Produces("text/plain")
    public String showMenu(){
        return "This is Hotel Menu : Chicken Curry, Veg Curry";
    }
    
}
