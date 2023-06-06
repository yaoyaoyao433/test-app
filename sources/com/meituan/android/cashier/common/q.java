package com.meituan.android.cashier.common;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d82a1a11e7323f99a2f3d205ffc250", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d82a1a11e7323f99a2f3d205ffc250") : "c_pay_dmfidr05";
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "849832e193e84c6cd27b1cd44eaf4299", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "849832e193e84c6cd27b1cd44eaf4299");
        }
        if (TextUtils.isEmpty(str)) {
            return "com.meituan.android.cashier.common.CashierStaticsUtils";
        }
        return "com.meituan.android.cashier.common.CashierStaticsUtils_" + str;
    }

    public static void a(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3303d9450d89ead41cbdf976703fa63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3303d9450d89ead41cbdf976703fa63");
            return;
        }
        b(str);
        ae.a("com.meituan.android.cashier.common.CashierStaticsUtils", hashMap);
        ae.a(a(str), hashMap);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63965de972f96911a5dfa0bf51f7aecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63965de972f96911a5dfa0bf51f7aecd");
            return;
        }
        ae.a(a(str));
        ae.a("com.meituan.android.cashier.common.CashierStaticsUtils");
    }

    public static HashMap<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4174ecbe00e2080fb5c440799772b3b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4174ecbe00e2080fb5c440799772b3b9");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ae.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "74ebe7547b080d7d824a879f69ebf5c2", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "74ebe7547b080d7d824a879f69ebf5c2") : x.a();
    }

    public static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb2d5dd8ad3c73d5690b1ad6c5c4d367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb2d5dd8ad3c73d5690b1ad6c5c4d367");
        } else {
            ae.a(str, map, a(str2));
        }
    }

    public static void a(String str, Map<String, Object> map, String str2, String str3) {
        Object[] objArr = {str, map, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a4154b082cbb0226cbe8abc66833b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a4154b082cbb0226cbe8abc66833b34");
        } else {
            ae.a(str, map, str2, a(str3));
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map, ae.a aVar, String str4) {
        Object[] objArr = {str, str2, str3, map, aVar, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93547bbd67816800c7c07ae970848210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93547bbd67816800c7c07ae970848210");
        } else {
            ae.a(str, str2, str3, map, aVar, -1, a(str4));
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26ab70f9d1f79f98c547a4e42e478d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26ab70f9d1f79f98c547a4e42e478d1f");
        } else {
            com.meituan.android.paybase.utils.u.a(str, str2, map, a(str3));
        }
    }

    public static void b(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b525862c1eecff46c1bfa470988e621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b525862c1eecff46c1bfa470988e621");
        } else {
            com.meituan.android.paybase.utils.u.b(str, str2, map, a(str3));
        }
    }

    public static void a(String str, String str2, Exception exc, String str3) {
        Object[] objArr = {str, str2, exc, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e5975a0581482455ad17e358d105f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e5975a0581482455ad17e358d105f30");
        } else {
            com.meituan.android.paybase.utils.u.a(str, str2, exc, a(str3));
        }
    }

    public static void a(@NonNull String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, str3, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33f212a981a49645dc0d5e94c4c6186e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33f212a981a49645dc0d5e94c4c6186e");
        } else {
            ae.a(str, str2, str3, map, ae.a.VIEW, 0, a(str4), true);
        }
    }

    public static void b(@NonNull String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, str3, map, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce6365f4c1021334823cc76e55e9f8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce6365f4c1021334823cc76e55e9f8cd");
        } else {
            ae.a(str, str2, str3, map, ae.a.CLICK, 0, a(str4), true);
        }
    }

    public static void b(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98a24126c5de58ccd95ea36d00525534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98a24126c5de58ccd95ea36d00525534");
        } else {
            ae.a(null, str, map, b(), a(str2), true);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72c97f94727d4538bc25cf9f494f9960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72c97f94727d4538bc25cf9f494f9960");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, null, null, a(str2));
        }
    }

    public static void c(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e30dd011e6cc76496649544fc6c4b836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e30dd011e6cc76496649544fc6c4b836");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, a(str2));
        }
    }

    public static void a(String str, Exception exc, String str2) {
        Object[] objArr = {str, exc, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67001cdd44fa14f55b7a4cfd0b0ce2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67001cdd44fa14f55b7a4cfd0b0ce2bd");
            return;
        }
        HashMap hashMap = new HashMap();
        if (exc instanceof PayException) {
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(((PayException) exc).getCode()));
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(str, hashMap, null, a(str2));
    }

    public static void a(String str, Map<String, Object> map, List<Float> list, String str2) {
        Object[] objArr = {str, map, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "031e1ab9d0a68230853abbf4a0a3bdbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "031e1ab9d0a68230853abbf4a0a3bdbe");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, a(str2));
        }
    }
}
