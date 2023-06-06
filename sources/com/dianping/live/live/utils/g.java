package com.dianping.live.live.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static g b;

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0764ff36ef89d61cdc8795bf67fa8a06", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0764ff36ef89d61cdc8795bf67fa8a06");
        }
        if (b == null) {
            b = new g();
        }
        return b;
    }
}
