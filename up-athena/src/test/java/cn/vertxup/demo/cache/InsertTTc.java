package cn.vertxup.demo.cache;

import cn.vertxup.demo.AbstractJq;
import cn.vertxup.demo.domain.tables.pojos.XTabular;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.unit.TestContext;
import io.vertx.tp.plugin.redis.RedisInfix;
import io.vertx.up.uca.jooq.UxJooq;
import org.junit.Test;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class InsertTTc extends AbstractJq {
    static {
        RedisInfix.init(VERTX);
    }

    public void setUp() {
        final JsonObject json = this.ioJObject("insert-case1-cache.json");
        /*
         * insertJ(T)
         */
        final UxJooq dao = this.dao();
        final XTabular tabular = dao.insert(json);
    }

    @Test
    public void testFetch(final TestContext context) throws Throwable {
        this.async(context, this.dao().fetchByIdAsync("975c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {

        });
        this.async(context, this.dao().fetchOneAsync("code", "RWLETT"), actual -> {

        });
        Thread.sleep(2000);
    }
}
