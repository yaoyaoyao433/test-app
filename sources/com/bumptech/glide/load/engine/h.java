package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.squareup.picasso.MonitorData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h<Z> implements l<Z> {
    final boolean a;
    a b;
    com.bumptech.glide.load.c c;
    private final l<Z> d;
    private int e;
    private boolean f;
    private MonitorData g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void b(com.bumptech.glide.load.c cVar, h<?> hVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public final String b() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(l<Z> lVar, boolean z) {
        if (lVar == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.d = lVar;
        this.a = z;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final Z a() {
        return this.d.a();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final int c() {
        return this.d.c();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void d() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.d.d();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final MonitorData e() {
        if (this.g != null) {
            return this.g;
        }
        return this.d.e();
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void a(MonitorData monitorData) {
        this.g = monitorData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.e++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            this.b.b(this.c, this);
        }
    }
}
