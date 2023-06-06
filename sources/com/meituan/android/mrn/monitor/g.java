package com.meituan.android.mrn.monitor;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.mrn.config.n;
import com.meituan.android.mrn.engine.t;
import com.meituan.android.mrn.utils.FsRenderTimeBean;
import com.meituan.android.mrn.utils.p;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class g {
    public static ChangeQuickRedirect a = null;
    public static final String b = "com.meituan.android.mrn.monitor.g";
    private static Context e;
    private static JSONArray g;
    public Map<String, String> c;
    public String d;
    private com.meituan.android.mrn.config.e f;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7826ce5e3cf9a5231e959ebba0ed353", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7826ce5e3cf9a5231e959ebba0ed353");
            return;
        }
        this.c = new HashMap();
        this.f = com.meituan.android.mrn.config.c.a();
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14d318f5d6508d114ea3fd5e2c296769", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14d318f5d6508d114ea3fd5e2c296769") : new g();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f0802232d4ff523f87b197d8654a43b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f0802232d4ff523f87b197d8654a43b");
            return;
        }
        e = context.getApplicationContext();
        m.a(context);
    }

    public final void a(Float f, String str, String str2, String str3) {
        Object[] objArr = {f, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cea5eb104a138b82c54a29e9e190bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cea5eb104a138b82c54a29e9e190bf3");
        } else if (f == null || f.floatValue() <= 0.0f) {
        } else {
            b(str2).c(str2).d(str3).a("component_name", str).b("MRNJSFps", f.floatValue());
        }
    }

    public final void b(Float f, String str, String str2, String str3) {
        Object[] objArr = {f, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1fcfe91f316e444a4f71946c00139d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1fcfe91f316e444a4f71946c00139d");
        } else if (f == null || f.floatValue() <= 0.0f) {
        } else {
            b(str2).c(str2).d(str3).a("component_name", str).b("MRNJSScrollFps", f.floatValue());
        }
    }

    public final void c(Float f, String str, String str2, String str3) {
        Object[] objArr = {f, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccaa7177d729839ffc61dc7d11f4b957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccaa7177d729839ffc61dc7d11f4b957");
        } else if (f == null || f.floatValue() <= 0.0f) {
        } else {
            b(str2).c(str2).d(str3).a("component_name", str).b("MRNFps", f.floatValue());
            n a2 = n.a();
            if (a2.c() && a2.a(str2)) {
                com.facebook.common.logging.a.a(b, "指标名: %s, 值: %s, 维度: %s, Extra: %s", "MRNLFps", f, com.meituan.android.mrn.utils.g.a((Object) this.c), this.d);
                b(str2).c(str2).d(str3).a("component_name", str).b("MRNLFps", f.floatValue());
            }
        }
    }

    public final void d(Float f, String str, String str2, String str3) {
        Object[] objArr = {f, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69853d3a7217e1649102f002b7ccd24a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69853d3a7217e1649102f002b7ccd24a");
        } else if (f == null || f.floatValue() <= 0.0f) {
        } else {
            b(str2).c(str2).d(str3).a("component_name", str).b("MRNScrollFps", f.floatValue());
        }
    }

    public final void a(String str, String str2, int i, boolean z) {
        Object[] objArr = {str, str2, Integer.valueOf(i), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691ed7e5bf672685867fcaf892176eb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691ed7e5bf672685867fcaf892176eb0");
        } else {
            a(str, str2, i, true, "onAPI");
        }
    }

    public final void a(String str, String str2, int i, boolean z, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdb4b053828e01c9b4d75864c03a951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdb4b053828e01c9b4d75864c03a951");
        } else {
            c(str).d(str2).a("reason_code", String.valueOf(i)).a("type", str3).b("MRNBundleDeleted", z ? 1.0f : 0.0f);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc360a80c7167fc6959ad3dab5f670d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc360a80c7167fc6959ad3dab5f670d");
        } else {
            b(DiagnoseLog.TASK_MRN_BUNDLE_DOWNLOAD, z ? 1.0f : 0.0f);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2c9f65a3474c8bd7abd9cd638c01d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2c9f65a3474c8bd7abd9cd638c01d0");
        } else {
            b("MRNBundlePatch", z ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00954342339b385e23c6ec6560db2491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00954342339b385e23c6ec6560db2491");
            return;
        }
        try {
            b("MRNBundleLoad", 1.0f);
        } catch (Exception e2) {
            com.facebook.common.logging.a.d(b, e2.getMessage(), e2);
        }
    }

    public final void a(FsRenderTimeBean fsRenderTimeBean) {
        Object[] objArr = {fsRenderTimeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fef8ed69afb03ef21e085cb01dd0c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fef8ed69afb03ef21e085cb01dd0c4");
            return;
        }
        try {
            if (fsRenderTimeBean.fsRenderTime == 0 && fsRenderTimeBean.interactionTime == 0) {
                fsRenderTimeBean.setStatusCode(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
            }
            if (fsRenderTimeBean.fsRenderTime > 0 && fsRenderTimeBean.fsRenderTime <= fsRenderTimeBean.fCPTime) {
                fsRenderTimeBean.setStatusCode(101);
            }
            long j = fsRenderTimeBean.fsRenderTime;
            fsRenderTimeBean.fmpByWhat = fsRenderTimeBean.triggerByNoEngine ? 3 : 0;
            int i = 4;
            if (fsRenderTimeBean.fsRenderTime == 0 && fsRenderTimeBean.interactionTime > 0) {
                j = fsRenderTimeBean.interactionTime;
                fsRenderTimeBean.fmpByWhat = fsRenderTimeBean.triggerByNoEngine ? 4 : 1;
                fsRenderTimeBean.setStatusCode(fsRenderTimeBean.interactionTime > fsRenderTimeBean.fCPTime ? 103 : 105);
            }
            if (j > fsRenderTimeBean.interactionTime && fsRenderTimeBean.interactionTime > 0) {
                j = fsRenderTimeBean.interactionTime;
                if (!fsRenderTimeBean.triggerByNoEngine) {
                    i = 2;
                }
                fsRenderTimeBean.fmpByWhat = i;
                fsRenderTimeBean.setStatusCode(fsRenderTimeBean.interactionTime > fsRenderTimeBean.fCPTime ? 104 : 105);
            }
            fsRenderTimeBean.fsRenderTime = j;
            if (fsRenderTimeBean.fsRenderTime > 0 && fsRenderTimeBean.fsRenderTime > fsRenderTimeBean.startTime) {
                new g().a(fsRenderTimeBean, "MRNFSTime", (float) (fsRenderTimeBean.fsRenderTime - fsRenderTimeBean.startTime));
                fsRenderTimeBean.rate = fsRenderTimeBean.fsRenderTime - fsRenderTimeBean.startTime <= 1000 ? 1.0f : 0.0f;
                new g().a(fsRenderTimeBean, "MRNFSRate", fsRenderTimeBean.rate);
                Map<String, Object> d = d();
                d.put("bundle_name", fsRenderTimeBean.bundleName);
                d.put("component_name", fsRenderTimeBean.componentName);
                d.put("bundle_version", fsRenderTimeBean.bundleVersion);
                d.put("success", Integer.valueOf((int) fsRenderTimeBean.rate));
                Babel.logRT(new Log.Builder("").tag("FSTime").optional(d).reportChannel("prism-report-mrn").value(fsRenderTimeBean.fsRenderTime - fsRenderTimeBean.startTime).lv4LocalStatus(true).build());
            } else {
                fsRenderTimeBean.setStatusCode(301);
            }
            b(fsRenderTimeBean);
            if (fsRenderTimeBean.interactionTime > 0 && fsRenderTimeBean.interactionTime > fsRenderTimeBean.startTime) {
                new g().a(fsRenderTimeBean, "MRNFSInteractionTime", (float) (fsRenderTimeBean.interactionTime - fsRenderTimeBean.startTime));
            }
            if (fsRenderTimeBean.customTime > 0 && fsRenderTimeBean.customTime > fsRenderTimeBean.startTime) {
                new g().a(fsRenderTimeBean, "MRNFSCustomTime", (float) (fsRenderTimeBean.customTime - fsRenderTimeBean.startTime));
            }
        } catch (Exception e2) {
            p.a("[MRNDashboard@sendFsRenderTime]", e2, new Object[0]);
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("fetch_bridge_type", Integer.valueOf(fsRenderTimeBean.fetch_bridge_type));
            hashMap.put("bundle_name", fsRenderTimeBean.bundleName);
            hashMap.put("bundle_version", fsRenderTimeBean.bundleVersion);
            StringBuilder sb = new StringBuilder();
            sb.append(fsRenderTimeBean.bundleName);
            sb.append("&");
            sb.append(fsRenderTimeBean.componentName);
            System.currentTimeMillis();
        } catch (Exception unused) {
        }
    }

    private void a(FsRenderTimeBean fsRenderTimeBean, String str, float f) {
        Object[] objArr = {fsRenderTimeBean, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707fd14fe348ecb582e41c3041ffcae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707fd14fe348ecb582e41c3041ffcae1");
        } else if (fsRenderTimeBean == null) {
        } else {
            b(fsRenderTimeBean.bundleName).c(fsRenderTimeBean.bundleName).d(fsRenderTimeBean.bundleVersion).a("is_code_cache", t.a(fsRenderTimeBean.bundleName, fsRenderTimeBean.bundleVersion)).a("component_name", fsRenderTimeBean.componentName);
            a(this, fsRenderTimeBean).a(str, Collections.singletonList(Float.valueOf(f))).a();
        }
    }

    private void b(FsRenderTimeBean fsRenderTimeBean) {
        Object[] objArr = {fsRenderTimeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a630e8956570925420290d4c44b835f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a630e8956570925420290d4c44b835f4");
            return;
        }
        try {
            g gVar = new g();
            StringBuilder sb = new StringBuilder();
            sb.append(fsRenderTimeBean.getStatusCode());
            gVar.a("FSStatusCode", sb.toString()).a(fsRenderTimeBean, "MRNFSRenderException", fsRenderTimeBean.isStatusCodeException);
        } catch (Exception e2) {
            p.a("[MRNDashboard@sendStatusCode]", e2, new Object[0]);
        }
    }

    private com.dianping.monitor.impl.l a(g gVar, FsRenderTimeBean fsRenderTimeBean) {
        Object[] objArr = {gVar, fsRenderTimeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4721379e3005427830df44f84f5bb6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.impl.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4721379e3005427830df44f84f5bb6b");
        }
        com.dianping.monitor.impl.m c = gVar.c();
        HashMap hashMap = new HashMap(fsRenderTimeBean.customTags);
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                c.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        HashMap hashMap2 = new HashMap(fsRenderTimeBean.customEvents);
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                c.a((String) entry2.getKey(), Float.toString(((Long) entry2.getValue()).longValue() - fsRenderTimeBean.startTime >= 0 ? (float) (((Long) entry2.getValue()).longValue() - fsRenderTimeBean.startTime) : 0.0f));
            }
        }
        com.dianping.monitor.impl.l a2 = c.a("BundleDidDownload", Float.toString(fsRenderTimeBean.bundleDidDownloadTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.bundleDidDownloadTime - fsRenderTimeBean.startTime) : 0.0f)).a("JSEngineDidInit", Float.toString(fsRenderTimeBean.jSEngineDidInitTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.jSEngineDidInitTime - fsRenderTimeBean.startTime) : 0.0f)).a("BundleDidLoad", Float.toString(fsRenderTimeBean.bundleDidLoadTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.bundleDidLoadTime - fsRenderTimeBean.startTime) : 0.0f)).a("RenderStart", Float.toString(fsRenderTimeBean.renderStartTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.renderStartTime - fsRenderTimeBean.startTime) : 0.0f)).a("FCPTime", Float.toString(fsRenderTimeBean.fCPTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.fCPTime - fsRenderTimeBean.startTime) : 0.0f)).a("MRNFSTime", Float.toString(fsRenderTimeBean.fsRenderTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.fsRenderTime - fsRenderTimeBean.startTime) : 0.0f)).a("InteractionTime", Float.toString(fsRenderTimeBean.interactionTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.interactionTime - fsRenderTimeBean.startTime) : 0.0f)).a("CustomTime", Float.toString(fsRenderTimeBean.customTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.customTime - fsRenderTimeBean.startTime) : 0.0f)).a("locatedCityName", c(e));
        StringBuilder sb = new StringBuilder();
        sb.append(fsRenderTimeBean.fmpTreeNode);
        com.dianping.monitor.impl.l a3 = a2.a("FMP_NODE_COUNT", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fsRenderTimeBean.interactionTimeTreeNode);
        com.dianping.monitor.impl.l a4 = a3.a("INTERACTION_NODE_COUNT", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(fsRenderTimeBean.fmpByWhat);
        return a4.a("FMP_BY_WHAT", sb3.toString()).a("fetch_bridge_type", String.valueOf(fsRenderTimeBean.fetch_bridge_type)).a("FirstNetworkTime", Float.toString(fsRenderTimeBean.firstNetworkTime - fsRenderTimeBean.startTime >= 0 ? (float) (fsRenderTimeBean.firstNetworkTime - fsRenderTimeBean.startTime) : 0.0f)).a("is_remote", String.valueOf(fsRenderTimeBean.isRemote)).a("router_path", fsRenderTimeBean.routerPath);
    }

    public final g a(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1caec29fb4d3df14522276770cae0559", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1caec29fb4d3df14522276770cae0559") : eVar != null ? a("bundle_name", eVar.c).b(eVar.c).a("bundle_version", eVar.f) : this;
    }

    public final g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24139efea9f36e1ee0b9e3f3b9bf20cb", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24139efea9f36e1ee0b9e3f3b9bf20cb") : a("biz", str);
    }

    public final g b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c45aec465c0faa7b34ad7ec0d0305710", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c45aec465c0faa7b34ad7ec0d0305710") : a("biz", e(str));
    }

    public final g c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5ea678f9303fe278900fde6b636cf7", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5ea678f9303fe278900fde6b636cf7") : a("bundle_name", str);
    }

    public final g d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f8b423b22a663768eceff587fd9026e", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f8b423b22a663768eceff587fd9026e") : a("bundle_version", str);
    }

    public final g a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e36d03f3e3a10536afad125f4326a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e36d03f3e3a10536afad125f4326a3");
        }
        if (str2 != null) {
            this.c.put(str, str2);
        }
        return this;
    }

    public final g a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cb3266e5c731d65774944b24796005", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cb3266e5c731d65774944b24796005");
        }
        b(str, f);
        d(str, f);
        return this;
    }

    public final void b(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e244dfb7f2acb18fa372b01d50946e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e244dfb7f2acb18fa372b01d50946e7");
            return;
        }
        com.sankuai.meituan.takeoutnew.util.aop.c.a(this, str, f);
        if (com.meituan.android.mrn.config.horn.l.b.a(str)) {
            if (com.meituan.android.mrn.debug.a.a()) {
                if (g == null) {
                    g = new JSONArray();
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, f);
                    for (String str2 : this.c.keySet()) {
                        jSONObject.put(str2, this.c.get(str2));
                    }
                    g.put(jSONObject);
                } catch (JSONException unused) {
                    com.facebook.common.logging.a.b("MRNDashboard@sendKV", "JSONException occurred");
                }
            }
            c().a(str, Arrays.asList(Float.valueOf(f))).a(b()).a();
        }
    }

    private void d(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549cc19e03e48ad187308dba244fe41c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549cc19e03e48ad187308dba244fe41c");
        } else {
            com.facebook.common.logging.a.a(b, "指标名: %s, 值: %s, 维度: %s, Extra: %s", str, Float.valueOf(f), com.meituan.android.mrn.utils.g.a((Object) this.c), this.d);
        }
    }

    public final void c(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e2e1d15a071a4b605fbf975c849dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e2e1d15a071a4b605fbf975c849dc5");
        } else if (com.meituan.android.mrn.debug.a.a()) {
            d(str, f);
        }
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb999c79dcdd27312c3d0ce96c89c12d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb999c79dcdd27312c3d0ce96c89c12d");
        }
        String str = this.d;
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                return jSONObject.toString();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return str;
            }
        }
        return str;
    }

    public com.dianping.monitor.impl.m c() {
        Map<String, String> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69d2ec85cb7dfdb78fa719b3b5b17ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.monitor.impl.m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69d2ec85cb7dfdb78fa719b3b5b17ad");
        }
        com.meituan.android.mrn.config.e a3 = com.meituan.android.mrn.config.c.a();
        com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(e(), e, a3 != null ? a3.n() : "");
        a(mVar);
        for (Map.Entry<String, String> entry : this.c.entrySet()) {
            mVar.a(entry.getKey(), entry.getValue());
        }
        if (this.c.containsKey("bundle_name")) {
            String str = this.c.get("bundle_name");
            if (!TextUtils.isEmpty(str) && (a2 = com.meituan.android.mrn.config.p.a(str)) != null && a2.size() > 0) {
                for (Map.Entry<String, String> entry2 : a2.entrySet()) {
                    if (!TextUtils.isEmpty(entry2.getKey())) {
                        mVar.a(entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        return mVar;
    }

    private void a(com.dianping.monitor.impl.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db22f08fe0cde5b6831ad1fc85b9f323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db22f08fe0cde5b6831ad1fc85b9f323");
            return;
        }
        mVar.a("platform", "android");
        mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, b(e));
        mVar.a("system_version", Build.VERSION.RELEASE);
        mVar.a("model", Build.MODEL);
        mVar.a("cityName", c(e));
        mVar.a("buildType", d(e));
        mVar.a("mrn_version", "3.1201.206");
        mVar.a("env", com.meituan.android.mrn.debug.a.d());
        mVar.a(NetLogConstants.Tags.NETWORK_TYPE, e(e));
        DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(e);
        if (deviceLevel != null) {
            mVar.a("deviceLevel", String.valueOf(deviceLevel));
        }
    }

    public static String e(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ca4834172ab7c01840286586765f727", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ca4834172ab7c01840286586765f727") : (TextUtils.isEmpty(str) || (split = str.split(CommonConstant.Symbol.UNDERLINE)) == null || split.length <= 1) ? "" : split[1];
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b9a49e90b62d6f29c477fc230c7e95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b9a49e90b62d6f29c477fc230c7e95")).intValue();
        }
        if (this.f != null) {
            return this.f.f();
        }
        return -1;
    }

    private String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe1187350cdb8978803fb2efe27ea68", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe1187350cdb8978803fb2efe27ea68");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a229dd1f32032f35639bb61a27ffab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a229dd1f32032f35639bb61a27ffab");
        }
        try {
            com.meituan.android.mrn.config.city.a a2 = com.meituan.android.mrn.config.d.a(context.getApplicationContext());
            if (a2 != null) {
                a2.a();
                return "unknown";
            }
            return "unknown";
        } catch (Exception e2) {
            com.facebook.common.logging.a.d(b, e2.getMessage(), e2);
            return "unknown";
        }
    }

    private String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8416e42e206638ec918e2c19e776e76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8416e42e206638ec918e2c19e776e76") : context == null ? "" : (context.getApplicationInfo().flags & 2) != 0 ? "debug" : "release";
    }

    private String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fbebf7a3a75cd616e5a5b9ca55a2fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fbebf7a3a75cd616e5a5b9ca55a2fc");
        }
        switch (NetWorkUtils.getNetworkType("android-com.meituan.android.mrn", context)) {
            case -1:
                return "无网络";
            case 0:
                return "WIFI";
            case 1:
                return "2G";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
            default:
                return "未知网络";
        }
    }

    public static Map<String, Object> d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a8222378d5720ada39b0a5e03ea6111", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a8222378d5720ada39b0a5e03ea6111");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz", DiagnoseLog.MRN);
        hashMap.put("biz_version", "3.1201.206");
        hashMap.put("env", com.meituan.android.mrn.debug.a.d());
        return hashMap;
    }
}
