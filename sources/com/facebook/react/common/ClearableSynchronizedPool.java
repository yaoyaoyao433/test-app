package com.facebook.react.common;

import android.support.v4.util.Pools;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ClearableSynchronizedPool<T> implements Pools.Pool<T> {
    private int b = 0;
    private final Object[] a = new Object[1024];

    public ClearableSynchronizedPool(int i) {
    }

    @Override // android.support.v4.util.Pools.Pool
    public synchronized T acquire() {
        if (this.b == 0) {
            return null;
        }
        this.b--;
        int i = this.b;
        T t = (T) this.a[i];
        this.a[i] = null;
        return t;
    }

    @Override // android.support.v4.util.Pools.Pool
    public synchronized boolean release(T t) {
        if (this.b == this.a.length) {
            return false;
        }
        this.a[this.b] = t;
        this.b++;
        return true;
    }

    public final synchronized void a() {
        for (int i = 0; i < this.b; i++) {
            this.a[i] = null;
        }
        this.b = 0;
    }
}
