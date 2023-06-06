package com.sankuai.meituan.mtliveqos;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, com.sankuai.meituan.mtliveqos.statistic.c cVar, Map<String, String> map) {
        Object[] objArr = {context, bVar, cVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0616db1b09f40b93a70a8a9f7fd73b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0616db1b09f40b93a70a8a9f7fd73b5f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_LIVE_TYPE", bVar.d.l);
        hashMap.put("MTLIVE_METRIC_SOURCE", bVar.e.h);
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, cVar, hashMap);
    }

    @Deprecated
    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3) {
        Object[] objArr = {context, bVar, map, map2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce9bd3e956b34d589f49a38929a0263f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce9bd3e956b34d589f49a38929a0263f");
            return;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        map2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, map, map2);
    }

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f44cc7f918b6241786fc3370f077a8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f44cc7f918b6241786fc3370f077a8cd");
            return;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        map2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, map, map2);
    }

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, String str, String str2, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, bVar, str, str2, map, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0aee2e31d05a40ab759be44acbdacaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0aee2e31d05a40ab759be44acbdacaa");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        hashMap.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, str, str2, map, hashMap);
    }
}
