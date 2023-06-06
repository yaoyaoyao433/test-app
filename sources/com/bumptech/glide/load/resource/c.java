package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.l;
import com.squareup.picasso.MonitorData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c<T> implements l<T> {
    protected final T a;
    private MonitorData b;

    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return null;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
    }

    public c(T t) {
        if (t == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.a = t;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final T a() {
        return this.a;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final MonitorData e() {
        return this.b;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void a(MonitorData monitorData) {
        this.b = monitorData;
    }
}
