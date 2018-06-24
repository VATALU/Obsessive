package org.vatalu;


import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import org.obsessive.web.ObsessiveStarter;
import org.vatalu.controller.UserController;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main extends AbstractVerticle{

    public static void main(String[] args) {
//        ObsessiveStarter.run(Main.class);
        Method[] methods = UserController.class.getMethods();
        Method method = methods[0];
        Type[] types =method.getGenericParameterTypes();
//        ParameterizedType parameterizedType = (ParameterizedType) types[0];
//        System.out.println(parameterizedType.getActualTypeArguments()[0].getTypeName());
    }

}


