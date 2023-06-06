package com.meizu.cloud.pushsdk.c.a;

import com.meizu.cloud.pushsdk.c.c.k;
/* loaded from: classes3.dex */
public final class c<T> {
    public final T a;
    public final com.meizu.cloud.pushsdk.c.b.a b;
    public k c;

    public c(com.meizu.cloud.pushsdk.c.b.a aVar) {
        this.a = null;
        this.b = aVar;
    }

    public c(T t) {
        this.a = t;
        this.b = null;
    }

    public static <T> c<T> a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        return new c<>(aVar);
    }

    public static <T> c<T> a(T t) {
        return new c<>(t);
    }

    public final boolean a() {
        return this.b == null;
    }
}
