package cn.vertxup.demo;

import cn.vertxup.demo.domain.tables.daos.XTabularDao;
import cn.vertxup.demo.domain.tables.pojos.XTabular;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.unit.TestContext;
import io.vertx.quiz.JooqBase;
import io.vertx.up.unity.Ux;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class JqTc extends JooqBase {

    @Test
    public void testInsert(final TestContext context) {
        this.async(context, this.insertDemo(), actual -> {
            System.out.println(actual);
            Assert.assertNotNull(actual);
        });
    }

    private Future<XTabular> insertDemo() {
        final XTabular tabular = new XTabular();
        tabular.setKey(UUID.randomUUID().toString());
        tabular.setCode("TEST.CODE");
        tabular.setName("测试代码");
        // 插入数据
        return Ux.Jooq.on(XTabularDao.class).insertAsync(tabular);
    }

    @Test
    public void testGroup(final TestContext context) {
        final ConcurrentMap<String, List<XTabular>> grouped = Ux.Jooq.on(XTabularDao.class).group("type");
        System.out.println(grouped);
        this.async(context, Ux.Jooq.on(XTabularDao.class).countByAsync(new JsonObject(), "type", "code"), actual -> {
            System.out.println(actual);
        });
    }
}
