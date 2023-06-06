package org.mp4parser.aspectj.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface DeclareMixin {
    Class[] interfaces() default {Object.class};

    String value();
}
