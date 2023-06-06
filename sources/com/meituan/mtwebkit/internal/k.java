package com.meituan.mtwebkit.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static ExecutorService b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static final k a = new k();
    }

    public k() {
        b = com.sankuai.android.jarvis.c.b("MTWebView-ThreadPool");
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e534c48a0d9ca8836e791bf7295dcff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e534c48a0d9ca8836e791bf7295dcff");
        } else {
            b.submit(runnable);
        }
    }
}
