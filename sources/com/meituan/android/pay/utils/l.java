package com.meituan.android.pay.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static long b;

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1058a81d71a458e8a60698e5092609e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1058a81d71a458e8a60698e5092609e1");
        }
        if (TextUtils.isEmpty(str)) {
            return "com.meituan.android.pay.utils.HybridHalfPageCashierStatics";
        }
        return "com.meituan.android.pay.utils.HybridHalfPageCashierStatics_" + str;
    }

    public static void a(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2816a3af009b343f1a349627a321c182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2816a3af009b343f1a349627a321c182");
            return;
        }
        a(str);
        ae.a("com.meituan.android.pay.utils.HybridHalfPageCashierStatics", hashMap);
        ae.a(c(str), hashMap);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f891cd9509f62e6eb1aef134df231f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f891cd9509f62e6eb1aef134df231f0d");
            return;
        }
        ae.a("com.meituan.android.pay.utils.HybridHalfPageCashierStatics");
        ae.a(c(str));
    }

    public static void a(String str, Object obj, String str2) {
        Object[] objArr = {str, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "520352abb431eb24f6643111851e2a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "520352abb431eb24f6643111851e2a4b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        Object[] objArr2 = {hashMap, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3cd82c24a532341995214eac9b95933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3cd82c24a532341995214eac9b95933");
            return;
        }
        com.meituan.android.paybase.utils.x.b("com.meituan.android.pay.utils.HybridHalfPageCashierStatics", hashMap);
        com.meituan.android.paybase.utils.x.b(c(str2), hashMap);
    }

    public static void a(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, null, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f5899406350d41e984ad210ee7465a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f5899406350d41e984ad210ee7465a6");
        } else {
            com.meituan.android.paybase.utils.u.a(str, str2, (Map<String, Object>) null, c(str3));
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, null, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78cdf0b27818acc537799c706db39763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78cdf0b27818acc537799c706db39763");
        } else {
            com.meituan.android.paybase.utils.u.b(str, str2, null, c(str3));
        }
    }

    public static void a(String str, String str2, Exception exc, String str3) {
        Object[] objArr = {str, str2, exc, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6caa6ab4941d19df9629f5500af86deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6caa6ab4941d19df9629f5500af86deb");
        } else {
            com.meituan.android.paybase.utils.u.a(str, str2, exc, c(str3));
        }
    }

    public static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a44dd076b1c937e5982a937d11b3192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a44dd076b1c937e5982a937d11b3192");
        } else {
            ae.a(null, str, map, "c_pay_dmfidr05", c(str2), true);
        }
    }

    public static void a(@NonNull String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, null, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3df933cc199ef2ae56fed11e3ef5abce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3df933cc199ef2ae56fed11e3ef5abce");
        } else {
            ae.a(str, str2, null, map, ae.a.CLICK, 0, c(str4), true);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53fb79a5af94b9542d40049ea3743a1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53fb79a5af94b9542d40049ea3743a1d");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, null, null, c(str2));
        }
    }

    public static void b(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0e4dd51d6e69ca55c12b5f84cb3f98f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0e4dd51d6e69ca55c12b5f84cb3f98f");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, null, null, c(str2));
        }
    }

    public static void a(String str, Exception exc, String str2) {
        Object[] objArr = {str, exc, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04bb91e351c715b3e3f9a936c50e0b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04bb91e351c715b3e3f9a936c50e0b29");
            return;
        }
        HashMap hashMap = new HashMap();
        if (exc instanceof PayException) {
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(((PayException) exc).getCode()));
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(str, hashMap, null, c(str2));
    }

    public static void a(String str, Map<String, Object> map, List<Float> list, String str2) {
        Object[] objArr = {str, null, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "281b7613ee360a9bc21434aa070c46f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "281b7613ee360a9bc21434aa070c46f6");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, null, null, c(str2));
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3a6b49e7431d3a329279bd84295d950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3a6b49e7431d3a329279bd84295d950");
            return;
        }
        b = System.currentTimeMillis();
        a("b_pay_hybrid_mt_pay_start_sc", (Map<String, Object>) null, str);
        a("hybrid_mt_pay_start", (Map<String, Object>) null, (List<Float>) null, str);
    }

    public static long a() {
        return b;
    }
}
