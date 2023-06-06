package com.sankuai.xm.base.trace.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface StatusInfo {
    int code() default 0;

    String val() default "";
}
