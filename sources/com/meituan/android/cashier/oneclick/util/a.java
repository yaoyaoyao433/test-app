package com.meituan.android.cashier.oneclick.util;

import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, Long> b = new HashMap<>();

    public static void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7763b039095ba114da67a2661c63fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7763b039095ba114da67a2661c63fac");
            return;
        }
        b.put(str, Long.valueOf(System.currentTimeMillis()));
        ae.a(null, str2, map, "c_pay_dn1isv21", "com.meituan.android.cashier.common.CashierStaticsUtils", true);
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bdaebded8b315aeec184423245a2d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bdaebded8b315aeec184423245a2d1e");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> map2 = map;
        if (!map2.containsKey("duration") && b.containsKey(str)) {
            map2.put("duration", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
        }
        ae.a(null, str2, map2, "c_pay_dn1isv21", "com.meituan.android.cashier.common.CashierStaticsUtils", true);
    }

    public static void a(String str, String str2, Exception exc) {
        Map hashMap;
        Object[] objArr = {str, str2, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34ed2449b12deaf02d1222016cdcf67b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34ed2449b12deaf02d1222016cdcf67b");
            return;
        }
        HashMap hashMap2 = new HashMap();
        if (b.containsKey(str)) {
            hashMap2.put("duration", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
        }
        Object[] objArr2 = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1aa80d456f37aefa3ab5b2a727c61bc5", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1aa80d456f37aefa3ab5b2a727c61bc5");
        } else {
            hashMap = new HashMap();
            if (exc instanceof PayException) {
                hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(((PayException) exc).getCode()));
            } else {
                hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, -2);
            }
            hashMap.put(NetLogConstants.Details.ERROR_MSG, exc.getMessage());
        }
        hashMap2.putAll(hashMap);
        ae.a(null, str2, hashMap2, "c_pay_dn1isv21", "com.meituan.android.cashier.common.CashierStaticsUtils", true);
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "014ad0fd0f6594fa259db2f4cf52ed57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "014ad0fd0f6594fa259db2f4cf52ed57");
        } else {
            ae.a(null, str, map, "c_pay_dn1isv21", "com.meituan.android.cashier.common.CashierStaticsUtils", true);
        }
    }
}
