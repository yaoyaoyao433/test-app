package com.meituan.mmp.main.annotation;

import android.support.annotation.Keep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.TYPE})
@Keep
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface Api {
    String[] value();
}
