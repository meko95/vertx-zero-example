package cn.vertxup.commander;

import io.vertx.tp.plugin.shell.AbstractCommander;
import io.vertx.tp.plugin.shell.atom.CommandInput;
import io.vertx.tp.plugin.shell.cv.em.TermStatus;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class JsonCommander extends AbstractCommander {

    public TermStatus execute(final CommandInput args) {
        args.get().forEach((field, value) -> {
            System.out.println(field + "=" + value);
        });
        return TermStatus.SUCCESS;
    }
}
