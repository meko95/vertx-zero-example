package cn.vertxup.demo;

import io.vertx.ext.unit.TestContext;
import io.vertx.quiz.AsyncBase;
import io.vertx.up.util.Ut;
import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class DateTc extends AsyncBase {
    @Test
    public void testDate(final TestContext context) {
        final LocalDateTime dateTime = Ut.toDateTime("1990-10-15 02:21:53");
        final LocalDateTime dateTime1 = Ut.toDateTime("2012-11-04 19:37:11");
        System.out.println(dateTime);
        System.out.println(dateTime1);
    }
}
