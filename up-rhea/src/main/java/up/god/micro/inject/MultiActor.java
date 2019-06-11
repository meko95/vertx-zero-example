package up.god.micro.inject;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@EndPoint
@Path("/api")
public class MultiActor {

    @Path("inject/multi")
    @PUT
    @Address("ZERO://INJECT/MULTI")
    public JsonObject sayInject(final JsonObject data
    ) {
        return new JsonObject()
                .put("age", 33)
                .mergeIn(data);
    }
}
