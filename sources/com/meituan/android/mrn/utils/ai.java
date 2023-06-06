package com.meituan.android.mrn.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private static final Handler b = new Handler(Looper.getMainLooper());

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d26d225cf7641134f84b7c041d4c67af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d26d225cf7641134f84b7c041d4c67af")).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3421377ae12147ce3be98e6e848ccef5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3421377ae12147ce3be98e6e848ccef5");
        } else if (a()) {
            runnable.run();
        } else {
            b.post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e8b5f87931772bb4843828014f4a64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e8b5f87931772bb4843828014f4a64f");
        } else if (runnable == null) {
        } else {
            b.postDelayed(runnable, j);
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffcdc4d295962c09131dcb4973ac4355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffcdc4d295962c09131dcb4973ac4355");
        } else if (runnable != null) {
            b.removeCallbacks(runnable);
        }
    }
}
