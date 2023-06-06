package com.meituan.android.common.locate.strategy;

import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class b {
    private static volatile b a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private float b;
    private long c;
    private Map<Loader, a> d;
    private long e;
    private float f;
    private boolean g;

    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long a;
        public float b;

        public a() {
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a0d9af1b1e456f5ea70d7b2f3cfc7a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a0d9af1b1e456f5ea70d7b2f3cfc7a9");
            return;
        }
        this.b = -1.0f;
        this.c = -1L;
        this.d = new ConcurrentHashMap();
        this.e = 1000L;
        this.f = 0.0f;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2666bad1a6419e87fd20aba6aaaa863", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2666bad1a6419e87fd20aba6aaaa863");
        }
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54262c2bd4bae5c02e4a97b8bfcf05c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54262c2bd4bae5c02e4a97b8bfcf05c2");
            return;
        }
        SystemLocator systemLocator = SystemLocator.getInstance();
        if (systemLocator != null && systemLocator.isGpsRunning()) {
            this.g = true;
            systemLocator.stop();
            systemLocator.start();
            this.g = false;
        }
    }

    private a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f0767f1adbf60c2b71bcebf4c9171a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f0767f1adbf60c2b71bcebf4c9171a2");
        }
        long j = Long.MAX_VALUE;
        a aVar = null;
        for (Map.Entry<Loader, a> entry : this.d.entrySet()) {
            a value = entry.getValue();
            if (j > value.a) {
                j = value.a;
            } else if (j == value.a && aVar != null && aVar.b > value.b) {
            }
            aVar = value;
        }
        return aVar;
    }

    public synchronized void a(Loader loader) {
        Object[] objArr = {loader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa1ff6d439f8fc404873d908c1e4aa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa1ff6d439f8fc404873d908c1e4aa0");
        } else if (this.d.remove(loader) == null) {
        } else {
            a g = g();
            if (g == null) {
                this.c = -1L;
                this.b = -1.0f;
            } else if (this.c == g.a && this.b == g.b) {
            } else {
                this.c = g.a;
                this.b = g.b;
                f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0027, B:18:0x003d, B:20:0x0047, B:21:0x0054, B:28:0x0066, B:30:0x006c, B:35:0x0074, B:37:0x007a, B:40:0x0084, B:42:0x008c, B:47:0x0096, B:22:0x0057, B:24:0x005d, B:25:0x005f), top: B:53:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0027, B:18:0x003d, B:20:0x0047, B:21:0x0054, B:28:0x0066, B:30:0x006c, B:35:0x0074, B:37:0x007a, B:40:0x0084, B:42:0x008c, B:47:0x0096, B:22:0x0057, B:24:0x005d, B:25:0x005f), top: B:53:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(android.support.v4.content.Loader r12, long r13, float r15) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La3
            r8 = 0
            r0[r8] = r12     // Catch: java.lang.Throwable -> La3
            r1 = 1
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> La3
            r2.<init>(r13)     // Catch: java.lang.Throwable -> La3
            r0[r1] = r2     // Catch: java.lang.Throwable -> La3
            r1 = 2
            java.lang.Float r2 = java.lang.Float.valueOf(r15)     // Catch: java.lang.Throwable -> La3
            r0[r1] = r2     // Catch: java.lang.Throwable -> La3
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.locate.strategy.b.changeQuickRedirect     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = "694b1fb75d026196123cf18bc54851c1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L2c
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r11)
            return
        L2c:
            if (r12 != 0) goto L30
            monitor-exit(r11)
            return
        L30:
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3d
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3d
            monitor-exit(r11)
            return
        L3d:
            java.util.Map<android.support.v4.content.Loader, com.meituan.android.common.locate.strategy.b$a> r0 = r11.d     // Catch: java.lang.Throwable -> La3
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> La3
            com.meituan.android.common.locate.strategy.b$a r0 = (com.meituan.android.common.locate.strategy.b.a) r0     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L57
            com.meituan.android.common.locate.strategy.b$a r0 = new com.meituan.android.common.locate.strategy.b$a     // Catch: java.lang.Throwable -> La3
            r1 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> La3
            java.util.Map<android.support.v4.content.Loader, com.meituan.android.common.locate.strategy.b$a> r1 = r11.d     // Catch: java.lang.Throwable -> La3
            r1.put(r12, r0)     // Catch: java.lang.Throwable -> La3
            r0.b = r15     // Catch: java.lang.Throwable -> La3
        L54:
            r0.a = r13     // Catch: java.lang.Throwable -> La3
            goto L66
        L57:
            float r12 = r0.b     // Catch: java.lang.Throwable -> La3
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L5f
            r0.b = r15     // Catch: java.lang.Throwable -> La3
        L5f:
            long r1 = r0.a     // Catch: java.lang.Throwable -> La3
            int r12 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r12 == 0) goto L66
            goto L54
        L66:
            float r12 = r11.b     // Catch: java.lang.Throwable -> La3
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r12 != 0) goto L74
            long r0 = r11.c     // Catch: java.lang.Throwable -> La3
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 != 0) goto L74
            monitor-exit(r11)
            return
        L74:
            com.meituan.android.common.locate.strategy.b$a r12 = r11.g()     // Catch: java.lang.Throwable -> La3
            if (r12 != 0) goto L84
            r12 = -1
            r11.c = r12     // Catch: java.lang.Throwable -> La3
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.b = r12     // Catch: java.lang.Throwable -> La3
            monitor-exit(r11)
            return
        L84:
            long r13 = r11.c     // Catch: java.lang.Throwable -> La3
            long r0 = r12.a     // Catch: java.lang.Throwable -> La3
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L96
            float r13 = r11.b     // Catch: java.lang.Throwable -> La3
            float r14 = r12.b     // Catch: java.lang.Throwable -> La3
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto L96
            monitor-exit(r11)
            return
        L96:
            long r13 = r12.a     // Catch: java.lang.Throwable -> La3
            r11.c = r13     // Catch: java.lang.Throwable -> La3
            float r12 = r12.b     // Catch: java.lang.Throwable -> La3
            r11.b = r12     // Catch: java.lang.Throwable -> La3
            r11.f()     // Catch: java.lang.Throwable -> La3
            monitor-exit(r11)
            return
        La3:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.strategy.b.a(android.support.v4.content.Loader, long, float):void");
    }

    public long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8dfabfe92c8ea7cefea7adf8e1146d68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8dfabfe92c8ea7cefea7adf8e1146d68")).longValue();
        }
        return Math.max(this.c > 0 ? this.c : this.e, 1000L);
    }

    public float c() {
        return this.b >= 0.0f ? this.b : this.f;
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9215cdbc0bc482ac5bf4e7ca6813b1f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9215cdbc0bc482ac5bf4e7ca6813b1f0");
            return;
        }
        this.e = f.b().getLong(LoadConfig.GPS_MIN_TIME, 1000L);
        this.f = f.b().getFloat(LoadConfig.GPS_MIN_DISTANCE, 0.0f);
    }

    public synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7987e6e1b3c50f4d1eeafea57c0c33b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7987e6e1b3c50f4d1eeafea57c0c33b9");
            return;
        }
        if (this.d.size() > 0 && !this.g) {
            this.d.clear();
        }
    }
}
