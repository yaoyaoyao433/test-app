package com.meituan.android.paybase.utils;

import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private static final HashMap<String, Long> b = new HashMap<>();

    public static void a(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f768a47e7038a74e9479938a379fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f768a47e7038a74e9479938a379fba");
            return;
        }
        b.put(str, Long.valueOf(System.currentTimeMillis()));
        ae.a(null, str2, map, "c_pay_uk88e8gh", str3, true);
    }

    public static void b(String str, String str2, Map<String, Object> map, String str3) {
        Object[] objArr = {str, str2, map, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df1a831831385641a70e8c646d2a7278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df1a831831385641a70e8c646d2a7278");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> map2 = map;
        if (!map2.containsKey("duration") && b.containsKey(str)) {
            map2.put("duration", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
        }
        map2.putAll(y.a(str));
        ae.a(null, str2, map2, "c_pay_uk88e8gh", str3, true);
    }

    public static void a(String str, String str2, Exception exc, String str3) {
        Map map;
        Object[] objArr = {str, str2, exc, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42b2e734850d89b6020eed4cf11e5a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42b2e734850d89b6020eed4cf11e5a93");
            return;
        }
        HashMap hashMap = new HashMap();
        if (b.containsKey(str)) {
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b.get(str).longValue()));
        }
        Object[] objArr2 = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0f8942f0b8c488c5867cfc2be9447181", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0f8942f0b8c488c5867cfc2be9447181");
        } else {
            HashMap hashMap2 = new HashMap();
            if (exc instanceof PayException) {
                hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(((PayException) exc).getCode()));
            } else {
                hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, -2);
            }
            hashMap2.put(NetLogConstants.Details.ERROR_MSG, exc.getMessage());
            map = hashMap2;
        }
        hashMap.putAll(map);
        hashMap.putAll(y.a(str));
        ae.a(null, str2, hashMap, "c_pay_uk88e8gh", str3, true);
    }
}
