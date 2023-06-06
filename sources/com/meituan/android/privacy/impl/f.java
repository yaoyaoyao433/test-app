package com.meituan.android.privacy.impl;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final AtomicInteger b = new AtomicInteger(0);
    private static volatile long c = -1;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61deeeab4c0cc285bfecbbdd80280d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61deeeab4c0cc285bfecbbdd80280d26");
        } else {
            b.getAndIncrement();
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fbd281f6d7ef0d7e972a08e5b352388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fbd281f6d7ef0d7e972a08e5b352388");
            return;
        }
        b.getAndDecrement();
        c = SystemClock.elapsedRealtime();
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e17a5994bb58d1192feb9ae7080a73f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e17a5994bb58d1192feb9ae7080a73f8");
            return;
        }
        b.set(0);
        c = -1L;
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d00d1a9fddbb7edce514938c33982f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d00d1a9fddbb7edce514938c33982f1")).booleanValue() : b.get() > 0 || SystemClock.elapsedRealtime() - c < 1000;
    }
}
