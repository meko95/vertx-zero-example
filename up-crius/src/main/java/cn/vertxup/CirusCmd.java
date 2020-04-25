package cn.vertxup;

import io.vertx.tp.plugin.shell.ConsoleFramework;
import io.vertx.up.unity.Ux;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class CirusCmd {

    public static void main(final String[] args) {
        /*
         * 启动程序
         */
        ConsoleFramework.start(Ux.nativeVertx())
                .bind(command -> {
                    System.out.println("Hello");
                })
                .run(args);
    }
}
