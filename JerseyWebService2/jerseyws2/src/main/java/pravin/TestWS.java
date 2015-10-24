package pravin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

/**
 * Created by bharati on 10/24/2015.
 */
@Path("/TestWS")
public class TestWS {

    @Path("/")
    @GET
    @Produces("text/plain")
    public String getDate(){
        return ("Date :" + new Date());
    }
}
