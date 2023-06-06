package com.dianping.live.live.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6efdf9aa31e4f34a356cbf31134d5732", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6efdf9aa31e4f34a356cbf31134d5732")).longValue() : com.meituan.android.singleton.a.a().b();
    }

    public static double b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe1b4538c6c75e6dcd0aca0af869e069", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe1b4538c6c75e6dcd0aca0af869e069")).doubleValue() : com.sankuai.waimai.foundation.location.v2.g.a().i().getLatitude();
    }

    public static double c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "330e7b01a386e36f6eb7c9347ad1b282", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "330e7b01a386e36f6eb7c9347ad1b282")).doubleValue() : com.sankuai.waimai.foundation.location.v2.g.a().i().getLongitude();
    }
}
