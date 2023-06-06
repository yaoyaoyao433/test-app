package com.bumptech.glide.provider;

import com.bumptech.glide.util.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    private static final g a = new g();
    private final Map<g, b<?, ?>> b = new HashMap();

    public final <T, Z> void a(Class<T> cls, Class<Z> cls2, b<T, Z> bVar) {
        this.b.put(new g(cls, cls2), bVar);
    }

    public final <T, Z> b<T, Z> a(Class<T> cls, Class<Z> cls2) {
        b<T, Z> bVar;
        synchronized (a) {
            a.a(cls, cls2);
            bVar = (b<T, Z>) this.b.get(a);
        }
        return bVar == null ? d.e() : bVar;
    }
}
