package com.meituan.metrics.util.thread;

import com.meituan.crashreporter.c;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class Task implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void schedule();

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "937e07d1a2ddef253e0975011a646337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "937e07d1a2ddef253e0975011a646337");
            return;
        }
        try {
            schedule();
        } catch (Throwable th) {
            c.a(th, 1, Constants.CATCH_EXCEPTION_NAME, false);
        }
    }
}
