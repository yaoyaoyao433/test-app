package com.meituan.android.bus;

import com.meituan.android.bus.annotation.ThreadMode;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public final Method a;
    public final ThreadMode b;
    public final Class<?> c;

    public d(Method method, Class<?> cls, ThreadMode threadMode) {
        this.a = method;
        this.c = cls;
        this.b = threadMode;
    }
}
