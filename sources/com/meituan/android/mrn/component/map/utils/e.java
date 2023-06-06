package com.meituan.android.mrn.component.map.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import com.meituan.android.mrn.component.map.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    public static ExecutorService b = null;
    private static Activity c = null;
    private static int d = 3;
    private static String e;
    private static String f;

    private static String a(int i) {
        switch (i) {
            case 0:
                return "MTGaodeMap";
            case 1:
                return "MTTencentMap";
            case 2:
                return "MTBaiduMap";
            case 3:
                return "MTNativeMap";
            default:
                return "Unknown";
        }
    }

    public static void a(int i, a.C0279a c0279a, long j, boolean z, String str) {
        a.C0279a c0279a2;
        Object[] objArr = {Integer.valueOf(i), c0279a, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90295648db0e6a53940fb6e3b3797e50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90295648db0e6a53940fb6e3b3797e50");
            return;
        }
        if (c0279a == null) {
            try {
                c0279a2 = new a.C0279a();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        } else {
            c0279a2 = c0279a;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", "map_layout");
        jSONObject.put("provider", a(i));
        jSONObject.put("biz", c0279a2.a);
        jSONObject.put("entry", c0279a2.b);
        jSONObject.put("component", c0279a2.c);
        jSONObject.put("time", j);
        jSONObject.put("isTexture", z);
        jSONObject.put("mapId", str);
        a("qcs_lbs", "qcs_lbs_mrnmap_log", jSONObject.toString());
    }

    public static void a(Activity activity, int i, String str, String str2) {
        c = activity;
        d = i;
        e = str;
        f = str2;
    }

    public static void a(final Class<?> cls, final String str, int i, final String str2) {
        Object[] objArr = {cls, str, 19000, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "820798b21f6c757e7e89f6d8241bf6aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "820798b21f6c757e7e89f6d8241bf6aa");
            return;
        }
        if (b == null) {
            b = com.sankuai.android.jarvis.c.a("MSICodeLog");
        }
        b.execute(new Runnable() { // from class: com.meituan.android.mrn.component.map.utils.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c573fd3796f2ebcde1e43bc0659c3a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c573fd3796f2ebcde1e43bc0659c3a7");
                } else {
                    com.sankuai.meituan.mapsdk.mapcore.report.f.a(e.c, e.d, e.e, cls, str, r4, String.format(Locale.getDefault(), "%s,biz:%s", str2, e.f));
                }
            }
        });
    }

    private static void a(String str, com.sankuai.meituan.mapsdk.mapcore.report.c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e366c941c0b588a9fcca02dd5110f74b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e366c941c0b588a9fcca02dd5110f74b");
        } else {
            com.sankuai.meituan.mapsdk.mapcore.report.h.a().a(str, cVar);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a15ed26b58e43bef40f62996feb1a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a15ed26b58e43bef40f62996feb1a58");
        } else if (com.meituan.android.mrn.component.map.d.b) {
            StringBuilder sb = new StringBuilder("MRNMap[");
            sb.append(str);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18440139c48683dedfa7b95e829a9cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18440139c48683dedfa7b95e829a9cce");
        } else {
            com.meituan.android.mrn.component.map.d.a().a(str, str2, str3);
        }
    }

    public static void a(Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "105b6cc36df701ae819c7e85bdec1127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "105b6cc36df701ae819c7e85bdec1127");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.report.c cVar = new com.sankuai.meituan.mapsdk.mapcore.report.c();
        cVar.c = new com.sankuai.meituan.mapsdk.mapcore.report.e(map2, map);
        a("42041815", cVar);
    }

    public static void b(int i, a.C0279a c0279a, long j, boolean z, String str) {
        a.C0279a c0279a2;
        Object[] objArr = {Integer.valueOf(i), c0279a, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37b98ae4212e6a0f45e70cfac92efcf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37b98ae4212e6a0f45e70cfac92efcf7");
            return;
        }
        if (c0279a == null) {
            try {
                c0279a2 = new a.C0279a();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        } else {
            c0279a2 = c0279a;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", "map_loaded");
        jSONObject.put("provider", a(i));
        jSONObject.put("biz", c0279a2.a);
        jSONObject.put("entry", c0279a2.b);
        jSONObject.put("component", c0279a2.c);
        jSONObject.put("time", j);
        jSONObject.put("isTexture", z);
        jSONObject.put("mapId", str);
        a("qcs_lbs", "qcs_lbs_mrnmap_log", jSONObject.toString());
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28bb405a9e99adfe5440b95b93c3a6f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28bb405a9e99adfe5440b95b93c3a6f9");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.report.c cVar = new com.sankuai.meituan.mapsdk.mapcore.report.c();
        cVar.c = new com.sankuai.meituan.mapsdk.mapcore.report.e(a.a(str2), a.a(str));
        a("42041815", cVar);
    }

    public static void a(Throwable th, String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bb4e3618a8b140cc82644fcf0f438f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bb4e3618a8b140cc82644fcf0f438f3");
            return;
        }
        if (!com.meituan.android.mrn.component.map.d.b) {
            Object[] objArr2 = {"qcs_lbs", "qcs_lbs_mrnmap_log", th, str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ff75ed1d9fab3e604c2c84ab90430dde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ff75ed1d9fab3e604c2c84ab90430dde");
            } else {
                com.meituan.android.mrn.component.map.d.a().a("qcs_lbs", "qcs_lbs_mrnmap_log", th, str);
            }
        }
        if (com.meituan.android.mrn.component.map.d.c) {
            throw new RuntimeException(th);
        }
        if (com.meituan.android.mrn.component.map.d.b) {
            Log.e("MRNMap", "", th);
        }
    }
}
