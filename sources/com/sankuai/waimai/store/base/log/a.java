package com.sankuai.waimai.store.base.log;

import com.meituan.crashreporter.c;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b12488c89581b997f21f2fa644b41cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b12488c89581b997f21f2fa644b41cdd");
        } else {
            a(th, true);
        }
    }

    private static void a(Throwable th, boolean z) {
        Object[] objArr = {th, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b40d870c284a8abfa1c9d0168852698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b40d870c284a8abfa1c9d0168852698");
        } else if (th != null) {
            if (k.a()) {
                com.dianping.judas.util.a.a(th);
                if (z) {
                    throw new RuntimeException(th);
                }
                return;
            }
            c.a(th, 1, MetricsActivityLifecycleManager.currentActivity, false);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc8dad744cb8eccf35d8c701d2666e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc8dad744cb8eccf35d8c701d2666e5c");
        } else {
            a(new Exception(str));
        }
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f01dde1e2d9ff014ddda4dc069d3d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f01dde1e2d9ff014ddda4dc069d3d9");
        } else {
            a((Throwable) new Exception(str), false);
        }
    }
}
