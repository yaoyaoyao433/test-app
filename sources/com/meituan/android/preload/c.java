package com.meituan.android.preload;

import android.content.Context;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.preload.a;
import com.meituan.android.preload.config.d;
import com.meituan.android.preload.config.g;
import com.meituan.android.preload.progress.PreloadProgressReceiver;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static String c;
    private static String d;
    private static final ConcurrentHashMap<String, String> e = new ConcurrentHashMap<>();
    private static final com.meituan.android.preload.progress.a f = new com.meituan.android.preload.progress.a() { // from class: com.meituan.android.preload.c.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.preload.progress.a
        public final void a(String str, String str2, boolean z, String str3) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b73fd583dabd327c5b7eb1336881e5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b73fd583dabd327c5b7eb1336881e5a");
                return;
            }
            String nextElement = TextUtils.isEmpty(str) ? b.e.keys().nextElement() : str;
            if ("1".equals(str2)) {
                MetricsSpeedMeterTask metricsSpeedMeterTask = b.e.get(nextElement);
                if (metricsSpeedMeterTask != null) {
                    metricsSpeedMeterTask.recordStep("FinishedLoadMainDocument");
                    h.a(metricsSpeedMeterTask);
                    b.e.remove(nextElement);
                }
                if (z) {
                    com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
                    String str4 = c.c;
                    Object[] objArr2 = {str4};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.preload.util.c.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "67010d1de16e8e8c7a9484f0ca0fa1ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "67010d1de16e8e8c7a9484f0ca0fa1ea");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("enlight_load_html_success", 1);
                    Map<String, String> b2 = a2.b();
                    b2.put("biz", str4);
                    a2.a(hashMap, b2);
                    return;
                }
                com.meituan.android.preload.util.c a3 = com.meituan.android.preload.util.c.a();
                String str5 = c.c;
                Object[] objArr3 = {str5};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.preload.util.c.a;
                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "90487812c29d527f0809ed28ade89a87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "90487812c29d527f0809ed28ade89a87");
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("enlight_load_html_success", 0);
                    Map<String, String> b3 = a3.b();
                    b3.put("biz", str5);
                    a3.a(hashMap2, b3);
                }
                com.meituan.android.preload.util.c.a().c(str3);
            } else if ("2".equals(str2)) {
                ConcurrentHashMap<String, MetricsSpeedMeterTask> concurrentHashMap = b.e;
                MetricsSpeedMeterTask metricsSpeedMeterTask2 = concurrentHashMap.get(nextElement + nextElement);
                if (metricsSpeedMeterTask2 != null) {
                    metricsSpeedMeterTask2.recordStep("FinishedLoadEnlightBusiness");
                    h.a(metricsSpeedMeterTask2);
                    ConcurrentHashMap<String, MetricsSpeedMeterTask> concurrentHashMap2 = b.e;
                    concurrentHashMap2.remove(nextElement + nextElement);
                }
                String str6 = (String) c.e.get(str);
                if (str6 != null) {
                    if (z) {
                        com.meituan.android.preload.util.c a4 = com.meituan.android.preload.util.c.a();
                        String str7 = c.c;
                        Object[] objArr4 = {str7, str6};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.preload.util.c.a;
                        if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "a69de6e75601f4a475b58295e5c39996", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "a69de6e75601f4a475b58295e5c39996");
                            return;
                        } else if (StringUtil.NULL.equals(str6)) {
                            return;
                        } else {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("enlight_load_page_success", 1);
                            Map<String, String> b4 = a4.b();
                            b4.put("biz", str7);
                            b4.put("page", str6);
                            a4.a(hashMap3, b4);
                            return;
                        }
                    }
                    com.meituan.android.preload.util.c a5 = com.meituan.android.preload.util.c.a();
                    String str8 = c.c;
                    Object[] objArr5 = {str8, str6};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.preload.util.c.a;
                    if (PatchProxy.isSupport(objArr5, a5, changeQuickRedirect5, false, "693061a04121490c82f10f89c0425e4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, a5, changeQuickRedirect5, false, "693061a04121490c82f10f89c0425e4e");
                    } else if (!StringUtil.NULL.equals(str6)) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("enlight_load_page_success", 0);
                        Map<String, String> b5 = a5.b();
                        b5.put("biz", str8);
                        b5.put("page", str6);
                        a5.a(hashMap4, b5);
                    }
                    com.meituan.android.preload.util.c.a().c(str3);
                }
            }
        }
    };
    private static final PreloadProgressReceiver g = new PreloadProgressReceiver(f);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        BaseTitleBar a(Context context);
    }

    public static void a(boolean z) {
        com.meituan.android.preload.util.a.b = z;
    }

    public static void a(g gVar) {
        d.b = gVar;
    }

    public static void a(com.meituan.android.preload.config.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "315ee3dbc034a23df69b4fa69418f462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "315ee3dbc034a23df69b4fa69418f462");
            return;
        }
        com.meituan.android.preload.config.b b2 = com.meituan.android.preload.config.b.b();
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.preload.config.b.a;
        if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "793d52580cec934aced1d6cddbb24b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "793d52580cec934aced1d6cddbb24b98");
        } else {
            if (com.meituan.android.preload.config.b.c == null) {
                com.meituan.android.preload.config.b.c = new ArrayList();
            }
            if (cVar != null) {
                com.meituan.android.preload.config.b.c.add(cVar);
            }
        }
        final com.meituan.android.preload.config.b b3 = com.meituan.android.preload.config.b.b();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.preload.config.b.a;
        if (PatchProxy.isSupport(objArr3, b3, changeQuickRedirect3, false, "f99e91850b22d0058dba5401e082980c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, b3, changeQuickRedirect3, false, "f99e91850b22d0058dba5401e082980c");
        } else if (com.meituan.android.preload.config.b.b) {
        } else {
            Horn.register(d.a(), new HornCallback() { // from class: com.meituan.android.preload.config.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "47fb48b4765bd53a78fc4dfaee1b8ef3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "47fb48b4765bd53a78fc4dfaee1b8ef3");
                        return;
                    }
                    com.meituan.android.preload.util.c a2 = com.meituan.android.preload.util.c.a();
                    a2.b("enable = " + z + " result = " + str);
                    b.a(b3, z, str);
                }
            });
            com.meituan.android.preload.config.b.b = true;
        }
    }

    public static void a(@NonNull Context context, @NonNull String str, @NonNull int i, a.C0348a c0348a, a aVar) {
        Object[] objArr = {context, str, 1, null, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88884e5a4b7468e8f19572cb979984e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88884e5a4b7468e8f19572cb979984e5");
            return;
        }
        com.meituan.android.preload.config.b b2 = com.meituan.android.preload.config.b.b();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.preload.config.b.a;
        if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "ec2598e697bc8e44184b695ece246ed9", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "ec2598e697bc8e44184b695ece246ed9")).booleanValue();
        } else {
            b2.d = str;
            if (!com.meituan.android.preload.util.d.a(str) && com.meituan.android.preload.config.b.e != null && com.meituan.android.preload.config.b.e.b && !com.meituan.android.preload.config.b.f.contains(str)) {
                com.meituan.android.preload.config.b.f.add(str);
                b2.c(str);
                com.meituan.android.preload.util.a.a("Enlight/ConfigCenter", "registerBiz: " + str);
            }
        }
        PreloadProgressReceiver preloadProgressReceiver = g;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        context.registerReceiver(preloadProgressReceiver, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f996d207f580c1d1e3578b13d3086211", RobustBitConfig.DEFAULT_VALUE) ? (IntentFilter) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f996d207f580c1d1e3578b13d3086211") : new IntentFilter("enlight_progress"));
        com.meituan.android.preload.config.a a2 = com.meituan.android.preload.config.b.a(str);
        c = str;
        if (a2 != null) {
            com.meituan.android.preload.util.a.a("Enlight/Manager", "biz: " + str + ", config: " + a2);
            String str2 = a2.c;
            int i2 = a2.e;
            boolean z = a2.f;
            Object[] objArr4 = {context, aVar, str2, 1, null, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(a2.g), a2.h, null};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6aa529d7b99077b5b12abde42c3e9240", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6aa529d7b99077b5b12abde42c3e9240");
                return;
            }
            StringBuilder sb = new StringBuilder("initInner: ");
            sb.append(str2);
            sb.append(", offlineSwitch: ");
            sb.append(z);
            b.a(context).a(com.meituan.android.preload.util.d.b(str2), 1, null, i2, aVar, c, null);
            b a3 = b.a(context);
            String b3 = com.meituan.android.preload.util.d.b(str2);
            Object[] objArr5 = {b3};
            ChangeQuickRedirect changeQuickRedirect5 = b.a;
            if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "ba432e6a0b99f21d375649ef585ab9b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "ba432e6a0b99f21d375649ef585ab9b8");
            } else {
                String b4 = com.meituan.android.preload.util.d.b(b3);
                if (a3.b && !TextUtils.equals(a3.d, b4)) {
                    StringBuilder sb2 = new StringBuilder("updatepreloadUrl: ");
                    sb2.append(b3);
                    sb2.append(", mPreloadUrl: ");
                    sb2.append(a3.d);
                    a3.d = b4;
                    a3.b();
                    a3.a(a3.c);
                }
            }
            b = !com.meituan.android.preload.util.d.a(str2);
        }
    }

    public static com.meituan.android.preload.a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db5fd29778e09ae2a145f5ca42447d9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.preload.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db5fd29778e09ae2a145f5ca42447d9e");
        }
        String d2 = com.meituan.android.preload.util.d.d(d);
        com.meituan.android.preload.a a2 = b.a(context).a(context, c, d2);
        if (a2 == null) {
            com.meituan.android.preload.util.c.a().a(c, d2, "30068");
            com.meituan.android.preload.util.c.a().c("获取重试后预加载容器失败");
        } else {
            com.meituan.android.preload.util.c a3 = com.meituan.android.preload.util.c.a();
            String str = c;
            Object[] objArr2 = {str, d2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.preload.util.c.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "2d49d8eeb0687558ad8d89b35f287c2b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "2d49d8eeb0687558ad8d89b35f287c2b");
            } else if (!StringUtil.NULL.equals(d2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("enlight_get_container_success", 1);
                Map<String, String> b2 = a3.b();
                b2.put("biz", str);
                b2.put("page", d2);
                b2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "0");
                a3.a(hashMap, b2);
            }
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.preload.c.a(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "415f30be1d128ba4439e3e1d38d91a7f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "415f30be1d128ba4439e3e1d38d91a7f")).booleanValue() : com.meituan.android.preload.config.b.b(str);
    }

    public static String a(Map<String, String> map, String str, long j, @NonNull com.meituan.android.preload.a aVar, String str2) {
        Object[] objArr = {map, str, new Long(j), aVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b256ea704b7cbc26050c6c0b381b3e63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b256ea704b7cbc26050c6c0b381b3e63");
        }
        com.meituan.android.preload.config.a a2 = com.meituan.android.preload.config.b.a(str2);
        long loadUrlTime = aVar.getLoadUrlTime();
        String uniqueId = aVar.getUniqueId();
        String str3 = a2 == null ? "" : a2.d;
        e.put(uniqueId, com.meituan.android.preload.util.d.d(str));
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("Enlight_business_" + com.meituan.android.preload.config.b.b().d);
        createCustomSpeedMeterTask.recordStep("EnlightLoadBusiness");
        ConcurrentHashMap<String, MetricsSpeedMeterTask> concurrentHashMap = b.e;
        concurrentHashMap.put(uniqueId + uniqueId, createCustomSpeedMeterTask);
        return com.meituan.android.preload.util.d.a(map, str, j, loadUrlTime, uniqueId, str3);
    }
}
