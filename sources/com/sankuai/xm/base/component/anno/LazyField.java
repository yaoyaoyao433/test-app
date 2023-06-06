package com.sankuai.xm.base.component.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface LazyField {
    public static final int TYPE_AUTO = 0;

    boolean injectable() default true;

    String name() default "";

    boolean required() default false;

    int type() default 0;
}
