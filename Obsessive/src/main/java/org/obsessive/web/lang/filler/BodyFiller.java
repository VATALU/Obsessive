package org.obsessive.web.lang.filler;

import io.vertx.ext.web.RoutingContext;
import org.obsessive.web.lang.Filler;

public class BodyFiller implements Filler{
    @Override
    public Object apply(String name, Class<?> clazz, RoutingContext routingContext) {
        return null;
    }
}
