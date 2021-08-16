package cn.vertxup;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

@Up
public class ExtensionUp {
    public static void main(final String[] args) {
        VertxApplication.run(ExtensionUp.class);
    }
}
