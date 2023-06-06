package com.meituan.msc.common.report;

import com.meituan.msc.common.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.n;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final ExecutorService j = com.sankuai.android.jarvis.c.a("msc-metrics", n.PRIORITY_DEFAULT);
    public final a b;
    final boolean c;
    public final Map<String, Object> d;
    public volatile List<c> e;
    public final String f;
    public double g;
    private String h;
    private boolean i;

    public d(a aVar, boolean z, String str) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcacbb00e4542d0b584a4b5d53a62d3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcacbb00e4542d0b584a4b5d53a62d3f");
            return;
        }
        this.g = -1.0d;
        this.i = false;
        this.b = aVar;
        this.c = z;
        this.f = str;
        this.d = new ad();
    }

    public final d a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b63db17829c685bb3bef4aa8364ba7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b63db17829c685bb3bef4aa8364ba7d");
        }
        if (str != null) {
            this.d.put(str, obj);
        }
        return this;
    }

    public final d a(final String str, final b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4cdfe3c559d8123cff1bfc7ee292e0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4cdfe3c559d8123cff1bfc7ee292e0") : a(new c() { // from class: com.meituan.msc.common.report.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.common.report.c
            public final void a(d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d95e84f38fe406ac529daa6b0cfe4ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d95e84f38fe406ac529daa6b0cfe4ee");
                } else if (bVar.a() != null) {
                    dVar.a(str, bVar.a());
                }
            }
        });
    }

    public final d a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e117f92b8749968af96d46719aa22cab", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e117f92b8749968af96d46719aa22cab");
        }
        if (this.e == null) {
            this.e = new CopyOnWriteArrayList();
        }
        this.e.add(cVar);
        return this;
    }

    public final d a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f411ade2b1e0e3b7d769e0317e50e63", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f411ade2b1e0e3b7d769e0317e50e63");
        }
        this.d.putAll(map);
        return this;
    }

    public final d a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c38731753abbc440724e50c574c8dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c38731753abbc440724e50c574c8dc");
        }
        this.g = d;
        return this;
    }

    public final d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "176f02ecdb75555d7b12a2f935561ee1", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "176f02ecdb75555d7b12a2f935561ee1");
        }
        Long e = this.b.e(this.f);
        this.g = (e == null || e.longValue() < 0) ? -1.0d : this.b.a() - e.longValue();
        return this;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a7c50509e4346025a192b64ecb439e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a7c50509e4346025a192b64ecb439e");
        } else if (this.i) {
        } else {
            this.i = true;
            j.execute(new Runnable() { // from class: com.meituan.msc.common.report.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bdd35b061ed28d84ab9c31ff811bacf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bdd35b061ed28d84ab9c31ff811bacf");
                    } else {
                        d.this.b.a(d.this, false);
                    }
                }
            });
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495e02a88ee5d8678ece3ebe2f0faf17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495e02a88ee5d8678ece3ebe2f0faf17");
        } else if (this.i) {
        } else {
            this.i = true;
            j.execute(new Runnable() { // from class: com.meituan.msc.common.report.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59bcb2895acadb38a117a70924e5496a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59bcb2895acadb38a117a70924e5496a");
                    } else {
                        d.this.b.a(d.this, true);
                    }
                }
            });
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4451177075d18c047e5ec94223da27", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4451177075d18c047e5ec94223da27");
        }
        return "MetricsEntry{key='" + this.f + "', tags=" + this.d + ", value=" + this.g + ", extra='" + this.h + "'}";
    }
}
