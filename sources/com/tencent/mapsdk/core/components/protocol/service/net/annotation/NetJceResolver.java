package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

import android.support.annotation.Keep;
import com.qq.taf.jce.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Keep
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface NetJceResolver {
    Class<? extends a> inJce();

    Class<? extends a> outJce();

    int[] queryRange();
}
