package com.sankuai.waimai.store.util;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ag {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, long j, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {str, str2, new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29a5188e28432d833c1f5507074c6760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29a5188e28432d833c1f5507074c6760");
        } else if (aVar != null) {
            try {
                Babel.log(new Log.Builder("").reportChannel(str).tag(str2).optional(a(aVar)).value(j).generalChannelStatus(true).build());
            } catch (Exception unused) {
            }
        }
    }

    private static Map<String, Object> a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fb32704b24652f40c7677d47f892afc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fb32704b24652f40c7677d47f892afc");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isHome", Boolean.valueOf(aVar.y));
        hashMap.put("isMinuteBuy", Boolean.valueOf(aVar.aS));
        hashMap.put("gSource", aVar.m);
        hashMap.put("navigateType", Long.valueOf(aVar.c));
        hashMap.putAll(aVar.aA);
        return hashMap;
    }
}
