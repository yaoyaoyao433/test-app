package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.util.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    private static final g a = new g();
    private final Map<g, c<?, ?>> b = new HashMap();

    public final <Z, R> void a(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
        this.b.put(new g(cls, cls2), cVar);
    }

    public final <Z, R> c<Z, R> a(Class<Z> cls, Class<R> cls2) {
        c<Z, R> cVar;
        if (cls.equals(cls2)) {
            return e.b();
        }
        synchronized (a) {
            a.a(cls, cls2);
            cVar = (c<Z, R>) this.b.get(a);
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }
}
