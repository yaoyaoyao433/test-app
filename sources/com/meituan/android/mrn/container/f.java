package com.meituan.android.mrn.container;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ai;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.MRNInstanceRecord;
import com.meituan.android.mrn.engine.e;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.m;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.engine.o;
import com.meituan.android.mrn.engine.t;
import com.meituan.android.mrn.monitor.h;
import com.meituan.android.mrn.monitor.i;
import com.meituan.android.mrn.utils.a;
import com.meituan.android.mrn.utils.p;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    private static long O;
    private static long Q;
    public static ChangeQuickRedirect a;
    private long A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private Context F;
    private String G;
    private WritableMap H;
    private boolean I;
    private boolean J;
    private List<a> K;
    private boolean L;
    private Runnable M;
    long b;
    long c;
    long d;
    boolean e;
    boolean f;
    public int g;
    public int h;
    public String i;
    int j;
    long k;
    h l;
    k m;
    String n;
    String o;
    com.meituan.android.mrn.engine.e p;
    i q;
    int r;
    MetricsSpeedMeterTask s;
    String t;
    boolean u;
    String v;
    String w;
    private long x;
    private long y;
    private long z;
    private static ag N = new ag<Map<String, Map<String, Object>>>() { // from class: com.meituan.android.mrn.container.f.6
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ String serializeAsString(Map<String, Map<String, Object>> map) {
            Map<String, Map<String, Object>> map2 = map;
            Object[] objArr = {map2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede584fc557570932ec85972ed18a44a", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede584fc557570932ec85972ed18a44a");
            }
            if (map2 != null) {
                return com.meituan.android.mrn.utils.g.a((Object) map2);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.meituan.android.cipstorage.ag
        /* renamed from: a */
        public Map<String, Map<String, Object>> deserializeFromString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c406ae863566e5b1682919923904ba0a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c406ae863566e5b1682919923904ba0a");
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (Map) com.meituan.android.mrn.utils.g.a(str, Map.class);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    };
    private static List<String> P = new ArrayList();
    private static boolean R = false;

    public static /* synthetic */ int a(f fVar, int i) {
        fVar.r = 0;
        return 0;
    }

    public static /* synthetic */ void a(f fVar, Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "6d4fe844c15b0b8471bece92320698e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "6d4fe844c15b0b8471bece92320698e9");
            return;
        }
        Map map = (Map) obj;
        if (map != null) {
            map.remove(fVar.j());
            q s = s();
            if (s != null) {
                s.a("MRNPageExitReport", (String) map, (ag<String>) N, (ai<String>) null);
            }
        }
    }

    public static /* synthetic */ void a(f fVar, Object obj, Map map) {
        Object[] objArr = {obj, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "e9a3796e76fb2bb94889e6809f9326ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "e9a3796e76fb2bb94889e6809f9326ca");
            return;
        }
        q s = s();
        if (s != null) {
            Map map2 = (Map) obj;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map2.put(fVar.j(), map);
            s.a("MRNPageExitReport", (String) map2, (ag<String>) N, (ai<String>) null);
        }
    }

    public static /* synthetic */ void a(f fVar, Object obj, boolean z) {
        boolean z2;
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "f3f3c866b92d07b562ce81a8b51667a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "f3f3c866b92d07b562ce81a8b51667a5");
            return;
        }
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a20e39f525ed2e67eb959efc12529d2d", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a20e39f525ed2e67eb959efc12529d2d")).booleanValue();
        } else {
            Map map = (Map) obj;
            z2 = map != null && map.containsKey(fVar.j());
        }
        if (z2) {
            return;
        }
        p.a("[MRNPageMonitor@recordPageInfoInBackgroundOnStop]", "MRNPageExitReport", String.format("mrn_pageStop保存页面信息：bundlename=%s component=%s errorCode=%d step=%d", fVar.n, fVar.o, Integer.valueOf(fVar.r), Integer.valueOf(fVar.j)));
        final Map<String, Object> p = fVar.p();
        p.put("is_remote", String.valueOf(p.get("is_remote")));
        p.put("fetch_bridge_type", String.valueOf(p.get("fetch_bridge_type")));
        p.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(fVar.r));
        p.put(Constants.SPEED_METER_STEP, String.valueOf(fVar.j));
        p.put("env", com.meituan.android.mrn.debug.a.d());
        p.put("is_app_background", String.valueOf(fVar.f ? 1 : 0));
        p.put("page_background_time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        p.put("page_background_timestamp", String.valueOf(System.currentTimeMillis()));
        p.put("MRNPageForceStopSuccess", String.valueOf(!z ? 1 : 0));
        Object[] objArr3 = {p};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "264b411acd5ab4f4564ea1797f420ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "264b411acd5ab4f4564ea1797f420ad6");
        } else {
            a(fVar.F, new com.meituan.android.mrn.utils.f() { // from class: com.meituan.android.mrn.container.f.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.f
                public final void a(Object obj2) {
                    Object[] objArr4 = {obj2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "32cf919d1ffd4be466da00cb61845e7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "32cf919d1ffd4be466da00cb61845e7c");
                    } else if (obj2 != null) {
                        f.a(f.this, obj2, p);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(Object obj, Context context) {
        Object[] objArr = {obj, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ab943c2a9e13749d43b4db68243350f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ab943c2a9e13749d43b4db68243350f");
            return;
        }
        Map map = (Map) obj;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map map2 : map.values()) {
                        com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a();
                        float f = 0.0f;
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!"MRNPageForceStopSuccess".equals(entry.getKey())) {
                                a2.a((String) entry.getKey(), String.valueOf(entry.getValue()));
                            } else {
                                f = Float.parseFloat(String.valueOf(entry.getValue()));
                            }
                        }
                        p.a("[MRNPageMonitor@reportForceKilledPages]", "MRNPageExitReport", "上报App被强杀前保存的页面信息：", com.meituan.android.mrn.utils.g.a((Object) map2));
                        a2.b("MRNPageForceStopSuccess", f);
                    }
                }
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "35b4e31668302a2b1c03892a25bda868", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "35b4e31668302a2b1c03892a25bda868");
                    return;
                }
                HashMap hashMap = new HashMap();
                q b = b(context);
                if (b != null) {
                    b.a("MRNPageExitReport", (String) hashMap, (ag<String>) N, (ai<String>) null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public f(Context context, String str, String str2, String str3, WritableMap writableMap, i iVar) {
        Object[] objArr = {context, str, str2, str3, writableMap, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e5be377d47408627e1465b86bb8087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e5be377d47408627e1465b86bb8087");
            return;
        }
        this.B = false;
        this.C = false;
        this.D = false;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = -1;
        this.i = "0";
        this.j = -1;
        this.k = 0L;
        this.E = false;
        this.r = com.meituan.android.mrn.config.q.ERROR_DEFAULT_CODE.Z;
        this.I = false;
        this.J = false;
        this.K = new CopyOnWriteArrayList();
        this.L = false;
        this.M = new Runnable() { // from class: com.meituan.android.mrn.container.f.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aac02088a46bc43b7b86c6deede4d3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aac02088a46bc43b7b86c6deede4d3a");
                    return;
                }
                f.a(f.this, 0);
                f.this.c(0);
            }
        };
        this.F = context.getApplicationContext();
        this.n = str2;
        this.o = str3;
        this.H = writableMap;
        this.G = str;
        this.q = iVar;
        this.s = MetricsSpeedMeterTask.createCustomSpeedMeterTask("MRNContainerPageLoad");
    }

    public final void a(com.meituan.android.mrn.router.d dVar) {
        String str;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f87e911d266cb6b9d432d3b8d24ce2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f87e911d266cb6b9d432d3b8d24ce2a");
            return;
        }
        com.meituan.android.mrn.engine.e bundle = this.F == null ? null : MRNBundleManager.createInstance(this.F).getBundle(this.n);
        if (TextUtils.isEmpty(this.t)) {
            str = dVar == null ? null : dVar.f();
        } else {
            str = this.t;
        }
        this.h = (bundle != null && com.meituan.android.mrn.engine.h.a(bundle) && d.a(bundle.f, str)) ? 0 : 1;
        if (this.h == 0) {
            this.i = bundle.f;
        }
        d(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ac32614eb403a72a9b6b453fa330081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ac32614eb403a72a9b6b453fa330081");
        } else {
            this.y = System.currentTimeMillis();
            k a2 = o.a().a(this.n);
            if (a2 == null || a2.f != com.meituan.android.mrn.engine.p.USED) {
                o a3 = o.a();
                MRNInstanceRecord mRNInstanceRecord = new MRNInstanceRecord(this.n, this.y, 0L);
                Object[] objArr3 = {mRNInstanceRecord};
                ChangeQuickRedirect changeQuickRedirect3 = o.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "9384b60b1b42c61caceed4b14301a35d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "9384b60b1b42c61caceed4b14301a35d");
                } else {
                    a3.b.add(mRNInstanceRecord);
                }
                List<MRNInstanceRecord> d = o.a().d();
                if (d.size() > 3) {
                    d = d.subList(d.size() - 3, d.size());
                }
                JSONObject jSONObject = new JSONObject();
                String str2 = CommonConstant.Symbol.MINUS;
                String str3 = CommonConstant.Symbol.MINUS;
                String str4 = CommonConstant.Symbol.MINUS;
                int i = 0;
                while (i < d.size()) {
                    try {
                        MRNInstanceRecord mRNInstanceRecord2 = d.get(i);
                        String str5 = i == 0 ? "a" : i == 1 ? "b" : com.huawei.hms.opendevice.c.a;
                        if (i == 0) {
                            str4 = mRNInstanceRecord2.bundleName;
                        } else if (i == 1) {
                            str3 = mRNInstanceRecord2.bundleName;
                        } else {
                            str2 = mRNInstanceRecord2.bundleName;
                        }
                        jSONObject.put(String.format("bundle_%s_start_time", str5), mRNInstanceRecord2.pageEnterTime);
                        jSONObject.put(String.format("bundle_%s_end_time", str5), mRNInstanceRecord2.pageExitTime);
                        i++;
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                p.a("[MRNPageMonitor@reportPageStack]", String.format("引擎管理-进入页面%s，上报 %s, 堆栈: {bundle_a:%s,bundle_b:%s,bundle_c:%s}, bundle加载时间: %s", this.n, "MRNBundleStack", str4, str3, str2, jSONObject.toString()));
                com.meituan.android.mrn.monitor.g.a().a("bundle_a", str4).a("bundle_b", str3).a("bundle_c", str2).a("custom", jSONObject.toString()).b("MRNBundleStack", 1.0f);
            }
        }
        d();
        this.b = System.currentTimeMillis();
        this.z = System.currentTimeMillis();
        this.j = 0;
        this.k = System.currentTimeMillis();
        this.s.recordStep("mrn_onCreate");
        String str6 = this.n;
        Object[] objArr4 = {str6};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "adc3872fe9eacde4bad75652493d4e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "adc3872fe9eacde4bad75652493d4e4c");
        } else if (!"group".equals(com.meituan.android.mrn.config.c.a().e()) || TextUtils.isEmpty(str6) || P.contains(str6)) {
        } else {
            P.add(str6);
            if (O > 0) {
                com.meituan.android.mrn.monitor.g.a().c(str6).b("MRNBundleIntervals", ((float) (System.currentTimeMillis() - O)) / 1000.0f);
            }
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13d41df22bdbd6548099177c74e348b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13d41df22bdbd6548099177c74e348b");
            return;
        }
        this.E = true;
        if (this.l != null && this.L) {
            this.l.a();
        }
        String n = n();
        StringBuilder sb = new StringBuilder("mrn://");
        sb.append(this.n);
        sb.append("/");
        sb.append(TextUtils.isEmpty(n) ? "" : n + "/");
        sb.append(this.o);
        com.meituan.android.mrn.utils.i.b("mrn", sb.toString());
        if (this.K != null) {
            for (a aVar : this.K) {
                com.meituan.android.mrn.utils.i.b("mrn", aVar.a, aVar.b);
            }
        }
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        com.meituan.android.mrn.utils.i.a("mrn", "schema", activity.getIntent().getDataString(), true);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af5a4e586d4a9d2372055537cc90fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af5a4e586d4a9d2372055537cc90fa2");
            return;
        }
        if (this.q != null && this.q.c != null) {
            com.meituan.android.mrn.monitor.c cVar = this.q.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.monitor.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "9fb41645f8ac5c4ca05da222c966ef8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "9fb41645f8ac5c4ca05da222c966ef8b");
            } else if (cVar.b != null && com.meituan.android.mrn.config.horn.g.b.a(cVar.b.bundleName) && cVar.c) {
                cVar.c = false;
                com.meituan.android.mrn.monitor.g.a().a(cVar.b);
            }
            com.meituan.android.mrn.monitor.c cVar2 = this.q.c;
            Map<String, Object> q = q();
            Object[] objArr3 = {q};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.monitor.c.a;
            if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "33da524db59a44a6eb1f16c6d0af13ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "33da524db59a44a6eb1f16c6d0af13ce");
            } else if (q != null && cVar2.d != null) {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(cVar2.d, q);
            }
        }
        com.meituan.hotel.android.hplus.diagnoseTool.b b = com.meituan.hotel.android.hplus.diagnoseTool.b.b();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.hotel.android.hplus.diagnoseTool.a.a;
        if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "56a195906485a37c61ad3ed1f53ebc82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "56a195906485a37c61ad3ed1f53ebc82");
        }
        com.meituan.android.mrn.utils.i.b("mrn");
        if (this.K != null) {
            for (a aVar : this.K) {
                com.meituan.android.mrn.utils.i.a("mrn", aVar.a);
            }
        }
    }

    public final void a(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cef921f769121fb4607a5043158421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cef921f769121fb4607a5043158421");
            return;
        }
        if (this.l != null) {
            this.l.a(this.p);
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0286755ad2e427a34d86857116d00edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0286755ad2e427a34d86857116d00edc");
        } else {
            a(this.F, new com.meituan.android.mrn.utils.f() { // from class: com.meituan.android.mrn.container.f.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.f
                public final void a(Object obj) {
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a55112c42178af177484f725f182cdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a55112c42178af177484f725f182cdd");
                    } else if (obj != null) {
                        f.a(f.this, obj, z);
                    }
                }
            });
        }
        if (this.f) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e7ad76661e3345827f16511e3afa07d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e7ad76661e3345827f16511e3afa07d6");
                return;
            }
            com.meituan.android.mrn.monitor.g.a().b("MRNBridgeInstanceCount", n.a().c);
            p.a("[MRNPageMonitor@reportEngineNumOnBackgroundStop]", "引擎管理-App退到后台上报, MRNBridgeInstanceCount= " + n.a().c);
        }
    }

    private static void a(Context context, final com.meituan.android.mrn.utils.f fVar) {
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad07e1452559b1b47b264c3bd7754e12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad07e1452559b1b47b264c3bd7754e12");
            return;
        }
        try {
            q b = b(context);
            if (b != null) {
                b.a("MRNPageExitReport", N, new ai<Object>() { // from class: com.meituan.android.mrn.container.f.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.cipstorage.ai
                    public final void a(boolean z, String str, u uVar, String str2, Object obj) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, uVar, str2, obj};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a99a95d784f8f67a0e4fc0d53f8fa890", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a99a95d784f8f67a0e4fc0d53f8fa890");
                        } else {
                            com.meituan.android.mrn.utils.f.this.a(obj);
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c8591d0ef0dd5f1abcef629fb05735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c8591d0ef0dd5f1abcef629fb05735");
        } else {
            a(this.F, new com.meituan.android.mrn.utils.f() { // from class: com.meituan.android.mrn.container.f.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.f
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0af9d2af6a3356083d55295e2d3a6b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0af9d2af6a3356083d55295e2d3a6b5");
                    } else if (obj != null) {
                        f.a(f.this, obj);
                    }
                }
            });
        }
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39cd2cee93b91fac1b8b50ca3fea4a17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39cd2cee93b91fac1b8b50ca3fea4a17");
        }
        return this.n + this.o + this.z;
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14cc91c414cc886dc538e204f52c54a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14cc91c414cc886dc538e204f52c54a6");
            return;
        }
        com.meituan.android.mrn.utils.ai.b(this.M);
        if (this.r == com.meituan.android.mrn.config.q.ERROR_DEFAULT_CODE.Z && !this.L) {
            this.r = com.meituan.android.mrn.config.q.EXIT_RENDER_INCOMPLETE.Z;
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b52b2f9c18da5270ee9d5cadcd8fcf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b52b2f9c18da5270ee9d5cadcd8fcf7");
        } else if (this.E) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("wait_time", System.currentTimeMillis() - this.z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.meituan.android.mrn.monitor.g a2 = c().a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(this.r)).a(Constants.SPEED_METER_STEP, String.valueOf(this.j)).a("wait_time_nosuccess", String.valueOf(a(z, this.z))).a("backup", String.valueOf(this.u ? 1 : 0));
            a2.d = jSONObject.toString();
            a2.b("MRNPageExitSuccess", !z ? 1.0f : 0.0f);
            p.a("[MRNPageMonitor@reportPageLoadExitSuccess]", String.format("mrn_page_destroy&bundlename=%s&component=%s&isPageLoadSuccess=%b&errorCode=%d&step=%d", this.n, this.o, Boolean.valueOf(!z ? 1 : 0), Integer.valueOf(this.r), Integer.valueOf(this.j)));
            if (this.r == -1 && !com.meituan.android.mrn.debug.a.b()) {
                k();
            }
            if (!this.e) {
                c().a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(this.r)).a(Constants.SPEED_METER_STEP, String.valueOf(this.j)).a("wait_time_nosuccess", String.valueOf(a(z, this.k))).b("MRNPageFrontExitSuccess", z ? 0.0f : 1.0f);
            }
            i();
        }
        this.x = System.currentTimeMillis();
        o.a().a(new MRNInstanceRecord(this.n, this.y, this.x));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b A[Catch: Throwable -> 0x012c, TryCatch #0 {Throwable -> 0x012c, blocks: (B:31:0x00d8, B:35:0x00ed, B:37:0x00f4, B:40:0x00fb, B:42:0x0106, B:44:0x010b, B:45:0x0123, B:34:0x00e5), top: B:50:0x00d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.app.Activity r22, com.meituan.android.mrn.engine.e r23) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.container.f.a(android.app.Activity, com.meituan.android.mrn.engine.e):void");
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb16e56ab38a2f1bf759a0ed6d60a06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb16e56ab38a2f1bf759a0ed6d60a06");
            return;
        }
        if (this.p != null) {
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            this.p.e();
        }
        Object[] objArr2 = {0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc519152937da3cd6b7d3a11a71c2b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc519152937da3cd6b7d3a11a71c2b36");
        } else {
            com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).d(n()).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(this.I ? 1 : 0)).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0").a("fetch_bridge_type", String.valueOf(this.m == null ? -1 : this.m.d)).a("local_bundle", String.valueOf(this.h)).b("MRNLoadBundle", 1.0f);
        }
        m.a(this.m, this.o, 2);
        this.j = 3;
        this.k = System.currentTimeMillis();
        this.A = System.currentTimeMillis();
        if (z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce00e74fecdfdc72d88b76ed3cda28b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce00e74fecdfdc72d88b76ed3cda28b6");
            } else {
                long currentTimeMillis = this.d > 0 ? System.currentTimeMillis() - this.d : 0L;
                c().a("success", "1").b("MRNBundleLoadExecuteTime", (float) currentTimeMillis);
                Object[] objArr4 = {new Long(currentTimeMillis)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c8c9b5eb745dc3a4444a4366e6d73bfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c8c9b5eb745dc3a4444a4366e6d73bfd");
                } else {
                    HashMap hashMap = new HashMap(u());
                    hashMap.put("source", this.v);
                    hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.w);
                    hashMap.put("success", 1);
                    Babel.logRT(new Log.Builder("").tag("bundleLoad").optional(hashMap).reportChannel("prism-report-mrn").value(currentTimeMillis).lv4LocalStatus(true).build());
                }
                this.s.recordStep("mrn_load_bundle");
                p.a("[MRNPageMonitor@reportLoadBundleTime]", String.format("%s_%s: %s", this.n, this.o, Long.valueOf(currentTimeMillis)));
            }
        }
        if (this.q != null && this.q.c != null) {
            com.meituan.android.mrn.monitor.c cVar = this.q.c;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.monitor.c.a;
            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "1732544772aa1b2aa6fc08f44b158290", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "1732544772aa1b2aa6fc08f44b158290");
            } else {
                cVar.b.renderStartTime = System.currentTimeMillis();
                if (cVar.d != null) {
                    cVar.d.recordStep("renderStart");
                }
            }
        }
        if (this.p != null && this.K.size() == 0) {
            this.K.add(new a(this.p.c, this.p.f));
            com.meituan.android.mrn.utils.i.b("mrn", this.p.c, this.p.f);
            if (this.p.n != null && this.p.n.size() > 0) {
                for (e.a aVar : this.p.n) {
                    this.K.add(new a(aVar.b, aVar.c));
                    com.meituan.android.mrn.utils.i.b("mrn", aVar.b, aVar.c);
                }
            }
        }
        if (this.q == null || this.q.c == null || this.m == null) {
            return;
        }
        this.q.c.b.fetch_bridge_type = this.m.d;
        if (this.m.i != null) {
            this.q.c.b.bundleVersion = this.m.i.f;
        }
    }

    public final void b() {
        com.meituan.android.mrn.codecache.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ffe09d31b5de473a70a9bd50cf047bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ffe09d31b5de473a70a9bd50cf047bd");
            return;
        }
        this.L = true;
        b(0);
        this.j = 4;
        this.k = System.currentTimeMillis();
        com.meituan.android.mrn.utils.ai.a(this.M, 100L);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "281a977d85ac976b3947ce03f8969323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "281a977d85ac976b3947ce03f8969323");
        } else if (!this.D) {
            this.D = true;
            c().b("MRNRenderTime", (float) (this.A <= 0 ? 0L : System.currentTimeMillis() - this.A));
            this.s.recordStep("mrn_render_bundle");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "01c1259ece355cd4442cac72b479a61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "01c1259ece355cd4442cac72b479a61d");
        } else if (!this.C) {
            this.C = true;
            if (this.b > 0) {
                if (this.q != null && this.q.c != null) {
                    com.meituan.android.mrn.monitor.c cVar = this.q.c;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.monitor.c.a;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "2e2335b24305e9f73d2fd99ea9adf4ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "2e2335b24305e9f73d2fd99ea9adf4ce");
                    } else if (cVar.b.fCPTime <= 0) {
                        cVar.b.fCPTime = System.currentTimeMillis();
                        if (cVar.d != null) {
                            cVar.d.recordStep("fCP");
                        }
                        com.meituan.hotel.android.hplus.diagnoseTool.b.b();
                    }
                }
                long currentTimeMillis = System.currentTimeMillis() - this.b;
                if (this.e) {
                    c().b("MRNPageBackgroundLoadTime", (float) currentTimeMillis);
                } else {
                    com.meituan.android.mrn.monitor.g c = c();
                    com.meituan.android.mrn.codecache.c a2 = com.meituan.android.mrn.codecache.c.a();
                    com.meituan.android.mrn.engine.e eVar = this.p;
                    Object[] objArr5 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.codecache.c.a;
                    if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "30a4aa16a3c58b95181affd995edaea9", RobustBitConfig.DEFAULT_VALUE)) {
                        dVar = (com.meituan.android.mrn.codecache.d) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "30a4aa16a3c58b95181affd995edaea9");
                    } else if (eVar == null) {
                        dVar = com.meituan.android.mrn.codecache.d.ERROR;
                    } else {
                        dVar = a2.c.get(eVar.i());
                        if (dVar == null) {
                            dVar = com.meituan.android.mrn.codecache.d.ERROR;
                        }
                    }
                    c.a("codecache_status", String.valueOf(dVar.ordinal())).b("MRNPageLoadTime", (float) currentTimeMillis);
                    Object[] objArr6 = {new Long(currentTimeMillis)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "97a29b80b4a7519efbcd31c2cfce57bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "97a29b80b4a7519efbcd31c2cfce57bf");
                    } else {
                        HashMap hashMap = new HashMap(u());
                        hashMap.put("source", this.v);
                        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.w);
                        hashMap.put("success", 1);
                        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, 0);
                        Babel.logRT(new Log.Builder("").tag("pageLoadTime").optional(hashMap).reportChannel("prism-report-mrn").value(currentTimeMillis).lv4LocalStatus(true).build());
                    }
                    this.s.recordStep("mrn_pageLoad");
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(this.s, q());
                }
                p.a("[MRNPageMonitor@reportPageLoadTime]", String.format("mrn_render_end&bundlename=%s&component=%s&loadPageTime=%s&hasEnterBackground=%b", this.n, this.o, Long.valueOf(currentTimeMillis), Boolean.valueOf(this.e)));
                if (currentTimeMillis > 10000) {
                    c(currentTimeMillis);
                }
            }
        }
        com.meituan.android.mrn.debug.interfaces.b.a();
        if (this.l != null) {
            this.l.a();
        }
    }

    public final void a(com.meituan.android.mrn.config.q qVar) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0842c71f048c70cd56b2bf19e1f8d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0842c71f048c70cd56b2bf19e1f8d49");
        } else if (qVar == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.config.q.a;
            if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "e2627cdfaff700bd601e6647ffa9bbb8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "e2627cdfaff700bd601e6647ffa9bbb8")).booleanValue();
            } else {
                z = qVar.Z >= com.meituan.android.mrn.config.q.ERROR_CREATE_MRN_INSTANCE.Z && qVar.Z < com.meituan.android.mrn.config.q.LOAD_SO_FAILED.Z;
            }
            if (z || qVar == com.meituan.android.mrn.config.q.LOAD_SO_FAILED) {
                a(qVar.Z);
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.config.q.a;
                if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "78864161d8a8e500384dd43db7bf116c", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "78864161d8a8e500384dd43db7bf116c")).booleanValue();
                } else if (qVar.Z < com.meituan.android.mrn.config.q.DOWNLOAD_OR_UNZIP_FAILED.Z || qVar.Z >= com.meituan.android.mrn.config.q.RUNTIME_JS_ERROR.Z) {
                    z2 = false;
                }
                if (z2 || qVar == com.meituan.android.mrn.config.q.BUNDLE_INCOMPLETE) {
                    e(qVar.Z);
                } else if (qVar == com.meituan.android.mrn.config.q.RENDER_ERROR) {
                    b(qVar.Z);
                }
            }
            this.r = qVar.Z;
            if (qVar != com.meituan.android.mrn.config.q.RUNTIME_JS_ERROR && qVar != com.meituan.android.mrn.config.q.WHITE_SCREEN_ERROR) {
                c(qVar.Z);
            }
            if (this.m != null) {
                com.meituan.android.mrn.debug.interfaces.b.a();
            }
        }
    }

    private void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b886122063c0f8f30cce95bddb219f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b886122063c0f8f30cce95bddb219f");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(" 页面加载时间:");
            sb.append(j);
            sb.append(" 是否加载中进入过后台:");
            sb.append(this.e);
            com.meituan.android.mrn.config.e a2 = com.meituan.android.mrn.config.c.a();
            sb.append(" 用户UUID:");
            sb.append(a2.n());
            sb.append(" BundleName:");
            sb.append(this.n);
            sb.append(" ComponentName:");
            sb.append(this.o);
            if (this.p != null) {
                sb.append(" BundleVersion:");
                sb.append(this.p.f);
                sb.append(" 加载包性质:");
                sb.append(r());
            }
            com.meituan.android.mrn.utils.c.a("[MRNPageMonitor@babelPageLoadTime]", sb.toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b94fec6e3e5251488ac5e3d3ae41fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b94fec6e3e5251488ac5e3d3ae41fe");
        } else if (this.B) {
        } else {
            this.B = true;
            if (TextUtils.isEmpty(this.n) || this.n.startsWith("rn_null_") || this.n.endsWith("_null")) {
                p.a("[MRNPageMonitor@reportPageLoadSuccess]", "bundle is not exist, bundleName:" + this.n);
                if (this.H != null) {
                    if (this.H.hasKey("mrn_biz") && this.H.hasKey("mrn_entry")) {
                        String string = this.H.getString("mrn_biz");
                        String string2 = this.H.getString("mrn_entry");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            this.n = String.format("rn_%s_%s", string, string2);
                        }
                    }
                    if (TextUtils.isEmpty(this.o) && this.H.hasKey("mrn_component")) {
                        this.o = this.H.getString("mrn_component");
                    }
                }
            }
            c().a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(this.r)).a("local_bundle", String.valueOf(this.h)).a("backup", String.valueOf(this.u ? 1 : 0)).b("MRNPageLoadSuccess", i == 0 ? 1.0f : 0.0f);
            if (this.r != 0) {
                t();
            }
            Object[] objArr2 = new Object[1];
            Object[] objArr3 = new Object[3];
            objArr3[0] = this.G;
            objArr3[1] = this.o;
            objArr3[2] = Boolean.valueOf(i == 0);
            objArr2[0] = String.format("mrn_report_page_success&bundlename=%s&component=%s&isPageLoadSuccess=%b", objArr3);
            p.a("[MRNPageMonitor@reportPageLoadSuccess]", objArr2);
            if (i == 0 || com.meituan.android.mrn.debug.a.b()) {
                return;
            }
            d(i);
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19394d96f9c4b3575bba66ca522c76c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19394d96f9c4b3575bba66ca522c76c0");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(" 是否加载中进入过后台:");
            sb.append(this.e);
            sb.append(" 页面ErrorCode:");
            sb.append(i);
            sb.append(" 用户UUID:");
            sb.append(com.meituan.android.mrn.config.c.a() == null ? null : com.meituan.android.mrn.config.c.a().n());
            sb.append(" BundleName:");
            sb.append(this.n);
            sb.append(" ComponentName:");
            sb.append(this.o);
            a(sb);
            com.facebook.common.logging.a.b("[MRNPageMonitor@babelPageLoadSuccess]", sb.toString());
        } catch (Exception unused) {
        }
    }

    private int a(boolean z, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3980cc9e1b8dc53feee7504fac1b251e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3980cc9e1b8dc53feee7504fac1b251e")).intValue();
        }
        if (z) {
            long currentTimeMillis = j <= 0 ? 0L : System.currentTimeMillis() - j;
            if (currentTimeMillis >= 0) {
                if (currentTimeMillis < MetricsAnrManager.ANR_THRESHOLD) {
                    return ((int) (currentTimeMillis / 1000)) + 1;
                }
                if (currentTimeMillis < 10000) {
                    return 6;
                }
                if (currentTimeMillis < 15000) {
                    return 7;
                }
                return currentTimeMillis < 20000 ? 8 : 9;
            }
            return 0;
        }
        return 0;
    }

    public static void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e674307a7bbf7551316c4a68b9bf97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e674307a7bbf7551316c4a68b9bf97b");
        } else {
            a(context, new com.meituan.android.mrn.utils.f() { // from class: com.meituan.android.mrn.container.f.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.f
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c67e31ff83933d7a5410cdf32a342188", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c67e31ff83933d7a5410cdf32a342188");
                    } else if (obj != null) {
                        f.a(obj, context);
                    }
                }
            });
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b607416c7c61d8f4a87854f65c6e24a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b607416c7c61d8f4a87854f65c6e24a9");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(" 页面存在时间:");
            long j = 0;
            if (this.z > 0) {
                j = System.currentTimeMillis() - this.z;
            }
            sb.append(j);
            sb.append(" 是否加载中进入过后台:");
            sb.append(this.e);
            sb.append(" 引擎状态:");
            sb.append(l());
            sb.append(" 用户UUID:");
            sb.append(com.meituan.android.mrn.config.c.a() == null ? null : com.meituan.android.mrn.config.c.a().n());
            sb.append(" BundleName:");
            sb.append(this.n);
            sb.append(" ComponentName:");
            sb.append(this.o);
            sb.append(" 是否是线上包:");
            sb.append(com.meituan.android.mrn.debug.a.c());
            sb.append(" 当前页面运行到step:");
            sb.append(this.j);
            sb.append(" 距离上个步骤的时间:");
            sb.append(String.valueOf(System.currentTimeMillis() - this.k));
            sb.append(" 当前应用在:");
            sb.append(this.f ? "后台" : "前台");
            sb.append(" MRN版本:3.1201.206");
            a(sb);
            com.facebook.common.logging.a.b("[MRNPageMonitor@babelPageLoadExitSuccess]", sb.toString());
        } catch (Exception unused) {
        }
    }

    private void a(StringBuilder sb) {
        Object[] objArr = {sb};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924e036985b7f60c97805f1077524da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924e036985b7f60c97805f1077524da9");
        } else if (this.m == null) {
        } else {
            if (this.p != null) {
                sb.append(" mMRNInstance内bundleVersion:");
                sb.append(this.p.f);
            } else {
                sb.append(" mMRNInstance内bundle不存在");
            }
            sb.append(" 加载包性质:");
            sb.append(r());
            sb.append("  已加载包列表:");
            sb.append(m());
        }
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81762f6ebddca3fca432d537d468686", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81762f6ebddca3fca432d537d468686") : this.m != null ? this.m.f != null ? this.m.f.toString() : "引擎状态不存在" : "引擎不存在";
    }

    private String m() {
        List<String> loadedJSList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eeb1c359a26b2f02f811bb4b107c801", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eeb1c359a26b2f02f811bb4b107c801") : (this.m == null || this.m.b == null || this.m.b.getCurrentReactContext() == null || !(this.m.b.getCurrentReactContext().getCatalystInstance() instanceof CatalystInstanceImpl) || (loadedJSList = this.m.b.getCurrentReactContext().getCatalystInstance().getLoadedJSList()) == null || loadedJSList.size() <= 0) ? "" : TextUtils.join(StringUtil.SPACE, loadedJSList);
    }

    private String n() {
        return this.p == null ? "" : this.p.f;
    }

    private String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e39ad04a5c7cd51cf82ca16023f83ec1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e39ad04a5c7cd51cf82ca16023f83ec1") : (this.p == null || TextUtils.isEmpty(this.p.j)) ? "0" : this.p.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.meituan.android.mrn.monitor.g c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7111f30e1bdb28f7a3641a00cef3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.monitor.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7111f30e1bdb28f7a3641a00cef3ed");
        }
        com.meituan.android.mrn.monitor.g a2 = com.meituan.android.mrn.monitor.g.a();
        for (Map.Entry<String, Object> entry : p().entrySet()) {
            a2.a(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return a2;
    }

    private Map<String, Object> p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d720fe1f801cb4cc5882944d80156b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d720fe1f801cb4cc5882944d80156b9");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz", this.G);
        hashMap.put("bundle_name", this.n);
        String n = n();
        if (!TextUtils.isEmpty(n)) {
            hashMap.put("bundle_version", n);
        }
        hashMap.put("component_name", this.o);
        hashMap.put("is_remote", Integer.valueOf(this.g));
        hashMap.put("is_code_cache", t.a(this.n, n));
        hashMap.put("fetch_bridge_type", Integer.valueOf(this.m == null ? -1 : this.m.d));
        hashMap.put("rn_version", o());
        return hashMap;
    }

    private Map<String, Object> q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed09239baa2cb0a459bd81ec3b62227", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed09239baa2cb0a459bd81ec3b62227");
        }
        Map<String, Object> p = p();
        p.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.mrn.config.c.a().l());
        p.put("platform", "Android");
        p.put("env", com.meituan.android.mrn.debug.a.d());
        return p;
    }

    private String r() {
        return this.g == 0 ? "本地加载" : this.g == 1 ? "远程拉包" : "初始状态";
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55252d5725d3437af1f11d4dfc5179c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55252d5725d3437af1f11d4dfc5179c4");
            return;
        }
        if (z) {
            this.I = true;
            this.J = false;
        }
        com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(z ? 1 : 0)).b("MRNPageStart", 1.0f);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c73c909d074e6c05ac39c8aeb04f095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c73c909d074e6c05ac39c8aeb04f095");
        } else {
            com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(this.I ? 1 : 0)).a("bundle_version", this.i).a("local_bundle", String.valueOf(this.h)).b("MRNBeforeFetchBundle", 1.0f);
        }
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45aa004858779080b77573cb248b036d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45aa004858779080b77573cb248b036d");
        } else {
            com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).d(n()).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(this.I ? 1 : 0)).a("is_remote", String.valueOf(this.g)).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i)).a("local_bundle", String.valueOf(this.h)).b("MRNFetchBundle", i == 0 ? 1.0f : 0.0f);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0e7e4aee36ed8899f5aeb8fde7801e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0e7e4aee36ed8899f5aeb8fde7801e");
        } else {
            com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).d(n()).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(this.I ? 1 : 0)).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i)).a("fetch_bridge_type", String.valueOf(this.m == null ? -1 : this.m.d)).a("local_bundle", String.valueOf(this.h)).b("MRNFetchReactInstance", i == 0 ? 1.0f : 0.0f);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1e11f78c5a3b200c40cedcadcf59ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1e11f78c5a3b200c40cedcadcf59ff");
        } else if (this.J) {
        } else {
            this.J = true;
            com.meituan.android.mrn.monitor.g.a().a(this.G).c(this.n).d(n()).a("component_name", this.o).a(MonitorManager.RETRYCOUNT, String.valueOf(this.I ? 1 : 0)).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i)).a("local_bundle", String.valueOf(this.h)).b("MRNRenderBundle", i == 0 ? 1.0f : 0.0f);
        }
    }

    public static synchronized void e() {
        synchronized (f.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0df7ba8c8d8fcb89b85964954aab66f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0df7ba8c8d8fcb89b85964954aab66f");
            } else if (R) {
            } else {
                R = true;
                O = System.currentTimeMillis();
                com.meituan.android.mrn.utils.a.a().a(new a.InterfaceC0294a() { // from class: com.meituan.android.mrn.container.f.8
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.mrn.utils.a.InterfaceC0294a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1acec261b79f6f5be64c89a609c72164", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1acec261b79f6f5be64c89a609c72164");
                        } else if (f.Q <= 0) {
                        } else {
                            f.O += System.currentTimeMillis() - f.Q;
                        }
                    }

                    @Override // com.meituan.android.mrn.utils.a.InterfaceC0294a
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13a0b7e00ca130ffc862ac40b53ca817", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13a0b7e00ca130ffc862ac40b53ca817");
                        } else {
                            long unused = f.Q = System.currentTimeMillis();
                        }
                    }
                });
            }
        }
    }

    public final int f() {
        return this.I ? 1 : 0;
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a57873fc58afec9e87de2f5ad9d103a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a57873fc58afec9e87de2f5ad9d103a");
        } else if (kVar == null || kVar.f != com.meituan.android.mrn.engine.p.USED) {
            long j = 0;
            for (MRNInstanceRecord mRNInstanceRecord : o.a().d()) {
                if (mRNInstanceRecord != null && TextUtils.equals(mRNInstanceRecord.bundleName, this.n) && mRNInstanceRecord.pageExitTime > j) {
                    j = mRNInstanceRecord.pageExitTime;
                }
            }
            if (j > 0) {
                long j2 = this.y - j;
                p.a("[MRNPageMonitor@reportIntervalIfBundleReopened]", String.format("引擎管理-重复打开 %s 引擎间隔：%d", this.n, Long.valueOf(j2)));
                com.meituan.android.mrn.monitor.g.a().c(this.n).b("MRNBundleLoadIntervals", (float) j2);
            }
        }
    }

    private static q s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc1bd8bf537f2c32a6f310671134a8c6", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc1bd8bf537f2c32a6f310671134a8c6") : b((Context) null);
    }

    private static q b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9711cb7c6847327f5864d85f2bda684c", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9711cb7c6847327f5864d85f2bda684c");
        }
        if (context == null) {
            context = com.meituan.android.mrn.common.a.a();
        }
        if (context == null) {
            return null;
        }
        return q.a(context, context.getPackageName() + "_cipstoragecenter");
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26deb763169c26d0d74eab2ed78ef80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26deb763169c26d0d74eab2ed78ef80");
            return;
        }
        HashMap hashMap = new HashMap(u());
        hashMap.put("source", this.v);
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.w);
        hashMap.put("success", 0);
        hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(this.r));
        Babel.logRT(new Log.Builder("").tag("pageLoadTime").optional(hashMap).reportChannel("prism-report-mrn").value(0L).lv4LocalStatus(true).build());
    }

    private Map<String, Object> u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35fa13cb726c7308a70e26ced86ece02", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35fa13cb726c7308a70e26ced86ece02");
        }
        Map<String, Object> d = com.meituan.android.mrn.monitor.g.d();
        d.put("bundle_name", this.n);
        String n = n();
        if (!TextUtils.isEmpty(n)) {
            d.put("bundle_version", n);
        }
        d.put("component_name", this.o);
        d.put("fetch_bridge_type", Integer.valueOf(this.m == null ? -1 : this.m.d));
        return d;
    }
}
