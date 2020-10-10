package cn.vertxup.demo.cache;

import cn.vertxup.demo.AbstractJq;
import io.vertx.ext.unit.TestContext;
import io.vertx.tp.plugin.redis.RedisInfix;
import org.junit.Test;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class DeleteAsyncTc extends AbstractJq {
    static {
        RedisInfix.init(VERTX);
    }

    /*
     * 场景1：按主键删除
     */
    @Test
    public void testDelete1(final TestContext context) throws Throwable {
        this.async(context, this.dao().deleteByIdAsync("975c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }
}
