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
 * 全异步查询
 */
public class ReadAsyncTc extends AbstractJq {
    static {
        RedisInfix.init(VERTX);
    }

    public void setUp() {
        final JsonObject json = this.ioJObject("insert-Fetch1-cache.json");
        /*
         * insertJ(T)
         */
        final UxJooq dao = this.dao();
        final XTabular tabular = dao.insert(json);
    }

    /*
     * 场景1：按主键查询
     */
    @Test
    public void testFetch1(final TestContext context) throws Throwable {
        this.async(context, this.dao().fetchByIdAsync("975c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景2：非主键查询生成缓存
     */
    @Test
    public void testFetch2(final TestContext context) throws Throwable {
        this.async(context, this.dao().fetchOneAsync(new JsonObject().put("name", "汤娜1")), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        this.async(context, this.dao().fetchOneAsync(new JsonObject().put("code", "CCRT")), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景3：同一数据多条件
     */
    @Test
    public void testFetch3(final TestContext context) throws Throwable {
        this.async(context, this.dao().fetchOneAsync("code", "RWLETT"), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        this.async(context, this.dao().fetchOneAsync("name", "汤娜"), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景4：复杂条件
     */
    @Test
    public void testFetch4(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("code", "RWLETT");
        condition.put("name", "汤娜");
        this.async(context, this.dao().fetchOneAsync(condition), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景5：「集合」复杂条件
     */
    @Test
    public void testFetch5(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("code", "RWLETT");
        this.async(context, this.dao().fetchAsync(condition), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景6：「集合」复杂条件
     */
    @Test
    public void testFetch6(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("type", "test.type1");
        this.async(context, this.dao().fetchAsync(condition), actual -> {
            System.out.println(actual);
            context.assertNotNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景7：无法查询数据
     */
    @Test
    public void testFetch7(final TestContext context) throws Throwable {
        this.async(context, this.dao().fetchByIdAsync("X75c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {
            System.out.println(actual);
            context.assertNull(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景8：按主键检查数据
     */
    @Test
    public void testExist1(final TestContext context) throws Throwable {
        this.async(context, this.dao().existByIdAsync("975c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {
            System.out.println(actual);
            context.assertTrue(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景9：按主键查询不存在
     */
    @Test
    public void testExist2(final TestContext context) throws Throwable {
        this.async(context, this.dao().existByIdAsync("X75c9cf9-4505-4856-a1d3-31f5ce83e860"), actual -> {
            System.out.println(actual);
            context.assertFalse(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景10：按条件查询是否存在
     */
    @Test
    public void testExist3(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("type", "test.type1");
        this.async(context, this.dao().existAsync(condition), actual -> {
            System.out.println(actual);
            context.assertTrue(actual);
        });
        Thread.sleep(2000);
    }


    /*
     * 场景10：按条件查询不存在
     */
    @Test
    public void testExist4(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("type", "test.type2");
        this.async(context, this.dao().existAsync(condition), actual -> {
            System.out.println(actual);
            context.assertFalse(actual);
        });
        Thread.sleep(2000);
    }
}
