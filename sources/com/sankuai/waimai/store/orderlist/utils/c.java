package com.sankuai.waimai.store.orderlist.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "901da79b96ec9463daaa95ca5e0fddda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "901da79b96ec9463daaa95ca5e0fddda");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", String.valueOf(j));
        hashMap.put("trade_number", str);
        hashMap.put("pay_token", str2);
        b.a("router pay page error", hashMap);
    }
}
