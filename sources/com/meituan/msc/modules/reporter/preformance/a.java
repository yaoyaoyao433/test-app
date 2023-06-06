package com.meituan.msc.modules.reporter.preformance;

import android.os.SystemClock;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static long b;
    private static long c;

    private static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01f3321d6d26a690d36d660d82cc9464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01f3321d6d26a690d36d660d82cc9464");
            return;
        }
        if (b == 0) {
            b = TimeUtil.processStartElapsedTimeMillis();
        }
        if (c == 0) {
            c = b;
        }
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcaf8c79170ecc7e13b6ade90a172fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcaf8c79170ecc7e13b6ade90a172fd7")).longValue();
        }
        c();
        return c;
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd4c036db0963315242d762451b87b55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd4c036db0963315242d762451b87b55")).longValue();
        }
        c();
        return SystemClock.elapsedRealtime() - c;
    }
}
