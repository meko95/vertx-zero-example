package cn.vertxup.micro.jsr303;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@EndPoint
public class NotNullAgent {
    @POST
    @Path("/hi/jsr303/notnull")
    public String notnull(@NotNull @PathParam("name") final String name) {
        return "Hi, " + name;
    }
}
