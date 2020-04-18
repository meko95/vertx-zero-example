package cn.vertxup.micro.params;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.FileUpload;
import io.vertx.tp.ambient.refine.At;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.log.Annal;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.StreamParam;

@EndPoint
public class BodyDataAgent {

    private static final Annal LOGGER = Annal.get(BodyDataAgent.class);

    @POST
    @Path("/hi/param/body-string")
    public JsonObject sayBody(@BodyParam final JsonObject data) {
        return data;
    }

    @POST
    @Path("/hi/param/body-file")
    public JsonObject sayFile(@StreamParam final FileUpload file) {
        LOGGER.info("filename = {0}", file.fileName());
        return At.upload("stream.file", file);
    }
}
