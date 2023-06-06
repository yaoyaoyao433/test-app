package com.meituan.msi.annotations;

import com.meituan.msi.bean.EventType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface MsiApiMethod {
    String[] env() default {};

    EventType eventType() default EventType.COMMON_EVENT;

    boolean isCallback() default false;

    boolean isForeground() default false;

    String name();

    boolean onSerializedThread() default false;

    boolean onUiThread() default false;

    Class<?> request() default Void.class;

    Class<?> response() default Void.class;

    float sampleRate() default 1.0f;

    String scope() default "default";

    String token() default "";
}
