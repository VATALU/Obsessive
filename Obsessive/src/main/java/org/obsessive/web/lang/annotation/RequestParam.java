package org.obsessive.web.lang.annotation;

import org.obsessive.web.entity.ValueConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestParam {
    String value() default "";

    boolean required() default true;

    String defaultValue() default ValueConstant.DEFAULT_NONE;
}