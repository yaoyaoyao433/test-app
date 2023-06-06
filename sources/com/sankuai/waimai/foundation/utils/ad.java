package com.sankuai.waimai.foundation.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ad {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !ad.class.desiredAssertionStatus();
    private static final Object c = new Object();
    private static boolean d;
    private static Handler e;
    private static boolean f;

    private static Handler c() {
        Handler handler;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d894779a46583a8c722a7ce0b1829a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d894779a46583a8c722a7ce0b1829a4");
        }
        synchronized (c) {
            if (e == null) {
                if (d) {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
                e = new Handler(Looper.getMainLooper());
            }
            handler = e;
        }
        return handler;
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2197aaf8f643a24515000837ecee1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2197aaf8f643a24515000837ecee1f5");
        } else if (b()) {
            runnable.run();
        } else {
            c().post(runnable);
        }
    }

    public static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f304609ce51cb5de1264ca0cc531f30e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f304609ce51cb5de1264ca0cc531f30e");
        } else {
            c().removeCallbacks(runnable);
        }
    }

    public static void c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c118310f8f1f347f35047be8b07507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c118310f8f1f347f35047be8b07507");
        } else {
            c().post(runnable);
        }
    }

    public static void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dfe9d591738c47a6b3dd23be1efb0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dfe9d591738c47a6b3dd23be1efb0a7");
        } else {
            c().postDelayed(runnable, j);
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c7b21aa5d0a529304569a7e79cee59f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c7b21aa5d0a529304569a7e79cee59f");
        } else if (!f && !b()) {
            throw new IllegalStateException("Must be called on the UI thread.");
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a07302633a291893c44165e64539f37c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a07302633a291893c44165e64539f37c")).booleanValue() : c().getLooper() == Looper.myLooper();
    }
}
