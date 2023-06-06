package com.meituan.msc.modules.page.render;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.modules.container.n;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.page.render.rn.MSCFpsHornConfig;
import com.meituan.msc.modules.service.codecache.b;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msc.util.perf.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.modules.reporter.f {
    public static ChangeQuickRedirect d;
    public final WeakReference<d> e;
    public boolean f;
    public com.meituan.msc.devsupport.perf.a g;
    public final com.meituan.msc.modules.engine.h h;
    public n i;
    public long j;
    public com.meituan.msc.modules.reporter.memory.e k;
    public volatile boolean l;
    private boolean p;
    private boolean q;
    private Boolean r;
    private boolean s;
    private final String t;
    private final com.meituan.msc.modules.engine.j u;
    private b.a v;
    private int w;
    private int x;
    private int y;
    private String z;

    public static /* synthetic */ void a(a aVar, com.meituan.msc.common.report.d dVar) {
        d g;
        PerfEventRecorder perfEventRecorder;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e9c50bee60ca320d97790365d0ddfac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e9c50bee60ca320d97790365d0ddfac0");
        } else if (!MSCHornPerfConfig.d().e() && Double.compare(dVar.g, MSCHornPerfConfig.d().f()) >= 0 && (g = aVar.g()) != null && (perfEventRecorder = g.getPerfEventRecorder()) != null) {
            for (com.meituan.msc.util.perf.g gVar : perfEventRecorder.b()) {
                dVar.a(gVar.b + CommonConstant.Symbol.MINUS + gVar.c, Long.valueOf(gVar.h));
            }
        }
    }

    public static a a(com.meituan.msc.modules.engine.h hVar, p pVar, d dVar, String str, Boolean bool, boolean z, Map<String, String> map) {
        Object[] objArr = {hVar, pVar, dVar, str, bool, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5587fd684baa01880f3906e04cac8db8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5587fd684baa01880f3906e04cac8db8");
        }
        a aVar = new a(dVar, bool, str, pVar instanceof com.meituan.msc.modules.container.b ? ((com.meituan.msc.modules.container.b) pVar).N() : null, hVar);
        aVar.a("widget", Boolean.valueOf(z));
        if (map != null) {
            aVar.a("bizTagsForPage", map);
        }
        return aVar;
    }

    private a(d dVar, Boolean bool, String str, n nVar, com.meituan.msc.modules.engine.h hVar) {
        super(com.meituan.msc.modules.reporter.a.a(hVar, dVar, str, bool));
        Object[] objArr = {dVar, bool, str, nVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ec92451a7b99ebe3604303fea0d999", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ec92451a7b99ebe3604303fea0d999");
            return;
        }
        this.p = false;
        this.q = false;
        this.f = false;
        this.r = null;
        this.s = false;
        this.w = 0;
        this.x = 0;
        this.y = -1;
        this.l = false;
        this.t = str;
        this.r = bool;
        this.i = nVar;
        this.u = hVar != null ? hVar.p : null;
        this.e = new WeakReference<>(dVar);
        this.h = hVar;
        this.j = System.currentTimeMillis();
    }

    @Override // com.meituan.msc.modules.reporter.f, com.meituan.msc.common.report.a
    public final com.meituan.msc.common.report.d a(String str, boolean z) {
        String str2;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9b0f2c7f2f7130f718b9d40d64aa4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.report.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9b0f2c7f2f7130f718b9d40d64aa4f");
        }
        com.meituan.msc.common.report.d a = super.a(str, z).a("runtimePageCount", this.h != null ? Integer.valueOf(this.h.j) : "unknown").a("runtimeHistoryPageCount", this.h != null ? Integer.valueOf(this.h.k) : "unknown").a("checkUpdateMode", this.z);
        AppMetaInfoWrapper l = l();
        Object[] objArr2 = {l};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b073a73e921a93c68da879a281b9195", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b073a73e921a93c68da879a281b9195");
        } else if (this.t == null || l == null) {
            str2 = "unknown";
        } else {
            PackageInfoWrapper orCreateSubPackageWrapperByPath = l.getOrCreateSubPackageWrapperByPath(this.t);
            if (orCreateSubPackageWrapperByPath != null && !orCreateSubPackageWrapperByPath.isDownloadedBefore(this.j)) {
                str2 = "network";
            } else if (l.mainPackageCached == null || !l.mainPackageCached.isDownloadedBefore(this.j)) {
                str2 = "network";
            } else {
                str2 = (com.meituan.msc.modules.reporter.a.b(this.h) == null || !l.mainPackageCached.isDownloadedBefore(this.j)) ? "network" : "cache";
            }
        }
        return a.a("pkgMode", str2);
    }

    private d g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b1553786db5899f8e3c421850c075a", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b1553786db5899f8e3c421850c075a") : this.e.get();
    }

    public final void a(long j) {
        RenderPerf renderPerf;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b66b9dc22fe42f2b932c961d83ed1d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b66b9dc22fe42f2b932c961d83ed1d6");
            return;
        }
        this.j = j;
        if (!j()) {
            this.v = this.u.g.a();
            this.w = this.u.f;
        }
        d dVar = this.e.get();
        if ((dVar instanceof com.meituan.msc.modules.page.render.rn.g) && (renderPerf = ((com.meituan.msc.modules.page.render.rn.g) dVar).getRenderPerf()) != null) {
            renderPerf.a(this.j);
        }
        this.z = a(l());
        a("msc.page.create.count").b();
        if (this.i != null) {
            this.k = this.i.b();
        }
        if (this.k == null) {
            this.k = new com.meituan.msc.modules.reporter.memory.e();
        }
        this.k.a();
    }

    private long h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975016b4df3b741c5d39cfc858b6710e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975016b4df3b741c5d39cfc858b6710e")).longValue();
        }
        long j = this.u.i;
        if (j > this.j) {
            return j - this.j;
        }
        return 0L;
    }

    private String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0625007de81d8345c3e75389550d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0625007de81d8345c3e75389550d0f");
        }
        return TextUtils.join(CommonConstant.Symbol.COMMA, q.a(this.j, System.currentTimeMillis(), this.h));
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b91b8cb2e2aaad94495e52d5c88d39", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b91b8cb2e2aaad94495e52d5c88d39")).booleanValue() : this.r != null && this.r.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.render.a.b():void");
    }

    private String a(AppMetaInfoWrapper appMetaInfoWrapper) {
        Object[] objArr = {appMetaInfoWrapper};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f630edd01ca9b9c7bc4df3922affd2b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f630edd01ca9b9c7bc4df3922affd2b9") : appMetaInfoWrapper == null ? "unknown" : (appMetaInfoWrapper.isFromCache() || appMetaInfoWrapper.getLastUpdateTimeInMs() < this.j) ? "cache" : "network";
    }

    private Map<String, Long> a(Map<String, Long> map, double d2) {
        int i = 0;
        Object[] objArr = {map, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cc073b179e8c3e7229acbbb42b576b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cc073b179e8c3e7229acbbb42b576b");
        }
        HashMap hashMap = new HashMap();
        long j = this.j;
        Set<Map.Entry<String, Long>> entrySet = map.entrySet();
        String str = null;
        Iterator<Map.Entry<String, Long>> it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Long> next = it.next();
            if (i == entrySet.size() - 1) {
                str = next.getKey();
                break;
            } else if (next.getValue() != null) {
                hashMap.put(next.getKey(), Long.valueOf(next.getValue().longValue() - j));
                j = next.getValue().longValue();
                i++;
            }
        }
        hashMap.put(str, Long.valueOf((this.j + ((long) d2)) - j));
        return hashMap;
    }

    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b1f83d99239a872323e9bc5bb12ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b1f83d99239a872323e9bc5bb12ca8");
        } else if (this.s) {
        } else {
            this.s = true;
            a(false);
            a("msc.page.load.success.rate").a("errorMessage", exc != null ? exc.getMessage() : null).a(0.0d).c();
        }
    }

    public final void c() {
        byte b;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a75f19375608314d6e29c935f2c66b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a75f19375608314d6e29c935f2c66b6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e3bd0960718c1da7ccf6a4e5e062eb7", RobustBitConfig.DEFAULT_VALUE)) {
            b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e3bd0960718c1da7ccf6a4e5e062eb7")).booleanValue();
        } else {
            d dVar = this.e.get();
            if (dVar != null) {
                h o = dVar.o();
                if (!(o instanceof com.meituan.msc.modules.page.render.rn.f) || ((com.meituan.msc.modules.page.render.rn.f) o).getChildCount() > 0) {
                    b = 0;
                }
            }
            b = 1;
        }
        com.meituan.msc.common.report.d a = a("msc.page.exit.success.rate");
        Object[] objArr3 = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5ed9444f41336e94b6cd8b7ef4ce9de", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5ed9444f41336e94b6cd8b7ef4ce9de");
        } else if (!this.s) {
            str = "7000";
        } else if (b != 0) {
            str = "8001";
        } else if (this.q) {
            str = "4000";
        } else {
            str = this.p ? "unknown" : "0";
        }
        a.a("errorCode", str).a((this.s && !this.p && b == 0) ? 1.0d : 0.0d).c();
        com.meituan.msc.modules.reporter.memory.e eVar = this.k;
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.reporter.memory.e.a;
        if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "11e5df108736a8cf2e14cfc6c8bcf0cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "11e5df108736a8cf2e14cfc6c8bcf0cb");
        } else if (MSCHornRollbackConfig.l()) {
        } else {
            eVar.c();
            com.meituan.msc.common.support.java.util.concurrent.a<Integer> b2 = eVar.b.b();
            Object[] objArr5 = {eVar, this};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.reporter.memory.g.a;
            b2.a(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "16318018994563e479e0dcb00dc3418c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "16318018994563e479e0dcb00dc3418c") : new com.meituan.msc.modules.reporter.memory.g(eVar, this));
        }
    }

    @Override // com.meituan.msc.modules.reporter.f
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5475f172f2cb7b5984ab585acac8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5475f172f2cb7b5984ab585acac8d5");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.optBoolean("isFatal", true)) {
                a(true);
                a((Exception) null);
            }
            super.a(jSONObject);
        }
    }

    private void a(boolean z) {
        this.p = true;
        if (z) {
            this.q = true;
        }
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2259b72033f7ccb68b24d53cacd040c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2259b72033f7ccb68b24d53cacd040c5");
        } else {
            a((com.meituan.msc.common.report.d) null, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.meituan.msc.common.report.d dVar, Map<String, Object> map) {
        String str;
        LoadJSCodeCacheCallback.LoadStatus[] valuesCustom;
        Object[] objArr = {dVar, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17610232e2310cfae047deae956a8e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17610232e2310cfae047deae956a8e79");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.u.f - this.w;
            jSONObject.put("total", i);
            com.meituan.msc.modules.service.codecache.b bVar = this.u.g;
            b.a a = this.v != null ? bVar.a(this.v) : bVar.a();
            for (LoadJSCodeCacheCallback.LoadStatus loadStatus : LoadJSCodeCacheCallback.LoadStatus.valuesCustom()) {
                jSONObject.put(loadStatus.name(), a.a(loadStatus));
            }
            int a2 = a.a(LoadJSCodeCacheCallback.LoadStatus.loaded);
            str = a2 == 0 ? "none" : a2 == i ? "all" : "part";
        } catch (JSONException e) {
            com.meituan.msc.modules.reporter.g.a("MSCReporter", e);
            str = "unknown";
        }
        if (dVar != null) {
            dVar.a("codecache", jSONObject);
            dVar.a("codeCacheLevel", str);
        }
        if (map != null) {
            map.put("codecache", jSONObject);
            map.put("codeCacheLevel", str);
        }
    }

    public final void d() {
        MSCListView a;
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6025b042564410db2305e142cfa85eb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6025b042564410db2305e142cfa85eb6");
            return;
        }
        com.meituan.msc.devsupport.perf.a aVar = null;
        if (this.g != null) {
            aVar = this.g;
        } else {
            d g = g();
            if ((g instanceof com.meituan.msc.modules.page.render.rn.g) && (a = ((com.meituan.msc.modules.page.render.rn.g) g).a(g.o().b())) != null) {
                aVar = a.getMSCListPerfHelper();
            }
            this.g = aVar;
        }
        if (aVar == null) {
            return;
        }
        com.meituan.msc.modules.reporter.g.b("reportMSCListPerf");
        ArrayList arrayList = (ArrayList) PerfTrace.getOnlineEvents();
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.devsupport.perf.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f8d897da447d1e34ea2be6f616e0554b", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f8d897da447d1e34ea2be6f616e0554b");
        } else {
            hashMap = new HashMap<>();
            hashMap.put("load_total", Double.valueOf(aVar.a(arrayList, "list_load_total").b));
            hashMap.put("load_append", Double.valueOf(aVar.b(arrayList, "list_load_append").b));
            hashMap.put("load_slice", Double.valueOf(aVar.b(arrayList, "list_load_splice").b));
            hashMap.put("load_update", Double.valueOf(aVar.b(arrayList, "list_load_update").b));
            hashMap.put("load_remove", Double.valueOf(aVar.b(arrayList, "list_load_remove").b));
            hashMap.put("load_scrollToIndex", Double.valueOf(aVar.b(arrayList, "list_load_scrollToIndex").b));
            hashMap.put("load_expression", Double.valueOf(aVar.b(arrayList, "list_load_expression").b));
            hashMap.put("load_virtual_dom", Double.valueOf(aVar.b(arrayList, "list_load_virtual_dom").b));
            hashMap.put("load_new_cell", Double.valueOf(aVar.b(arrayList, "list_bind_cell").b + aVar.b(PerfTrace.getOnlineEvents(), "list_create_cell").b));
            hashMap.put("load_shadow", Double.valueOf(aVar.b(arrayList, "list_create_shadow_node").b));
            hashMap.put("load_cascade", Double.valueOf(aVar.b(arrayList, "cascade").b + aVar.b(arrayList, "updateStyleProperties").b));
            hashMap.put("load_layout", Double.valueOf(aVar.b(arrayList, "layout").b));
        }
        double doubleValue = ((Double) hashMap.get("load_total")).doubleValue();
        Object[] objArr3 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.devsupport.perf.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "15b40e2352ad3dc00217c778f8786211", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap2 = (Map) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "15b40e2352ad3dc00217c778f8786211");
        } else {
            hashMap2 = new HashMap<>();
            hashMap2.put("slide_cell", aVar.c(arrayList, "list_bind_cell").a());
            hashMap2.put("slide_reuse_cell", aVar.a((List<l>) arrayList, "list_bind_cell", true).a());
            hashMap2.put("slide_reuse_virtual_dom", aVar.a((List<l>) arrayList, "list_diff_virtual_dom", true).a());
            hashMap2.put("slide_reuse_shadow", aVar.a((List<l>) arrayList, "list_create_shadow_node", true).a());
            hashMap2.put("slide_reuse_cascade", aVar.a((List<l>) arrayList, Arrays.asList("cascade", "updateStyleProperties"), true).a());
            hashMap2.put("slide_reuse_layout", aVar.a((List<l>) arrayList, "layout", true).a());
            hashMap2.put("slide_new_cell", aVar.a((List<l>) arrayList, "list_bind_cell", false).a());
            hashMap2.put("slide_new_virtual_dom", aVar.a((List<l>) arrayList, "list_diff_virtual_dom", false).a());
            hashMap2.put("slide_new_shadow", aVar.a((List<l>) arrayList, "list_create_shadow_node", false).a());
            hashMap2.put("slide_new_cascade", aVar.a((List<l>) arrayList, Arrays.asList("cascade", "updateStyleProperties"), false).a());
            hashMap2.put("slide_new_layout", aVar.a((List<l>) arrayList, "layout", false).a());
        }
        double doubleValue2 = ((Double) ((Map) hashMap2.get("slide_cell")).get("avg")).doubleValue();
        b("msc.msclist.performance.firstLoad").a(doubleValue).a(hashMap).b();
        b("msc.msclist.performance.slide").a(doubleValue2).a(hashMap2).b();
        b("msc.msclist.performance.reuseRatio.cell").a(aVar.a(arrayList)).b();
        b("msc.msclist.performance.reuseRatio.view").a(aVar.a()).b();
        b("msc.msclist.performance.reuseRatio.shadow").a(aVar.a()).b();
        b("msc.msclist.performance.mvSpeed.touch").a(aVar.b()).b();
        b("msc.msclist.performance.mvSpeed.fly").a(aVar.c()).b();
        HashMap hashMap3 = new HashMap();
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        hashMap3.put("slide_cell_reuse_ratio", Double.valueOf(aVar.a(arrayList)));
        hashMap3.put("slide_view_reuse_ratio", Double.valueOf(aVar.a()));
        hashMap3.put("slide_shadow_reuse_ratio", Double.valueOf(aVar.a()));
        hashMap3.put("slide_mv_finger_speed", Double.valueOf(aVar.b()));
        hashMap3.put("slide_mv_decelerate_speed", Double.valueOf(aVar.c()));
        l instant = PerfTrace.instant("MSC-List-Perf-Summary");
        JSONObject jSONObject = new JSONObject(hashMap3);
        if (instant.c) {
            instant.b.j = jSONObject;
        }
    }

    private void a(String str, boolean z, ArrayList<String> arrayList) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b547a189511d93c8f6cb9902deb096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b547a189511d93c8f6cb9902deb096");
        } else if (this.x >= MSCFpsHornConfig.d().h()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(SnifferDBHelper.COLUMN_LOG, arrayList);
            hashMap.put("isScroll", Boolean.valueOf(z));
            b(str).a(hashMap).b();
            this.x++;
        }
    }

    public final void a(boolean z, ArrayList<String> arrayList) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11aad8d42786fe48c61ca3d2b0e4437b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11aad8d42786fe48c61ca3d2b0e4437b");
        } else {
            a("msc.page.performance.anr", z, arrayList);
        }
    }

    public final void b(boolean z, ArrayList<String> arrayList) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a026d14459efffa6e49a3b25c6442eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a026d14459efffa6e49a3b25c6442eb");
        } else {
            a("msc.page.performance.jsanr", z, arrayList);
        }
    }

    public final void c(boolean z, ArrayList<String> arrayList) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), arrayList};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "127ddef6da0912d0e198a85f43886b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "127ddef6da0912d0e198a85f43886b76");
        } else {
            a("msc.page.performance.shadowanr", z, arrayList);
        }
    }

    public final void a(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0bbfbc6ab6d3fb01b14177c00ab8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0bbfbc6ab6d3fb01b14177c00ab8cc");
            return;
        }
        if (Double.compare(d2, 0.0d) > 0) {
            b("msc.page.performance.fps").a(d2).b();
        }
        if (Double.compare(d3, 0.0d) > 0) {
            b("msc.page.performance.scrollfps").a(d3).b();
        }
    }

    public final void b(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556b688509afeb046b14b371c1d7db23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556b688509afeb046b14b371c1d7db23");
            return;
        }
        if (Double.compare(d2, 0.0d) > 0) {
            b("msc.page.performance.jsfps").a(d2).b();
        }
        if (Double.compare(d3, 0.0d) > 0) {
            b("msc.page.performance.jsscrollfps").a(d3).b();
        }
    }

    public final void c(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0887b44bb8eaa5098762024f6dbf0321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0887b44bb8eaa5098762024f6dbf0321");
            return;
        }
        if (Double.compare(d2, 0.0d) > 0) {
            b("msc.page.performance.shadowfps").a(d2).b();
        }
        if (Double.compare(d3, 0.0d) > 0) {
            b("msc.page.performance.shadowscrollfps").a(d3).b();
        }
    }

    @NonNull
    public final Map<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4dbc19b4c842096faf6869cfa4a485a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4dbc19b4c842096faf6869cfa4a485a");
        }
        long currentTimeMillis = System.currentTimeMillis();
        PerfTrace.begin("getFFPTags");
        k();
        Map<String, Object> map = a("FFP").d;
        map.remove("pagePath");
        map.put("preloadDuration", Long.valueOf(h()));
        map.put("isPendingPreloadBiz", Boolean.valueOf(this.h.I));
        map.put("otherPreloadAppId", i());
        map.put("runtimeStateBeforeLaunch", this.h.H);
        AtomicLong atomicLong = NativeViewHierarchyManager.f;
        if (atomicLong.get() > 0) {
            map.put("createViewCount", atomicLong);
        }
        AtomicLong atomicLong2 = com.meituan.msc.uimanager.j.b;
        if (atomicLong2.get() > 0) {
            map.put("createShadowNodeCount", atomicLong2);
        }
        if (this.h.J) {
            map.put("hasRListAtCurrentPage", atomicLong2);
        }
        b(map);
        a(map);
        a(map, currentTimeMillis);
        PerfTrace.end("getFFPTags");
        return map;
    }

    private void b(Map<String, Object> map) {
        com.meituan.msc.modules.engine.requestPrefetch.h hVar;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2266673c5b15bd98213b1c170a8c004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2266673c5b15bd98213b1c170a8c004");
            return;
        }
        com.meituan.msc.modules.engine.requestPrefetch.f fVar = this.h.h;
        if (fVar == null || (hVar = fVar.c) == null) {
            return;
        }
        map.put("triggerPrefetchDataScene", hVar.e);
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724d8178d05a6d04e6a1229cc013c705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724d8178d05a6d04e6a1229cc013c705");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.l = true;
        PerfTrace.online().b("list_load_total");
        PerfTrace.begin("flushJsPerfEvents");
        com.meituan.msc.modules.api.report.b bVar = (com.meituan.msc.modules.api.report.b) this.h.c(com.meituan.msc.modules.api.report.b.class);
        if (bVar != null) {
            bVar.c();
        } else {
            com.meituan.msc.modules.reporter.g.d("MSCReporter", "metricsModule is null");
        }
        PerfTrace.end("flushJsPerfEvents");
        com.meituan.msc.common.executor.a.a(c.a(this, currentTimeMillis));
        this.k.b();
    }

    public static /* synthetic */ void a(a aVar, long j) {
        Object[] objArr = {aVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c078ac92cfc0e5b2dea3d17424be962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c078ac92cfc0e5b2dea3d17424be962");
            return;
        }
        com.meituan.msc.modules.reporter.preformance.c cVar = aVar.h.G;
        String str = aVar.t;
        long j2 = aVar.j;
        Object[] objArr2 = {str, new Long(j2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.reporter.preformance.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4a9b8be947cc6f4ffdf32ba1e7281c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4a9b8be947cc6f4ffdf32ba1e7281c10");
        } else {
            cVar.a(new com.meituan.msc.modules.reporter.preformance.b().a("mt").b("fsp2").d(str).a(j2).b(j));
        }
        aVar.d();
        d g = aVar.g();
        if (g instanceof com.meituan.msc.modules.page.render.rn.g) {
            ((com.meituan.msc.modules.page.render.rn.g) g).getRenderPerf().b(j);
        }
    }

    private void a(Map<String, Object> map, long j) {
        Object[] objArr = {map, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb30375d4807aeba7643c2dc6baccc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb30375d4807aeba7643c2dc6baccc7");
            return;
        }
        com.meituan.msc.util.perf.analyze.b bVar = new com.meituan.msc.util.perf.analyze.b(PerfTrace.getOnlineEvents());
        com.meituan.msc.util.perf.analyze.b a = bVar.a(this.j);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.j + this.y;
        long a2 = a.a("list_load_total", a.b("list_load_total"), true);
        long a3 = a.a("list_load_append", a2);
        long a4 = bVar.a("request_prefetch", currentTimeMillis, true);
        long b = a.b("request_prefetch");
        long a5 = a.a("getBackgroundFetchData");
        long b2 = a.b("getBackgroundFetchData");
        long b3 = a.b("SignInterceptorBefore") - a.a("SignInterceptorBefore");
        long b4 = a.b("SignInterceptorAfter") - a.a("SignInterceptorAfter");
        map.put("FP", Integer.valueOf(this.y));
        map.put("routeToPrefetch", Long.valueOf(a4 - this.j));
        map.put("prefetchRequest", Long.valueOf(b - a4));
        map.put("FPToPrefetchEnd", Long.valueOf(b - j2));
        map.put("getBackgroundFetchDataGap", Long.valueOf(b2 - b));
        map.put("FPToCreateList", Long.valueOf(a2 - j2));
        map.put("listFirstLoad", Long.valueOf(a3 - a2));
        map.put("listFirstLoadToFFP", Long.valueOf(currentTimeMillis - a3));
        map.put("signInterceptorBefore", Long.valueOf(b3));
        map.put("signInterceptorAfter", Long.valueOf(b4));
        map.put("siuaHandle", Long.valueOf(a.b("SiuaHandle") - a.a("SiuaHandle")));
        map.put("pageStartTime", Long.valueOf(this.j));
        map.put("prefetchStartTime", Long.valueOf(a4));
        map.put("prefetchNetworkStartTime", Long.valueOf(a.a("request_prefetch_network")));
        map.put("prefetchGetBusinessBodyStartTime", Long.valueOf(a.a("request_prefetch_getBusinessBodyParams")));
        map.put("prefetchGetBusinessUrlStartTime", Long.valueOf(a.a("request_prefetch_getBusinessURlParams")));
        map.put("prefetchGetBusinessUrlEndTime", Long.valueOf(a.b("request_prefetch_getBusinessURlParams")));
        map.put("fpTime", Long.valueOf(j2));
        map.put("prefetchEndTime", Long.valueOf(b));
        map.put("getBackgroundFetchDataStartTime", Long.valueOf(a5));
        map.put("getBackgroundFetchDataEndTime", Long.valueOf(b2));
        map.put("createListTime", Long.valueOf(a2));
        map.put("listFirstLoadTime", Long.valueOf(a3));
        map.put("getFFPTagsSpend", Long.valueOf(System.currentTimeMillis() - j));
    }

    private AppMetaInfoWrapper l() {
        com.meituan.msc.modules.update.f fVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b21025221ed783f5a8354b3ffbe4dd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppMetaInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b21025221ed783f5a8354b3ffbe4dd7");
        }
        if (this.h == null || (fVar = this.h.r) == null) {
            return null;
        }
        return fVar.h;
    }
}
