package com.meituan.msc.uimanager;

import com.meituan.msc.common.ClearableSynchronizedPool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ay {
    public static ChangeQuickRedirect a;
    private static final Object b = new Object();
    private static ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> c;
    private static ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> d;
    private static com.meituan.android.msc.yoga.c e;

    private static ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> b() {
        ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> clearableSynchronizedPool;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a034e34237baa8b3436905669f897161", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClearableSynchronizedPool) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a034e34237baa8b3436905669f897161");
        }
        if (d != null) {
            return d;
        }
        synchronized (b) {
            if (d == null) {
                d = new ClearableSynchronizedPool<>(1024);
            }
            clearableSynchronizedPool = d;
        }
        return clearableSynchronizedPool;
    }

    private static ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> c() {
        ClearableSynchronizedPool<com.meituan.android.msc.yoga.o> clearableSynchronizedPool;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3afecf18587c87a34ebd8f5f6d0b804", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClearableSynchronizedPool) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3afecf18587c87a34ebd8f5f6d0b804");
        }
        if (c != null) {
            return c;
        }
        synchronized (b) {
            if (c == null) {
                c = new ClearableSynchronizedPool<>(1024);
            }
            clearableSynchronizedPool = c;
        }
        return clearableSynchronizedPool;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5536b518729e5354c52aa055517d612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5536b518729e5354c52aa055517d612");
            return;
        }
        e = null;
        c().a();
        b().a();
    }
}
