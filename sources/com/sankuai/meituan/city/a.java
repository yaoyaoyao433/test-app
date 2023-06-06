package com.sankuai.meituan.city;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.base.b;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.locate.AddressResult;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.City;
import com.sankuai.model.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.meituan.android.base.b {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<Long, City> g = new ConcurrentHashMap<>();
    private volatile long b;
    private volatile long c;
    private volatile long d;
    private volatile long e;
    private volatile boolean f;
    private final List<Object> h;
    private final List<b.c> i;
    private final Handler j;
    private final q k;
    private b l;
    private volatile boolean m;
    private volatile MtLocation n;
    private volatile Long o;
    private MetricsSpeedMeterTask p;

    public static /* synthetic */ void a(a aVar, AddressResult addressResult) {
        Object[] objArr = {addressResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f9469474b5f047219bccf8e6aaa20875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f9469474b5f047219bccf8e6aaa20875");
            return;
        }
        for (b.c cVar : aVar.i) {
            if (!(cVar instanceof b.a) && (cVar instanceof b.InterfaceC0183b) && addressResult != null && addressResult.getCityId() != -1) {
                addressResult.getCityId();
            }
        }
        aVar.i.clear();
        aVar.m = false;
    }

    public static /* synthetic */ boolean a(a aVar, MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "61ba429692332268e7aa02659f4982ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "61ba429692332268e7aa02659f4982ec")).booleanValue() : (mtLocation == null || mtLocation.getLatitude() == 0.0d || mtLocation.getLongitude() == 0.0d) ? false : true;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.f = true;
        return true;
    }

    public static /* synthetic */ void b(a aVar, MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e3d5cf0068c28b4797edee388eec6529", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e3d5cf0068c28b4797edee388eec6529");
        } else if (mtLocation == null) {
            Iterator<b.c> it = aVar.i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            aVar.i.clear();
            aVar.m = false;
        } else {
            Iterator<b.c> it2 = aVar.i.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            aVar.n = mtLocation;
        }
    }

    public static /* synthetic */ void c(a aVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "747f7c6ba1f3ebde7aec9510086be92f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "747f7c6ba1f3ebde7aec9510086be92f");
        } else {
            aVar.k.a("city_locate_time", j);
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248df2df41848e3d6cb1dc76fde040b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248df2df41848e3d6cb1dc76fde040b1");
            return;
        }
        this.b = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = false;
        this.h = new ArrayList();
        this.i = new CopyOnWriteArrayList();
        this.j = new Handler(Looper.getMainLooper());
        this.m = false;
        this.n = null;
        this.o = null;
        this.k = q.a(context, "mtplatform_base", 2);
    }

    private City c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f50b35f54b9345c68eab58a591cfc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (City) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f50b35f54b9345c68eab58a591cfc4");
        }
        if (this.l != null) {
            List<City> a2 = this.l.a();
            if (CollectionUtils.isEmpty(a2)) {
                return null;
            }
            for (City city : a2) {
                if (city != null && city.id != null && city.id.longValue() == j) {
                    return city;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.meituan.model.dao.City a(long r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.city.a.a
            java.lang.String r10 = "fbd4072f8272e8ed86d0da0d7190ec87"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.sankuai.meituan.model.dao.City r12 = (com.sankuai.meituan.model.dao.City) r12
            return r12
        L23:
            r0 = -1
            r2 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L2b
            return r2
        L2b:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.sankuai.meituan.model.dao.City> r0 = com.sankuai.meituan.city.a.g
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L44
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.sankuai.meituan.model.dao.City> r0 = com.sankuai.meituan.city.a.g
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object r12 = r0.get(r12)
            com.sankuai.meituan.model.dao.City r12 = (com.sankuai.meituan.model.dao.City) r12
            return r12
        L44:
            long r0 = r11.b()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L76
            com.meituan.android.cipstorage.q r0 = r11.k
            java.lang.String r1 = "city"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.b(r1, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L69
            java.lang.Class<com.sankuai.meituan.model.dao.City> r1 = com.sankuai.meituan.model.dao.City.class
            java.lang.Object r0 = com.meituan.android.turbo.a.a(r1, r0)     // Catch: java.lang.Exception -> L65
            com.sankuai.meituan.model.dao.City r0 = (com.sankuai.meituan.model.dao.City) r0     // Catch: java.lang.Exception -> L65
            goto L6a
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            r0 = r2
        L6a:
            if (r0 == 0) goto L76
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.sankuai.meituan.model.dao.City> r1 = com.sankuai.meituan.city.a.g
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r1.put(r12, r0)
            return r0
        L76:
            com.sankuai.meituan.model.dao.City r0 = r11.c(r12)
            long r1 = r11.b()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L92
            com.meituan.android.cipstorage.q r1 = r11.k     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = "city"
            java.lang.String r3 = com.meituan.android.turbo.a.a(r0)     // Catch: java.lang.Exception -> L8e
            r1.a(r2, r3)     // Catch: java.lang.Exception -> L8e
            goto L92
        L8e:
            r1 = move-exception
            r1.printStackTrace()
        L92:
            if (r0 == 0) goto L9d
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.sankuai.meituan.model.dao.City> r1 = com.sankuai.meituan.city.a.g
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r1.put(r12, r0)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.city.a.a(long):com.sankuai.meituan.model.dao.City");
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb8b7cb8b63cfa7a2b8af6109c18110", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb8b7cb8b63cfa7a2b8af6109c18110");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        City a2 = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10183c2e80f51e18b9f7d18d49fd3125", RobustBitConfig.DEFAULT_VALUE) ? (City) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10183c2e80f51e18b9f7d18d49fd3125") : a(b());
        return a2 == null ? "" : a2.name;
    }

    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b153a2413aaf37d17463f23714dc8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b153a2413aaf37d17463f23714dc8f")).longValue();
        }
        if (this.o == null) {
            this.o = Long.valueOf(this.k.b(DataConstants.CITY_ID, -1L));
        }
        return this.o.longValue();
    }

    public final void b(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d45fe3f4d6fae794c985e0b94053a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d45fe3f4d6fae794c985e0b94053a16");
            return;
        }
        final long c = c();
        this.k.a("city_locate_city_id", j);
        this.j.post(new Runnable() { // from class: com.sankuai.meituan.city.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9148556948871aeffedafa3136c29746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9148556948871aeffedafa3136c29746");
                    return;
                }
                synchronized (a.this.h) {
                    if (j != c && !CollectionUtils.isEmpty(a.this.h)) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(a.this.h);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                }
            }
        });
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a943da5992f2dab5246d1ee9f1a3f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a943da5992f2dab5246d1ee9f1a3f9")).longValue();
        }
        try {
            try {
                return this.k.b("city_locate_city_id", -1L);
            } catch (Throwable unused) {
                return this.k.b("city_locate_city_id", -1);
            }
        } catch (Throwable unused2) {
            return -1L;
        }
    }
}
