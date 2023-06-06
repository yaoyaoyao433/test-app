package com.tencent.mapsdk.internal;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class kr<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private static V e() {
        return null;
    }

    protected int a(V v) {
        return 1;
    }

    protected void a(boolean z, V v) {
    }

    public kr(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private void a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.c = i;
        }
        b(i);
    }

    public final V b(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.a.get(k);
            if (v != null) {
                this.g++;
                return v;
            }
            this.h++;
            return null;
        }
    }

    public final V a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.d++;
            this.b += b(k, v);
            put = this.a.put(k, v);
            if (put != null) {
                this.b -= b(k, put);
            }
        }
        if (put != null) {
            a(false, (boolean) put);
        }
        b(this.c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.b     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.a     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L11
            int r0 = r3.b     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L51
        L11:
            int r0 = r3.b     // Catch: java.lang.Throwable -> L70
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.a     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L1e
            goto L4f
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r3.a     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap<K, V> r2 = r3.a     // Catch: java.lang.Throwable -> L70
            r2.remove(r1)     // Catch: java.lang.Throwable -> L70
            int r2 = r3.b     // Catch: java.lang.Throwable -> L70
            int r1 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L70
            int r2 = r2 - r1
            r3.b = r2     // Catch: java.lang.Throwable -> L70
            int r1 = r3.f     // Catch: java.lang.Throwable -> L70
            r2 = 1
            int r1 = r1 + r2
            r3.f = r1     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            r3.a(r2, r0)
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L70
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L70
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L70
            throw r4     // Catch: java.lang.Throwable -> L70
        L70:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L70
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.kr.b(int):void");
    }

    public final V c(K k) {
        V remove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.a.remove(k);
            if (remove != null) {
                this.b -= b(k, remove);
            }
        }
        if (remove != null) {
            a(false, (boolean) remove);
        }
        return remove;
    }

    private int b(K k, V v) {
        int a = a((kr<K, V>) v);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final void a() {
        b(-1);
    }

    public final synchronized int b() {
        return this.b;
    }

    public final synchronized int c() {
        return this.c;
    }

    private synchronized int f() {
        return this.g;
    }

    private synchronized int g() {
        return this.h;
    }

    private synchronized int h() {
        return this.e;
    }

    private synchronized int i() {
        return this.d;
    }

    private synchronized int j() {
        return this.f;
    }

    public final synchronized Map<K, V> d() {
        return new LinkedHashMap(this.a);
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
