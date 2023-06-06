package com.sankuai.meituan.mtliveqos;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, com.sankuai.meituan.mtliveqos.statistic.c cVar, Map<String, String> map) {
        Object[] objArr = {context, bVar, cVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6077c7fb2adbf4ff98a1f42a5cf93bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6077c7fb2adbf4ff98a1f42a5cf93bd9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_LIVE_TYPE", bVar.d.l);
        hashMap.put("MTLIVE_METRIC_SOURCE", bVar.e.h);
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, cVar, hashMap);
    }

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "966327f8a5031b095f403d4e9999dd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "966327f8a5031b095f403d4e9999dd3d");
            return;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        map2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, map, map2);
    }

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, String str, String str2, Map<String, String> map) {
        Object[] objArr = {context, bVar, str, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ace3e267783c1d4fbc5dabdc8eaff77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ace3e267783c1d4fbc5dabdc8eaff77");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        hashMap.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, str, str2, hashMap);
    }
}
