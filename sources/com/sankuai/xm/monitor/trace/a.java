package com.sankuai.xm.monitor.trace;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.e;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.i;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.f;
import com.sankuai.xm.base.util.r;
import com.sankuai.xm.monitor.report.db.TraceBean;
import com.sankuai.xm.monitor.trace.rule.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements com.sankuai.xm.base.trace.c {
    public static ChangeQuickRedirect a;
    final Map<String, g> b;
    volatile b c;
    public volatile com.sankuai.xm.monitor.trace.rule.c d;
    com.sankuai.xm.monitor.trace.repository.a e;
    f<JSONObject> f;
    Map<String, Integer> g;
    private c h;
    private boolean i;
    private f<Integer> j;

    public static /* synthetic */ void a(a aVar, List list) {
        boolean z;
        long j;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "76170115c7c51dcf1b323be15d5dc35d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "76170115c7c51dcf1b323be15d5dc35d");
        } else if (com.sankuai.xm.base.util.b.a((Collection<?>) list)) {
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.b() != 0) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1a62eedbe51f5b8964e24a235ad89550", 6917529027641081856L)) {
                        j = ((Long) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1a62eedbe51f5b8964e24a235ad89550")).longValue();
                    } else {
                        com.sankuai.xm.monitor.b.c();
                        com.sankuai.xm.monitor.a d = com.sankuai.xm.monitor.b.d();
                        j = d == null ? 0L : d.c;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    d a2 = aVar.a().a(gVar);
                    TraceBean traceBean = new TraceBean();
                    traceBean.setId(gVar.c());
                    traceBean.setTraceId(gVar.b());
                    traceBean.setName(gVar.d());
                    traceBean.setTraceName(gVar.e());
                    traceBean.setType(gVar.o().toString());
                    traceBean.setRule(a2.e);
                    traceBean.setTool(a2.f);
                    traceBean.setCreateTime(gVar.k() > 0 ? gVar.k() : currentTimeMillis);
                    traceBean.setExeTime(gVar.m());
                    traceBean.setUpdateTime(currentTimeMillis);
                    if (!traceBean.finishStatus()) {
                        currentTimeMillis = 30000 + traceBean.getCreateTime();
                    }
                    traceBean.setDeadline(currentTimeMillis);
                    traceBean.setUid(j);
                    if (!com.sankuai.xm.base.util.b.a(gVar.n())) {
                        traceBean.setSharedIds(gVar.n().toString());
                    }
                    if (!com.sankuai.xm.base.util.b.b(gVar.f())) {
                        gVar.a("args", (Object) Arrays.asList(gVar.f()).toString());
                    }
                    if (!ac.a(gVar.q())) {
                        gVar.a("badPre", (Object) gVar.q());
                        com.sankuai.xm.monitor.c.a("trace_bad_node", "msg", gVar.q());
                    }
                    if (!com.sankuai.xm.base.util.b.a(gVar.i())) {
                        gVar.a(true);
                    }
                    if (gVar.j()) {
                        traceBean.setStatus(traceBean.getStatus() | 2);
                    }
                    if (gVar.a() != null && !gVar.a().isEmpty()) {
                        if (gVar.a().containsKey("error") && gVar.p() == 0) {
                            gVar.a("code", (Object) (-1));
                            gVar.a(-1);
                        }
                        traceBean.setParams(r.a(gVar.a()));
                    }
                    if (gVar.p() != 0) {
                        traceBean.setStatus(traceBean.getStatus() | 8);
                    }
                    linkedHashMap.put(aVar.d(gVar), traceBean);
                    if (gVar.o() != i.normal) {
                        i++;
                    }
                }
            }
            com.sankuai.xm.log.c.a("xm_trace ", "addOrUpdateTraceBean::traceBeans = " + linkedHashMap.size(), new Object[0]);
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "17b625feea2c39c47be2d84d2a4e7e35", 6917529027641081856L)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "17b625feea2c39c47be2d84d2a4e7e35")).booleanValue();
            } else {
                if (aVar.i) {
                    if (aVar.j == null) {
                        aVar.j = new f<>(e.a(), "max", 0);
                    }
                    if (aVar.j.a().intValue() + i <= 8500) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z || linkedHashMap.size() <= 0) {
                if (z) {
                    com.sankuai.xm.monitor.c.a("trace_limit", "count", (Object) 8500);
                    return;
                } else {
                    com.sankuai.xm.log.c.c("xm_trace ", "addOrUpdateTraceBean::empty", new Object[0]);
                    return;
                }
            }
            Object[] objArr4 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "45dce35a2bbbc0d70468fc1992bfc19b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "45dce35a2bbbc0d70468fc1992bfc19b");
            } else {
                int intValue = aVar.j.a(Integer.valueOf(i)).intValue();
                com.sankuai.xm.log.c.a("xm_trace ", "updateDailyCount::count = " + intValue, new Object[0]);
            }
            aVar.e.a(new ArrayList(linkedHashMap.values()));
        }
    }

    public a(com.sankuai.xm.monitor.trace.repository.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b8f14d43b42078484a33ad067e6aca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b8f14d43b42078484a33ad067e6aca7");
            return;
        }
        this.b = new LinkedHashMap();
        this.g = new HashMap();
        this.e = aVar;
    }

    @Override // com.sankuai.xm.base.trace.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8367096609f31f9f23f53a452867bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8367096609f31f9f23f53a452867bf");
            return;
        }
        this.i = z;
        if (this.i) {
            b();
        }
    }

    @Override // com.sankuai.xm.base.trace.c
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca151ad017524c2250fdf5290f305fdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca151ad017524c2250fdf5290f305fdb");
        } else {
            a(gVar, 1);
        }
    }

    @Override // com.sankuai.xm.base.trace.c
    public final void b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2812a7f5357e95dcc77b171157d5f15d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2812a7f5357e95dcc77b171157d5f15d");
        } else {
            a(gVar, 2);
        }
    }

    @Override // com.sankuai.xm.base.trace.c
    public final void c(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ea91d19d331a90fe0186baa39586b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ea91d19d331a90fe0186baa39586b1");
        } else {
            a(gVar, 3);
        }
    }

    private void a(g gVar, int i) {
        Object[] objArr = {gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199dbb6beba638d43001661134e5b843", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199dbb6beba638d43001661134e5b843");
        } else if (gVar.b() != 0) {
            synchronized (this) {
                String d = d(gVar);
                if (i == 1) {
                    this.b.put(d, gVar);
                } else {
                    g gVar2 = this.b.get(d);
                    if (gVar2 == null) {
                        this.b.put(d, gVar);
                    } else if (gVar != gVar2) {
                        gVar.a(gVar.h());
                        gVar.a(gVar.l());
                        gVar.a(gVar.g());
                        List<Throwable> i2 = gVar.i();
                        if (com.sankuai.xm.base.util.b.a(i2)) {
                            for (Throwable th : i2) {
                                gVar2.b(th);
                            }
                        }
                    }
                }
                if (this.h == null) {
                    this.h = new c();
                    this.h.b = 0L;
                }
                if (System.currentTimeMillis() - this.h.b >= 1000 || this.b.size() >= 50) {
                    this.h.b = System.currentTimeMillis();
                    m.e().a(22, this.h, 1000L);
                }
            }
        }
    }

    private String d(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83f101dd76e4df510095aff3193a2f89", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83f101dd76e4df510095aff3193a2f89");
        }
        return gVar.b() + "#" + gVar.c();
    }

    com.sankuai.xm.monitor.trace.rule.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94d055f7600f7bfd1b51dab5f8d7300", 6917529027641081856L)) {
            return (com.sankuai.xm.monitor.trace.rule.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94d055f7600f7bfd1b51dab5f8d7300");
        }
        if (this.d == null) {
            this.d = new C1416a();
        }
        return this.d;
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd2cb5d41e7faa94d670339d970182a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd2cb5d41e7faa94d670339d970182a");
        } else if (!this.i || this.c != null) {
            com.sankuai.xm.log.c.b("xm_trace ", "not open or collection task is running. enable = " + this.i, new Object[0]);
        } else {
            this.c = new b();
            com.sankuai.xm.threadpool.scheduler.a.b().a(22, this.c, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c implements Runnable {
        public static ChangeQuickRedirect a;
        public long b;

        private c() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c57a557c6fc773147b6ff18c7ef6e08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c57a557c6fc773147b6ff18c7ef6e08");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e1b5005d7ec8582350ab2dfcbf5bfa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e1b5005d7ec8582350ab2dfcbf5bfa");
                return;
            }
            ArrayList arrayList = null;
            synchronized (a.this) {
                if (a.this.b.size() > 0) {
                    arrayList = new ArrayList(a.this.b.values());
                    a.this.b.clear();
                }
            }
            a.a(a.this, arrayList);
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        public boolean b;

        private b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf523e2d79729e265bf318e2585adcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf523e2d79729e265bf318e2585adcd");
            } else {
                this.b = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0163 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0098 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 611
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.monitor.trace.a.b.run():void");
        }

        private void a() {
            int intValue;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17dcbb189314ea53416b47cda4f6fa22", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17dcbb189314ea53416b47cda4f6fa22");
                return;
            }
            com.sankuai.xm.monitor.trace.rule.b a2 = a.this.a().a();
            for (Map.Entry<String, Integer> entry : a.this.g.entrySet()) {
                String key = entry.getKey();
                Object[] objArr2 = {key};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.monitor.trace.rule.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1b928046fed3978845776fdc899bb2b5", 6917529027641081856L)) {
                    intValue = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1b928046fed3978845776fdc899bb2b5")).intValue();
                } else {
                    Integer num = a2.b.get(key);
                    intValue = num == null ? 100 : num.intValue();
                }
                if (entry.getValue().intValue() > intValue) {
                    if ((a2.f & d.c) != 0) {
                        String str = "trace-" + m.a().b() + CommonConstant.Symbol.MINUS + com.sankuai.xm.base.f.m().b();
                        com.sankuai.xm.log.c.b("xm_trace ", "checkReachErrorLimit, trace error = " + a.this.g + ", file = " + str, new Object[0]);
                        com.sankuai.xm.log.c.a(str, new Date());
                    }
                    if ((a2.f & d.d) != 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("count", entry.getValue());
                        hashMap.put("name", entry.getKey());
                        com.sankuai.xm.monitor.c.a("trace_error", hashMap);
                    }
                    a.this.g.clear();
                    return;
                }
            }
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6502dd2f9da67c6d03f03f677bae7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6502dd2f9da67c6d03f03f677bae7e");
            } else if (a.this.g.isEmpty()) {
                if (a.this.f == null) {
                    a.this.f = new f<>(e.a(), "error", null);
                }
                JSONObject a2 = a.this.f.a();
                if (a2 == null) {
                    return;
                }
                Iterator<String> keys = a2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a.this.g.put(next, Integer.valueOf(a2.optInt(next)));
                }
            }
        }

        private void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d8d1b9e67090a2af069eb266b9f93f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d8d1b9e67090a2af069eb266b9f93f");
                return;
            }
            a.this.c = null;
            if (z) {
                return;
            }
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.monitor.trace.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C1416a implements com.sankuai.xm.monitor.trace.rule.c {
        public static ChangeQuickRedirect a;

        public C1416a() {
        }

        @Override // com.sankuai.xm.monitor.trace.rule.c
        public final d a(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09860eeeb6febb9fb58292785f21dab9", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09860eeeb6febb9fb58292785f21dab9") : new com.sankuai.xm.monitor.trace.rule.a(gVar.o());
        }

        @Override // com.sankuai.xm.monitor.trace.rule.c
        public final com.sankuai.xm.monitor.trace.rule.b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07891b4a33e3f4027633680c62bb9ba1", 6917529027641081856L) ? (com.sankuai.xm.monitor.trace.rule.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07891b4a33e3f4027633680c62bb9ba1") : new com.sankuai.xm.monitor.trace.rule.b();
        }
    }
}
