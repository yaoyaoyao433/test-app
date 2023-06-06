package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.jw;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class w {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static final ThreadLocal<a> d = new ThreadLocal<>();
    public static final a c = new a() { // from class: com.sankuai.meituan.tte.w.1
        @Override // com.sankuai.meituan.tte.w.a
        public final a a(String str, String str2) {
            return this;
        }

        @Override // com.sankuai.meituan.tte.w.a
        public final void a() {
        }

        @Override // com.sankuai.meituan.tte.w.a
        public final void b() {
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        a a(String str, String str2);

        void a();

        void b();
    }

    public static com.dianping.monitor.impl.l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ff5017d4d979a6396f796bceb512f07", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.impl.l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ff5017d4d979a6396f796bceb512f07");
        }
        com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(jw.g, x.a(), y.c());
        StringBuilder sb = new StringBuilder();
        sb.append(y.b());
        return mVar.a("tte_appId", sb.toString());
    }

    public static a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c5c4e0e5103f3655a6a88c198dda93a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c5c4e0e5103f3655a6a88c198dda93a");
        }
        if (b) {
            e a2 = e.a(x.a());
            String str3 = "sampleRate." + str2;
            double d2 = 0.01d;
            Object[] objArr2 = {str3, Double.valueOf(0.01d)};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "a2b68df8e380f2aa351ecf0dcae3b4f3", RobustBitConfig.DEFAULT_VALUE)) {
                d2 = ((Double) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "a2b68df8e380f2aa351ecf0dcae3b4f3")).doubleValue();
            } else {
                Object obj = a2.b.get(str3);
                if (obj instanceof Number) {
                    d2 = ((Number) obj).doubleValue();
                }
            }
            if (ThreadLocalRandom.current().nextDouble() < d2) {
                return new b(str);
            }
        }
        return c;
    }

    public static a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94d8429eaf0cad3342308e11af9e9384", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94d8429eaf0cad3342308e11af9e9384") : d.get();
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43e77839fa9e228897591747ff3adc72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43e77839fa9e228897591747ff3adc72");
        } else {
            d.set(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;
        final String b;
        final Map<String, String> c;
        private final long d;
        private long e;

        public b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bac58c554be06f8a3dbc973d96f79a38", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bac58c554be06f8a3dbc973d96f79a38");
                return;
            }
            this.e = -1L;
            this.b = str;
            this.d = System.nanoTime();
            this.c = new ConcurrentHashMap();
        }

        @Override // com.sankuai.meituan.tte.w.a
        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0ea2bee9dd926d969a3306da5e5c6a", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0ea2bee9dd926d969a3306da5e5c6a");
            }
            this.c.put(str, str2);
            return this;
        }

        @Override // com.sankuai.meituan.tte.w.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e5d5a329b6a82a1387c121eaf63b63", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e5d5a329b6a82a1387c121eaf63b63");
            } else {
                this.e = System.nanoTime();
            }
        }

        @Override // com.sankuai.meituan.tte.w.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b9c838044facea33e6f9f1f3f1a95d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b9c838044facea33e6f9f1f3f1a95d");
            } else if (w.b) {
                if (this.e < 0) {
                    this.e = System.nanoTime();
                }
                final long j = this.e - this.d;
                com.sankuai.waimai.launcher.util.aop.b.a(g.d(), new Runnable() { // from class: com.sankuai.meituan.tte.w.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30353177a3f80e2105a8732bc2ccd2b5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30353177a3f80e2105a8732bc2ccd2b5");
                            return;
                        }
                        com.dianping.monitor.impl.l a2 = w.a();
                        for (Map.Entry<String, String> entry : b.this.c.entrySet()) {
                            a2.a(entry.getKey(), entry.getValue());
                        }
                        long micros = TimeUnit.NANOSECONDS.toMicros(j);
                        a2.a(b.this.b, Arrays.asList(Float.valueOf((float) micros)));
                        a2.a();
                        if (x.c) {
                            u.a("TMonitor", String.format("[%s][%,d]%s", b.this.b, Long.valueOf(micros), b.this.c));
                        }
                    }
                });
            }
        }
    }
}
