package com.meituan.android.pike.taskqueue;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4cb5d27b036c7ffd4a1ede88f585415", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4cb5d27b036c7ffd4a1ede88f585415")).longValue();
        }
        if (b) {
            return SystemClock.elapsedRealtime();
        }
        return System.currentTimeMillis();
    }
}
