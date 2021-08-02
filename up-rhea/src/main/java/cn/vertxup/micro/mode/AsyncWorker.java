package cn.vertxup.micro.mode;

import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;

@Queue
public class AsyncWorker {
    @Address("ZERO://ONE-WAY")
    public void reply(final Envelop message) {
        final JsonObject data = Ux.getJson(message);
        // Do somethings
        System.out.println(data.encodePrettily());
    }

    @Address("ZERO://ASYNC")
    public Envelop replyAsync(final Envelop message) {
        final JsonObject data = Ux.getJson(message);
        // Do somethings
        return Envelop.success(data);
    }

    @Address("ZERO://CALLBACK")
    public void replyCallback(final Message<Envelop> message) {
        message.reply(Envelop.success("Callback Success"));
    }
}
