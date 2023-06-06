package com.sankuai.waimai.business.knb.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39efa0262f88f0fc3ba599b02aa06f4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39efa0262f88f0fc3ba599b02aa06f4b");
        }
        if (1 == com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a.getApplicationContext(), "app_embedded_h5_with_region_info", 0)) {
            return com.sankuai.waimai.router.set_id.b.a().b();
        }
        return null;
    }
}
