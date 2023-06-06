package com.meituan.android.common.locate;

import android.os.Build;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public class a {
    private static volatile a a;
    private static CopyOnWriteArrayList<C0205a> b = new CopyOnWriteArrayList<>();
    private static Map<C0205a, AddressResult> c = new HashMap();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.meituan.android.common.locate.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0205a {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final double a;
        private final double b;
        private final float c;

        public C0205a(MtLocation mtLocation) {
            float accuracy;
            Object[] objArr = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa21125554e5b0015163a1559427bf2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa21125554e5b0015163a1559427bf2c");
                return;
            }
            if (mtLocation == null) {
                LogUtils.a("LocationAddressCache SimpleLoc location is null!");
                this.a = 0.0d;
                this.b = 0.0d;
                accuracy = 0.0f;
            } else {
                this.a = mtLocation.getLatitude();
                this.b = mtLocation.getLongitude();
                accuracy = mtLocation.getAccuracy();
            }
            this.c = accuracy;
        }

        private int a(Double[] dArr) {
            Object[] objArr = {dArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c80e00353df92dabb2797a0a9a8dcdd8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c80e00353df92dabb2797a0a9a8dcdd8")).intValue();
            }
            if (dArr == null) {
                return 0;
            }
            int length = dArr.length;
            int i = 1;
            for (int i2 = 0; i2 < length; i2++) {
                Double d = dArr[i2];
                i = (i * 31) + (d == null ? 0 : d.hashCode());
            }
            return i;
        }

        private boolean a(double d, double d2) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dd43ded74e0972e22994af92695613f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dd43ded74e0972e22994af92695613f")).booleanValue() : Math.abs(d - d2) < 1.0E-4d;
        }

        private boolean a(float f, float f2) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bb550e866565a229b4094edabb6a26d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bb550e866565a229b4094edabb6a26d")).booleanValue() : Math.abs(f - f2) < 10.0f;
        }

        public double a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }

        public float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e614fdeaa0dc48364155561980624ab4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e614fdeaa0dc48364155561980624ab4")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C0205a c0205a = (C0205a) obj;
                if (a(this.a, c0205a.a()) && a(this.b, c0205a.b()) && a(this.c, c0205a.c())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2ef8adb0436e6cc07b42bf179424007", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2ef8adb0436e6cc07b42bf179424007")).intValue() : Build.VERSION.SDK_INT >= 19 ? Objects.hash(Double.valueOf(this.a), Double.valueOf(this.b), Float.valueOf(this.c)) : a(new Double[]{Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c)});
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ee73f2608a42ec8ebc2159bf688b7a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ee73f2608a42ec8ebc2159bf688b7a4");
        }
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        r12 = com.meituan.android.common.locate.a.c.get(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.meituan.android.common.locate.AddressResult a(com.meituan.android.common.locate.MtLocation r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L50
            r8 = 0
            r0[r8] = r12     // Catch: java.lang.Throwable -> L50
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.locate.a.changeQuickRedirect     // Catch: java.lang.Throwable -> L50
            java.lang.String r10 = "26db8dbfd1948a9a601817e2fee30451"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L20
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)     // Catch: java.lang.Throwable -> L50
            com.meituan.android.common.locate.AddressResult r12 = (com.meituan.android.common.locate.AddressResult) r12     // Catch: java.lang.Throwable -> L50
            monitor-exit(r11)
            return r12
        L20:
            r0 = 0
            com.meituan.android.common.locate.a$a r1 = new com.meituan.android.common.locate.a$a     // Catch: java.lang.Throwable -> L50
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L50
            java.util.concurrent.CopyOnWriteArrayList<com.meituan.android.common.locate.a$a> r12 = com.meituan.android.common.locate.a.b     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L50
        L2c:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> L50
            com.meituan.android.common.locate.a$a r2 = (com.meituan.android.common.locate.a.C0205a) r2     // Catch: java.lang.Throwable -> L50
            boolean r3 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L2c
            java.util.Map<com.meituan.android.common.locate.a$a, com.meituan.android.common.locate.AddressResult> r12 = com.meituan.android.common.locate.a.c     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L50
            java.lang.Object r12 = r12.get(r2)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L50
            com.meituan.android.common.locate.AddressResult r12 = (com.meituan.android.common.locate.AddressResult) r12     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L50
            goto L4e
        L47:
            r12 = move-exception
            java.lang.Class<com.meituan.android.common.locate.a> r1 = com.meituan.android.common.locate.a.class
            com.meituan.android.common.locate.util.LogUtils.a(r1, r12)     // Catch: java.lang.Throwable -> L50
        L4d:
            r12 = r0
        L4e:
            monitor-exit(r11)
            return r12
        L50:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.a.a(com.meituan.android.common.locate.MtLocation):com.meituan.android.common.locate.AddressResult");
    }

    public synchronized void a(MtLocation mtLocation, AddressResult addressResult) {
        boolean z = false;
        Object[] objArr = {mtLocation, addressResult};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c6d6485ac83662221c0eb3d7731c6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c6d6485ac83662221c0eb3d7731c6ab");
            return;
        }
        C0205a c0205a = new C0205a(mtLocation);
        if (b != null && !b.isEmpty()) {
            Iterator<C0205a> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (c0205a.equals(it.next())) {
                    break;
                }
            }
            if (z) {
                b.add(c0205a);
                c.put(c0205a, addressResult);
            }
            return;
        }
        b.add(c0205a);
        c.put(c0205a, addressResult);
    }
}
