package com.meituan.android.pay.common.analyse;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "";

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fa2d517c83f359d2929a946d276abff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fa2d517c83f359d2929a946d276abff");
        }
        if (TextUtils.isEmpty(str)) {
            return "com.meituan.android.pay.common.analyse.MtPaymentStaticsUtils";
        }
        return "com.meituan.android.pay.common.analyse.MtPaymentStaticsUtils_" + str;
    }

    public static void a(String str) {
        b = str;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b23d6b52216efae3056cadf00247b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b23d6b52216efae3056cadf00247b81");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2dd942e6549cf5876306451083f57aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2dd942e6549cf5876306451083f57aa7");
        } else {
            ae.a("com.meituan.android.pay.common.analyse.MtPaymentStaticsUtils");
            ae.a(c(str));
        }
        ae.a("com.meituan.android.pay.common.analyse.MtPaymentStaticsUtils", a());
        ae.a(c(str), a());
    }

    public static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45d1a6947ffff40de2a4f188bf00eb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45d1a6947ffff40de2a4f188bf00eb4a");
        } else {
            ae.a(str, map, c(str2));
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map, ae.a aVar, String str4) {
        Object[] objArr = {str, str2, str3, map, aVar, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2f943ca30d56f9fa6ef77a790e37a39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2f943ca30d56f9fa6ef77a790e37a39");
            return;
        }
        HashMap hashMap = map == null ? new HashMap() : map;
        hashMap.putAll(a());
        ae.a(str, str2, str3, hashMap, aVar, -1, c(str4));
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map, ae.a aVar, int i, String str4) {
        Object[] objArr = {str, str2, str3, map, aVar, -1, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4998ad9a1ccbcb612dffa42a804683f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4998ad9a1ccbcb612dffa42a804683f3");
            return;
        }
        HashMap hashMap = map == null ? new HashMap() : map;
        hashMap.putAll(a());
        ae.a(str, str2, str3, hashMap, aVar, -1, c(str4));
    }

    private static HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf22a8fa0966d57fe7dc541d0edbaf37", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf22a8fa0966d57fe7dc541d0edbaf37");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        hashMap.put("merchant_no", b);
        hashMap.put("qdb_no", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999");
        hashMap.put("mtpay_scene", a.b);
        return hashMap;
    }

    public static void b(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a415e1721c5a163c55f381f579adb66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a415e1721c5a163c55f381f579adb66");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        ae.a(null, str, map, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3c29a0529558b76a74600c0d71fc7b76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3c29a0529558b76a74600c0d71fc7b76") : "c_pay_dmfidr05", c(str2), true);
    }

    public static void a(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "731cfef0c0b7dd87edcce1548a3bdef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "731cfef0c0b7dd87edcce1548a3bdef1");
        } else {
            ae.a(null, str2, map, str, c(str3), true);
        }
    }

    public static void a(@NonNull String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, str3, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec98737b33a0c09e79b48f9f39b7e999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec98737b33a0c09e79b48f9f39b7e999");
        } else {
            ae.a(str, str2, str3, map, ae.a.VIEW, 0, c(str4), true);
        }
    }

    public static void b(@NonNull String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, str3, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c40be0f27be0d74a12dee209309aa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c40be0f27be0d74a12dee209309aa3");
        } else {
            ae.a(str, str2, str3, map, ae.a.CLICK, 0, c(str4), true);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fefdbd966ba37a70a621b09a37b7ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fefdbd966ba37a70a621b09a37b7ec9");
        } else {
            u.a(str, str2, map, c(str3));
        }
    }

    public static void c(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d831d9d9a7f42a2c925ace44a9f069fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d831d9d9a7f42a2c925ace44a9f069fb");
        } else {
            u.b(str, str2, map, c(str3));
        }
    }

    public static void a(String str, String str2, Exception exc, String str3) {
        Object[] objArr = {str, str2, exc, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fdedfb97e52cef557ddfc01d3a28d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fdedfb97e52cef557ddfc01d3a28d1f");
        } else {
            u.a(str, str2, exc, c(str3));
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a61aa1cd658702ae1ce62949f01f949f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a61aa1cd658702ae1ce62949f01f949f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qdb_no", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999");
        com.meituan.android.paybase.common.analyse.cat.a.a(str, hashMap, null, c(str2));
    }

    public static void c(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73a21229482bdb44dc7746dc552f3c02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73a21229482bdb44dc7746dc552f3c02");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("qdb_no", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999");
        com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, c(str2));
    }

    public static void a(String str, Exception exc, String str2) {
        Object[] objArr = {str, exc, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25c0fe6eaaa9d9301b1b8f81d5bd32be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25c0fe6eaaa9d9301b1b8f81d5bd32be");
            return;
        }
        HashMap hashMap = new HashMap();
        if (exc instanceof PayException) {
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(((PayException) exc).getCode()));
        }
        hashMap.put("qdb_no", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999");
        com.meituan.android.paybase.common.analyse.cat.a.a(str, hashMap, null, c(str2));
    }

    public static void a(String str, Map<String, Object> map, List<Float> list, String str2) {
        Object[] objArr = {str, map, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8e471da43e11be10af29fbea33d2b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8e471da43e11be10af29fbea33d2b6c");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, c(str2));
        }
    }
}
