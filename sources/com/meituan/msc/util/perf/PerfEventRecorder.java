package com.meituan.msc.util.perf;

import com.meituan.msc.modules.reporter.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PerfEventRecorder {
    public static ChangeQuickRedirect a;
    public String b;
    private final Object c;
    private final ArrayList<g> d;
    private final boolean e;

    public PerfEventRecorder() {
        this(true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b55772f317368b1e99afbfb1837b84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b55772f317368b1e99afbfb1837b84");
        }
    }

    public PerfEventRecorder(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae5c4b9a70f47107208ac3146f72e8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae5c4b9a70f47107208ac3146f72e8c");
            return;
        }
        this.c = new Object();
        this.d = new ArrayList<>(500);
        this.e = z;
        this.b = UUID.randomUUID().toString();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7319be0e46ebd29d95876b7ddad15e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7319be0e46ebd29d95876b7ddad15e8");
            return;
        }
        synchronized (this.c) {
            this.d.clear();
        }
    }

    public final List<g> b() {
        List<g> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0e2ae659a8667c951cfc820ae6194c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0e2ae659a8667c951cfc820ae6194c");
        }
        synchronized (this.c) {
            list = (List) this.d.clone();
        }
        return list;
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0047edbc814438a66f0c93c8cc850edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0047edbc814438a66f0c93c8cc850edc");
            return;
        }
        List<g> b = b();
        ArrayList arrayList = new ArrayList(b.size());
        for (g gVar : b) {
            gVar.k = this.b;
            if (!gVar.m) {
                arrayList.add(gVar);
                gVar.m = true;
            }
        }
        if (cVar != null) {
            for (e eVar : a(arrayList)) {
                Object[] objArr2 = {cVar, eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "228f169bca2fa7ac48f52d11e6d82ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "228f169bca2fa7ac48f52d11e6d82ee1");
                } else {
                    cVar.a(eVar);
                }
            }
        }
    }

    private static List<e> a(List<g> list) {
        g a2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea055c51f8028b0a3b73eac0844d4a79", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea055c51f8028b0a3b73eac0844d4a79");
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (g gVar : list) {
            if (gVar.l) {
                if ("i".equals(gVar.c)) {
                    arrayList.add(new d(gVar));
                } else if ("X".equals(gVar.c)) {
                    arrayList.add(new b(gVar));
                } else if ("E".equals(gVar.c) && (a2 = a(list, gVar)) != null) {
                    arrayList.add(new a(a2, gVar));
                }
            }
        }
        return arrayList;
    }

    private static g a(List<g> list, g gVar) {
        Object[] objArr = {list, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ade1e6f33420175644525acc9889b943", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ade1e6f33420175644525acc9889b943");
        }
        for (g gVar2 : list) {
            if (gVar2.b.equals(gVar.b) && ErrorCode.ERROR_TYPE_B.equals(gVar2.c)) {
                return gVar2;
            }
        }
        return null;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cff6cd18593c800a34f1a8bff89949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cff6cd18593c800a34f1a8bff89949");
        } else {
            a(str, (ConcurrentHashMap<String, Object>) null);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c3fcebc4be434361580c29d6d20f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c3fcebc4be434361580c29d6d20f0a");
        } else {
            b(str, null);
        }
    }

    public final void a(String str, ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object[] objArr = {str, concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf83e8f32ba306d2a7ed4d18106b7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf83e8f32ba306d2a7ed4d18106b7c1");
            return;
        }
        n.b();
        g gVar = new g(str, ErrorCode.ERROR_TYPE_B);
        if (concurrentHashMap != null) {
            gVar.j = new JSONObject(concurrentHashMap);
        }
        a(gVar);
    }

    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda52f0a063991dc7d8c2f26d3916693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda52f0a063991dc7d8c2f26d3916693");
            return;
        }
        synchronized (this.c) {
            this.d.add(gVar);
        }
    }

    public final void b(String str, ConcurrentHashMap<String, Object> concurrentHashMap) {
        Object[] objArr = {str, concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e259b40d8e1730671754a882cec604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e259b40d8e1730671754a882cec604");
            return;
        }
        g gVar = new g(str, "E");
        if (concurrentHashMap != null) {
            gVar.j = new JSONObject(concurrentHashMap);
        }
        a(gVar);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b4416ed74f75a71628e4a570ea5781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b4416ed74f75a71628e4a570ea5781");
        } else {
            a(str, (Map<String, Object>) null);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f066dc9e00dd9949f6ab4be5634013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f066dc9e00dd9949f6ab4be5634013");
            return;
        }
        g gVar = new g(str, "i");
        if (map != null) {
            gVar.j = new JSONObject(map);
        }
        a(gVar);
    }

    public final void a(String str, long j, long j2, Map<String, Object> map, boolean z) {
        Object[] objArr = {str, new Long(j), new Long(j2), map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "730478168816a929a9ec84fdd4a301d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "730478168816a929a9ec84fdd4a301d8");
            return;
        }
        g b = new g(str, "X", j2).b(j);
        if (map != null) {
            b.j = new JSONObject(map);
        }
        b.l = z;
        a(b);
    }
}
