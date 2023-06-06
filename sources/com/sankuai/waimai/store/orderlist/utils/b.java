package com.sankuai.waimai.store.orderlist.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.OrderListMonitor;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14f71a10bd2d7109ef723c0db6c21e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14f71a10bd2d7109ef723c0db6c21e0f");
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(OrderListMonitor.RouterException, str, hashMap.toString());
        }
    }
}
