package com.meituan.mtwebkit.internal;

import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7f228c4afb0b1322df2576d27d8d7f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7f228c4afb0b1322df2576d27d8d7f7");
            return;
        }
        try {
            Metrics.storeCrash(th, 1, MetricsActivityLifecycleManager.currentActivity, false);
        } catch (Throwable unused) {
        }
    }
}
