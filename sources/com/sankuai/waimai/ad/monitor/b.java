package com.sankuai.waimai.ad.monitor;

import android.text.TextUtils;
import com.dianping.monitor.impl.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.e;
import com.sankuai.waimai.ad.gray.b;
import com.sankuai.waimai.report.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Map<String, Object> map, String str, String str2) {
        Object[] objArr = {map, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac6a065474979dafe9196a1766a5b080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac6a065474979dafe9196a1766a5b080");
            return;
        }
        b.C0676b c0676b = com.sankuai.waimai.ad.gray.b.a().b;
        if (c0676b == null || !c0676b.a || map == null || com.sankuai.waimai.report.a.a(map) <= 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!map.containsKey("dynBundleId")) {
            map.put("dynBundleId", str);
        }
        if (map.containsKey("dynBundleVer")) {
            return;
        }
        map.put("dynBundleVer", str2);
    }

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a4170621e3013e7342698cdda6691ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a4170621e3013e7342698cdda6691ca");
        }
        b.C0676b c0676b = com.sankuai.waimai.ad.gray.b.a().b;
        if (c0676b == null || !c0676b.a || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        HashMap hashMap = new HashMap();
        if (!str.contains("dynBundleId")) {
            hashMap.put("dynBundleId", str2);
        }
        if (!str.contains("dynBundleVer")) {
            hashMap.put("dynBundleVer", str3);
        }
        return !hashMap.isEmpty() ? e.a(str, hashMap) : str;
    }

    public static void a(String str, String str2, int i, String str3, String str4) {
        b.C0676b c0676b;
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0f696b90e95ca55650331733e6074cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0f696b90e95ca55650331733e6074cd");
            return;
        }
        boolean equals = TextUtils.equals(str2, "LX");
        if ((!equals || i > 0) && (c0676b = com.sankuai.waimai.ad.gray.b.a().b) != null && c0676b.b) {
            if (TextUtils.isEmpty(str)) {
                str = "unknown";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = "unknown";
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = "unknown";
            }
            l a2 = c.a().a("eventId", str).a("channel", str2).a("adType", String.valueOf(i)).a("templateId", str3).a("bundleVersion", str4);
            a2.a("templateId-eventId", str3 + CommonConstant.Symbol.MINUS + str).a("MadsReportMonitor", Collections.singletonList(Float.valueOf(equals ? 0.0f : 1.0f))).a();
        }
    }
}
