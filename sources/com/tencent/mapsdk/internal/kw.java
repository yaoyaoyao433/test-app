package com.tencent.mapsdk.internal;

import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class kw<T, K> {
    private static final int a = 1024;
    private HashMap<T, K> b;
    private int c = 0;
    private int d = 1024;

    private void a(int i) {
        this.d = i;
    }

    public final synchronized void a(T t, K k) {
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        this.b.put(t, k);
    }

    public final synchronized K a(T t) {
        if (this.b == null) {
            return null;
        }
        return this.b.get(t);
    }

    private synchronized void b(T t) {
        if (this.b == null) {
            return;
        }
        this.b.remove(t);
    }
}
