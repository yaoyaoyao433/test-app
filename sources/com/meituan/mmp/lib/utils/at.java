package com.meituan.mmp.lib.utils;

import android.os.HandlerThread;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class at extends HandlerThread {
    public static ChangeQuickRedirect a;

    public at(String str, int i) {
        super(str, -2);
        Object[] objArr = {str, -2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99ef9eab321fc5b5ad2ef76016637fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99ef9eab321fc5b5ad2ef76016637fa");
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28291b91dbbcf1a0ae6dd61c467fe5b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28291b91dbbcf1a0ae6dd61c467fe5b2");
            return;
        }
        try {
            super.run();
        } catch (Throwable th) {
            a(th);
            com.meituan.mmp.lib.trace.b.d(getName(), th.getMessage());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca55c7e86a9675254fa154ddc87c5b47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca55c7e86a9675254fa154ddc87c5b47");
                return;
            }
            while (!z) {
                try {
                    Looper.loop();
                    z = true;
                } catch (Throwable th2) {
                    a(th2);
                    com.meituan.mmp.lib.trace.b.d(getName(), th2.getMessage());
                }
            }
        }
    }

    private void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f4198f79f028c0a2bc485425a45f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f4198f79f028c0a2bc485425a45f83");
        } else if (getUncaughtExceptionHandler() != null) {
            getUncaughtExceptionHandler().uncaughtException(this, th);
        }
    }
}
