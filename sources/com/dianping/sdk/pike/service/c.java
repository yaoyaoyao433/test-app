package com.dianping.sdk.pike.service;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;
    private final Handler c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259c4ae5b6a9610a8822056069dd4aea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259c4ae5b6a9610a8822056069dd4aea");
        } else {
            this.c = new Handler(Looper.getMainLooper());
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "090b7360a450ca5741ab044b1d68b55d", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "090b7360a450ca5741ab044b1d68b55d");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993b18f899e344756437ea8d794e5771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993b18f899e344756437ea8d794e5771");
        } else {
            a(runnable, 0L);
        }
    }

    private void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec18d714ae59e23c424f02547d562890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec18d714ae59e23c424f02547d562890");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }

    public final void a(final com.dianping.sdk.pike.a aVar, final String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1dd482753f6c958cf7d3c2fcbbaa439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1dd482753f6c958cf7d3c2fcbbaa439");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "961f34c0244eab1c18047911fbcedf12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "961f34c0244eab1c18047911fbcedf12");
                    } else if (aVar != null) {
                        aVar.a(str);
                    }
                }
            });
        }
    }

    public final void a(final com.dianping.sdk.pike.a aVar, final int i, final String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a227976db9960c9bbf46dea6ea382932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a227976db9960c9bbf46dea6ea382932");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3762c9cfc746b7ec6d5e756d49e15849", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3762c9cfc746b7ec6d5e756d49e15849");
                    } else if (aVar != null) {
                        aVar.a(i, str);
                    }
                }
            });
        }
    }
}
