package com.sankuai.meituan.mtliveqos;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    @Deprecated
    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z) {
        Object[] objArr = {context, bVar, map, map2, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91b81ac7a4228fe2260f9d92c1d0ed0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91b81ac7a4228fe2260f9d92c1d0ed0a");
            return;
        }
        Map<String, String> hashMap = map2 == null ? new HashMap<>() : map2;
        HashMap hashMap2 = new HashMap();
        hashMap.put("MTLIVE_IS_PUSH", z ? "push" : "play");
        hashMap2.put("MTLIVE_LIVE_TYPE", bVar.d.l + CommonConstant.Symbol.UNDERLINE + hashMap.get("MTLIVE_IS_PUSH"));
        hashMap2.put("MTLIVE_METRIC_SOURCE", String.valueOf(bVar.e.h));
        com.sankuai.meituan.mtliveqos.common.e.a(context, bVar, map, hashMap);
    }
}
