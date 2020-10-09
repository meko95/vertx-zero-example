package cn.vertxup.demo;

import cn.vertxup.demo.domain.tables.daos.XTabularDao;
import cn.vertxup.demo.domain.tables.pojos.XTabular;
import io.vertx.core.json.JsonObject;
import io.vertx.quiz.JooqBase;
import io.vertx.tp.plugin.jooq.JooqInfix;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class AbstractJq extends JooqBase {
    static {
        JooqInfix.init(VERTX);
    }

    protected XTabular data(final String file) {
        final JsonObject dataJson = this.ioJObject(file);
        return Ut.deserialize(dataJson, XTabular.class);
    }

    protected UxJooq dao() {
        return Ux.Jooq.on(XTabularDao.class);
    }
}
