package com.facebook.react.bridge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface ReactMethod {
    boolean isBlockingSynchronousMethod() default false;
}
