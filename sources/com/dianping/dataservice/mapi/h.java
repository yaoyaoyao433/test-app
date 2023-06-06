package com.dianping.dataservice.mapi;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public static i b;

    public static i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de0ba542c2e0c12cfe3512d93308bb1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de0ba542c2e0c12cfe3512d93308bb1a");
        }
        if (b == null) {
            throw new IllegalStateException("must config MApiServiceProvider by MApiServiceConfig.config()");
        }
        return b;
    }
}
