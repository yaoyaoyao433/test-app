package com.sankuai.meituan.mtliveqos;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f1649b6a0522bdfe52b48ddb29c109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f1649b6a0522bdfe52b48ddb29c109");
            return;
        }
        com.sankuai.meituan.mtliveqos.common.e.a(context, str, str2, new com.sankuai.meituan.mtliveqos.statistic.b(), new HashMap(), new HashMap());
    }

    public static void a(Context context, String str, String str2, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, str, str2, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50bd1df374553625fe13132f1dcbc533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50bd1df374553625fe13132f1dcbc533");
            return;
        }
        HashMap hashMap = map == null ? new HashMap() : map;
        HashMap hashMap2 = map2 == null ? new HashMap() : map2;
        hashMap2.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        hashMap2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, str, str2, bVar, hashMap, hashMap2);
    }

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46a74aa44032de7f511ce6a3f635c629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46a74aa44032de7f511ce6a3f635c629");
            return;
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.put("MTLIVE_LIVE_TYPE", String.valueOf(bVar.d.l));
        map2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.b(context, bVar, map, map2);
    }

    public static void a(@NonNull Context context, @NonNull Map<String, String> map, @NonNull String str) {
        Object[] objArr = {context, map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8aa156ef5e20e5f8b289c51f1894479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8aa156ef5e20e5f8b289c51f1894479");
        } else {
            com.sankuai.meituan.mtliveqos.common.e.a(context, map, str);
        }
    }
}
