package com.meituan.dio.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d<K, V> {
    public static ChangeQuickRedirect a;
    private final LinkedHashMap<K, V> b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    private int b(K k, V v) {
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b2a01000c64590cf4d61140449f5cd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b2a01000c64590cf4d61140449f5cd9")).intValue();
        }
        return 1;
    }

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af76319a8cf87c9933d33b3a25c837b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af76319a8cf87c9933d33b3a25c837b0");
        } else if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else {
            this.d = i;
            this.b = new LinkedHashMap<>(0, 0.75f, true);
        }
    }

    public final V a(K k) {
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650ec9f11d2af3c6fdc84a0d03ee9af3", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650ec9f11d2af3c6fdc84a0d03ee9af3");
        }
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.b.get(k);
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
        Object[] objArr = {k, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973141d21113561c4b61ac885150afc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973141d21113561c4b61ac885150afc4");
        }
        if (k == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.e++;
            this.c += b(k, v);
            put = this.b.put(k, v);
            if (put != null) {
                this.c -= b(k, put);
            }
        }
        a(this.d);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r9 = 0
            r8[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.dio.utils.d.a
            java.lang.String r11 = "d4c04c7df2bebccb7b960394b0e0685a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1f:
            monitor-enter(r12)
            int r1 = r12.c     // Catch: java.lang.Throwable -> L8e
            if (r1 < 0) goto L6f
            java.util.LinkedHashMap<K, V> r1 = r12.b     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L30
            int r1 = r12.c     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L6f
        L30:
            int r1 = r12.c     // Catch: java.lang.Throwable -> L8e
            if (r1 > r13) goto L36
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8e
            return
        L36:
            r1 = 0
            java.util.LinkedHashMap<K, V> r2 = r12.b     // Catch: java.lang.Throwable -> L8e
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8e
        L41:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L4e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L8e
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L8e
            goto L41
        L4e:
            if (r1 != 0) goto L52
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8e
            return
        L52:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r3 = r12.b     // Catch: java.lang.Throwable -> L8e
            r3.remove(r2)     // Catch: java.lang.Throwable -> L8e
            int r3 = r12.c     // Catch: java.lang.Throwable -> L8e
            int r1 = r12.b(r2, r1)     // Catch: java.lang.Throwable -> L8e
            int r3 = r3 - r1
            r12.c = r3     // Catch: java.lang.Throwable -> L8e
            int r1 = r12.f     // Catch: java.lang.Throwable -> L8e
            int r1 = r1 + r0
            r12.f = r1     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8e
            goto L1f
        L6f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r0.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.Class r1 = r12.getClass()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8e
            r0.append(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L8e
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L8e
            throw r13     // Catch: java.lang.Throwable -> L8e
        L8e:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8e
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.dio.utils.d.a(int):void");
    }

    public final V b(K k) {
        V remove;
        Object[] objArr = {k};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4fd57ff02221a67550eeda4caddf98", RobustBitConfig.DEFAULT_VALUE)) {
            return (V) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4fd57ff02221a67550eeda4caddf98");
        }
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.b.remove(k);
            if (remove != null) {
                this.c -= b(k, remove);
            }
        }
        return remove;
    }

    public final synchronized String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3239667e520c23beed703095af638a26", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3239667e520c23beed703095af638a26");
        }
        int i = this.g + this.h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.d), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
