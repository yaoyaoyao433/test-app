package com.sankuai.meituan.mapsdk.mapcore.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Handler b;

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c30bba9bba325622083c30da3663d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c30bba9bba325622083c30da3663d1c");
            return;
        }
        Object[] objArr2 = {runnable, 0L};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3e994ef4412ff5860a6cf58f37b3027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3e994ef4412ff5860a6cf58f37b3027");
        } else if (runnable != null) {
            if (a()) {
                runnable.run();
            } else {
                a(runnable, 0L);
            }
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9251a39036474142cd31a089d6208fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9251a39036474142cd31a089d6208fc6");
        } else {
            a(runnable, 0L);
        }
    }

    private static void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f9a8f4eaa6dc34dcfee1e4871416e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f9a8f4eaa6dc34dcfee1e4871416e79");
            return;
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.postDelayed(runnable, j);
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d07f5333f51bc4b4bc961965acd1ce39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d07f5333f51bc4b4bc961965acd1ce39")).booleanValue();
        }
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return Thread.currentThread() == b.getLooper().getThread();
    }
}
