package com.meituan.android.yoda.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t {
    public static ChangeQuickRedirect a;
    public static long b;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35291e7b966956c97d738a0f3626a8a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35291e7b966956c97d738a0f3626a8a3")).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        b = currentTimeMillis;
        return currentTimeMillis;
    }
}
