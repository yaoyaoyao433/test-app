package com.meituan.mmp.lib.preformance;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a6c7819ad837168cb3807b5531cbe57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a6c7819ad837168cb3807b5531cbe57");
            return;
        }
        if (b == 0) {
            b = TimeUtil.processStartElapsedTimeMillis();
        }
        if (c == 0) {
            c = b;
        }
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4e2f45e803c601779c4c9c974d36321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4e2f45e803c601779c4c9c974d36321");
        } else if (c == 0 || c > j) {
            c = j;
        }
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3418232a68594d48edcc8693620cc093", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3418232a68594d48edcc8693620cc093")).longValue();
        }
        c();
        return c;
    }

    public static long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "107a878cf6c454c79348f74f05bc7fde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "107a878cf6c454c79348f74f05bc7fde")).longValue();
        }
        c();
        return SystemClock.elapsedRealtime() - c;
    }
}
