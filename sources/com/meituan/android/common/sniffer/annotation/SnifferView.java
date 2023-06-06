package com.meituan.android.common.sniffer.annotation;

import com.meituan.android.common.sniffer.annotation.type.SnifferBoolean;
import com.meituan.android.common.sniffer.annotation.type.SnifferCondition;
import com.meituan.android.common.sniffer.annotation.type.SnifferScope;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface SnifferView {
    String business() default "default";

    SnifferBoolean clickable() default SnifferBoolean.NULL;

    SnifferCondition[] conditions() default {};

    long delay() default 0;

    String describe() default "";

    SnifferBoolean empty() default SnifferBoolean.NULL;

    SnifferBoolean enabled() default SnifferBoolean.NULL;

    int height() default -1;

    int[] id();

    int interval() default 1000;

    String module();

    SnifferScope scope() default SnifferScope.UNSPECIFIED;

    String type() default "";

    int visibility() default -1;

    int width() default -1;
}
