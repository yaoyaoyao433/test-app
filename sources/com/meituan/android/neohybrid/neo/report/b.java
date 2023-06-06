package com.meituan.android.neohybrid.neo.report;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "416b8890e990934a14d3da20b1caef0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "416b8890e990934a14d3da20b1caef0b");
        } else {
            ae.a(null, str, map, str2, "com.meituan.android.neohybrid.neo.report.NeoReportController", true);
        }
    }

    public static void a(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44a6632953b18ba18b1115c15ca8f204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44a6632953b18ba18b1115c15ca8f204");
        } else {
            a(str, "c_pay_neo_js_sdk", map);
        }
    }

    public static void a(@NonNull String str, @NonNull String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31147292f58dc42e8715405770b14159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31147292f58dc42e8715405770b14159");
        } else {
            ae.a(str3, str2, str, null, map, ae.a.VIEW, 0, "com.meituan.android.neohybrid.neo.report.NeoReportController", true);
        }
    }

    public static void b(@NonNull String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a495ccc82196510ccd0180b8872b4d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a495ccc82196510ccd0180b8872b4d06");
        } else {
            a(str, "c_pay_neo_js_sdk", str2, map);
        }
    }

    public static void b(@NonNull String str, @NonNull String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e68509ea3eb83bbad68edf7439921a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e68509ea3eb83bbad68edf7439921a20");
        } else {
            ae.a(str3, str2, str, null, map, ae.a.CLICK, -1, "com.meituan.android.neohybrid.neo.report.NeoReportController", true);
        }
    }

    public static void a(@NonNull Throwable th, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {th, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a001bb32226714813f1e928906e27796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a001bb32226714813f1e928906e27796");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("_scene", str);
        map.put("_message", th.getMessage());
        a("b_pay_o3xvuscx_mv", "c_pay_7c9fc4b4", null, map);
    }

    public static void a(@NonNull Throwable th, @NonNull String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e7c36d31dbeeedc7a22e12906fa4ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e7c36d31dbeeedc7a22e12906fa4ffa");
        } else {
            a(th, str, (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "839af929892259f0a5099a50495f9c7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "839af929892259f0a5099a50495f9c7e");
        } else {
            c(str, str2, null);
        }
    }

    public static void c(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b66ba8538938211fe0013334d5107d63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b66ba8538938211fe0013334d5107d63");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("_scene", str);
        map.put("_message", str2);
        a("b_pay_neo_native_report_error_sc", map);
    }

    public static void d(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab5ee075f4310adaee8a3254689ca61e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab5ee075f4310adaee8a3254689ca61e");
            return;
        }
        Object[] objArr2 = {str, str2, map, "com.meituan.android.neohybrid.neo.report.NeoReportController"};
        ChangeQuickRedirect changeQuickRedirect2 = ae.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "30eb8d66c56e0c3a00fd31f67083aeaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "30eb8d66c56e0c3a00fd31f67083aeaf");
            return;
        }
        HashMap<String, Object> a2 = ae.a("com.meituan.android.neohybrid.neo.report.NeoReportController", map);
        HashMap hashMap = new HashMap(1);
        a2.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        a2.put("nb_platform", "android");
        a2.put("is_debug", com.meituan.android.paybase.utils.b.b() ? "1" : "0");
        String str3 = a2.containsKey("nb_container") ? a2.get("nb_container") : "";
        if (!(str3 instanceof String) || TextUtils.isEmpty((String) str3)) {
            a2.put("nb_container", "native");
        }
        a2.put("priority", "normal");
        a2.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        String str4 = com.meituan.android.paybase.common.analyse.a.b;
        if (!TextUtils.isEmpty(str4)) {
            a2.put(HybridSignPayJSHandler.ARG_TRADE_NO, str4);
        }
        if (map != null && map.size() > 0) {
            hashMap.put("custom", a2);
        }
        ae.a().writePageView(str, str2, hashMap);
    }

    public static void e(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86dd0ca3ce45c3d7f51b6f4e621c87bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86dd0ca3ce45c3d7f51b6f4e621c87bd");
            return;
        }
        Object[] objArr2 = {str, str2, map, "com.meituan.android.neohybrid.neo.report.NeoReportController"};
        ChangeQuickRedirect changeQuickRedirect2 = ae.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "97d07a25ef9b85184eeb122a5c655b18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "97d07a25ef9b85184eeb122a5c655b18");
            return;
        }
        HashMap<String, Object> a2 = ae.a("com.meituan.android.neohybrid.neo.report.NeoReportController", map);
        HashMap hashMap = new HashMap(1);
        if (map != null && map.size() > 0) {
            hashMap.put("custom", a2);
        }
        ae.a().writePageDisappear(str, str2, hashMap);
    }
}
