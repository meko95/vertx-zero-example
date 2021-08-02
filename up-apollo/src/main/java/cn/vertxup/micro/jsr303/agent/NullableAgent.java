package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.Null;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@EndPoint
@Path("/hi/jsr303")
public class NullableAgent {
    @POST
    @Path("/null")
    public String notnull(@Null @PathParam("name") final String name) {
        return "Hi, " + name;
    }
}
