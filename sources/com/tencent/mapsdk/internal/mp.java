package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.mr;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class mp<T extends mr> {
    protected int a;
    protected long b;
    protected mq<T> c;
    protected T d;

    /* JADX INFO: Access modifiers changed from: protected */
    public mp(mq<T> mqVar, T t) {
        this.c = mqVar;
        this.d = t;
    }

    public final void a(T t) {
        if (this.c == null || t == null) {
            return;
        }
        this.d = t;
        this.c.a(this);
    }

    public void remove() {
        if (this.c == null) {
            return;
        }
        this.c.b(this);
    }

    public final T a() {
        return this.d;
    }

    public final void a(long j) {
        this.b = j;
    }

    public final long b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public String getId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        return sb.toString();
    }
}
