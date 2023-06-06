package com.meituan.msc.modules.api.report;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.metrics.Metrics;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.engine.j;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.page.render.d;
import com.meituan.msc.modules.reporter.o;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msc.util.perf.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "MetricsModule")
/* loaded from: classes3.dex */
public class b extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod
    public void reportPerfEvent(String str, String str2, long j, JSONObject jSONObject) {
        Object[] objArr = {str, str2, new Long(j), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a408089e9bba8d9e4e34d66433142a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a408089e9bba8d9e4e34d66433142a73");
            return;
        }
        g gVar = new g(str, str2, j);
        gVar.j = jSONObject;
        PerfTrace.addJsPerfEvent(gVar);
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f576fda2ab1abd325ffdc15aa13c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f576fda2ab1abd325ffdc15aa13c8f");
        } else {
            c(U_());
        }
    }

    private static void c(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "279b5f897b505b254daa165c50ad38d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "279b5f897b505b254daa165c50ad38d3");
            return;
        }
        e c = hVar.c();
        if (c == null) {
            o.a("reportTopPagePerfEvents", "topPage is null");
            return;
        }
        d n = c.n();
        if (n == null) {
            o.a("reportTopPagePerfEvents", "renderer is null");
            return;
        }
        com.meituan.msc.modules.page.render.a aVar = n.k.j;
        if (!aVar.l) {
            o.a("reportTopPagePerfEvents", "ffpEndTriggered is false");
            return;
        }
        aVar.l = false;
        PerfTrace.reportCurrentPageEvents(n.getPerfEventRecorder(), new com.meituan.msc.common.perf.a(aVar));
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93e418c7842b50082bc8e9c2999f5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93e418c7842b50082bc8e9c2999f5af");
            return;
        }
        o.a("flushPerfEvents", new Object[0]);
        ((JSDeviceEventEmitter) U_().a(JSDeviceEventEmitter.class)).emit("flushPerfEvents", null);
    }

    @MSCMethod
    public void batchReportPerfEvent(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe6ed3a24f03e4fe71233fc38027585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe6ed3a24f03e4fe71233fc38027585");
            return;
        }
        o.a("batchReportPerfEvent", new Object[0]);
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                String string2 = jSONObject.getString("phase");
                long j = jSONObject.getLong(DeviceInfo.TM);
                JSONObject optJSONObject = jSONObject.optJSONObject("extra");
                g gVar = new g(string, string2, j);
                gVar.j = optJSONObject;
                PerfTrace.addJsPerfEvent(gVar);
            } catch (JSONException e) {
                com.meituan.msc.modules.reporter.g.a("batchReportPerfEvent", e);
                return;
            } finally {
                d();
            }
        }
    }

    @MSCMethod
    public void reportMetrics(String str, String str2, long j, JSONObject jSONObject) {
        com.meituan.msc.modules.devtools.d dVar;
        Object[] objArr = {str, str2, new Long(j), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a2d571bf5b0ad97a11cd79a8c4bf989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a2d571bf5b0ad97a11cd79a8c4bf989");
        } else if (TextUtils.isEmpty(str2) || str2.startsWith("mmp.")) {
        } else {
            U_().p.b(str2).a(ab.a(jSONObject)).a(j).c();
            Object[] objArr2 = {str2, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1de1b0dea8b96e78c97004ed7600dcc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1de1b0dea8b96e78c97004ed7600dcc4");
            } else if (MSCEnvHelper.getEnvInfo().isProdEnv() || (dVar = (com.meituan.msc.modules.devtools.d) U_().d(com.meituan.msc.modules.devtools.d.class)) == null || !dVar.a()) {
            } else {
                TextUtils.equals(str2, "msc.fe.page.scroll.fps");
            }
        }
    }

    @MSCMethod
    public void reportBatchMetrics(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e18df870f761506c98466079ba069b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e18df870f761506c98466079ba069b8");
            return;
        }
        j jVar = U_().p;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("type");
                if (!TextUtils.isEmpty(optString) && !optString.startsWith("mmp.")) {
                    arrayList.add(jVar.b(optString).a(ab.a(optJSONObject.optJSONObject("tags"))).a(optJSONObject.optLong("value")));
                }
            }
        }
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.common.report.a.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "d5ea084233252191b16825e0ad82be72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "d5ea084233252191b16825e0ad82be72");
        } else {
            jVar.a((List<com.meituan.msc.common.report.d>) arrayList, true);
        }
    }

    @Deprecated
    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78d6a740dcf5eabb29c849683ab21a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78d6a740dcf5eabb29c849683ab21a71");
        } else {
            com.meituan.msc.modules.reporter.g.b(Metrics.TAG, str, "\t", "\t", map);
        }
    }
}
