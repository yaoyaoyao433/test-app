package com.meituan.android.neohybrid.util.bean;

import android.support.annotation.IntRange;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface Bean {
    @IntRange(from = 0, to = 1)
    int defNumBool() default -1;

    boolean isSave() default true;

    String value();
}
