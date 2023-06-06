package com.sankuai.meituan.mapfoundation.threadcenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Thread a(Runnable runnable, String str) {
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "402431c2109fd2c0c526d4d6f39f8e91", RobustBitConfig.DEFAULT_VALUE) ? (Thread) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "402431c2109fd2c0c526d4d6f39f8e91") : c.a(str, runnable);
    }

    public static Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f92d0c5b9c5c76a14b61319272869a70", RobustBitConfig.DEFAULT_VALUE) ? (Executor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f92d0c5b9c5c76a14b61319272869a70") : c.b();
    }
}
