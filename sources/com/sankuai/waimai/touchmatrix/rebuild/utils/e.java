package com.sankuai.waimai.touchmatrix.rebuild.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final ScheduledExecutorService b = com.sankuai.android.jarvis.c.c("TMatrix");
    private static final Handler c = new Handler(Looper.getMainLooper());
    private static final ExecutorService d = com.sankuai.android.jarvis.c.a("TMatrix-log");

    public static ScheduledExecutorService a() {
        return b;
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f25166cf503c114f93ee6a3ff2c8af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f25166cf503c114f93ee6a3ff2c8af7");
        } else {
            c.post(runnable);
        }
    }

    public static ExecutorService b() {
        return d;
    }
}
