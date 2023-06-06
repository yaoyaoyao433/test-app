package com.meituan.msc.common.annotation;

import android.support.annotation.Keep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Keep
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface NeedDependency {
    Class<?>[] value();
}
