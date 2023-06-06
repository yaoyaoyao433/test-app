package com.meituan.android.customerservice.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        public static Handler a = new Handler(Looper.getMainLooper());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ScheduledExecutorService a = com.sankuai.android.jarvis.c.b("IMSDK-ThreadPools", 2);
    }

    public static void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05cfb32a0544fd86a3fd7dff202b4dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05cfb32a0544fd86a3fd7dff202b4dc4");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.customerservice.utils.f.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c6724c6ea73f826a7b32a523ce640f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c6724c6ea73f826a7b32a523ce640f0");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        c.b(f.class, "AsyncThread exec task error:" + e.toString());
                    }
                }
            });
        }
    }

    public static void a(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "278ee5db087cbf8284db091c6f915801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "278ee5db087cbf8284db091c6f915801");
        } else {
            b.a.schedule(new Runnable() { // from class: com.meituan.android.customerservice.utils.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc19c866ac1971206934a1d32708a300", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc19c866ac1971206934a1d32708a300");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        c.b(f.class, "AsyncThread exec task error:" + e.toString());
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    public static void b(final Runnable runnable) {
        boolean z = true;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f87938bbf2d5cb5ef52b0b6b8fa5471c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f87938bbf2d5cb5ef52b0b6b8fa5471c");
            return;
        }
        Runnable runnable2 = new Runnable() { // from class: com.meituan.android.customerservice.utils.f.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86599b7e8a1947db93a76614ec70e93e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86599b7e8a1947db93a76614ec70e93e");
                    return;
                }
                try {
                    runnable.run();
                } catch (Exception e) {
                    c.b(f.class, "MainThread exec task error:" + e.toString());
                }
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a22dee502df235774603ea853c341bff", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a22dee502df235774603ea853c341bff")).booleanValue();
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            z = false;
        }
        if (z) {
            runnable2.run();
        } else {
            a.a.post(runnable2);
        }
    }

    public static void b(final Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "613c89b3438a36cf4ac60f333f786c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "613c89b3438a36cf4ac60f333f786c98");
        } else {
            a.a.postDelayed(new Runnable() { // from class: com.meituan.android.customerservice.utils.f.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25796f57df6b06c80c439db20550042c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25796f57df6b06c80c439db20550042c");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        c.b(f.class, "MainThread exec task error:" + e.toString());
                    }
                }
            }, j);
        }
    }

    public static Handler a() {
        return a.a;
    }
}
