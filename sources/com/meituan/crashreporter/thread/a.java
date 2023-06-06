package com.meituan.crashreporter.thread;

import com.meituan.crashreporter.c;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements Runnable {
    public static ChangeQuickRedirect c;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3694525c6003073bf274ac5fa1aa78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3694525c6003073bf274ac5fa1aa78");
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            c.a(th, 1, Constants.CATCH_EXCEPTION_NAME, false);
        }
    }
}
