package com.meituan.android.hybridcashier.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile Boolean b;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8107bad28e95d2c7d15c4756a9ce02a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8107bad28e95d2c7d15c4756a9ce02a6")).booleanValue();
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = Boolean.valueOf(Boolean.parseBoolean(String.valueOf(com.meituan.android.neohybrid.neo.tunnel.a.a().e("device_rooted"))));
                }
            }
        }
        return b.booleanValue();
    }
}
