package com.meituan.android.common.sniffer.annotation.path;

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
public @interface SnifferStart {
    String business() default "default";

    SnifferCondition[] conditions() default {};

    String describe() default "";

    String key();

    String module();

    SnifferScope scope() default SnifferScope.UNSPECIFIED;

    long timeout() default 0;

    String type() default "";
}
