package com.meituan.met.mercury.load.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final int c = Runtime.getRuntime().availableProcessors();
    private static final int d = Math.max(2, Math.min(c - 1, 4));
    public static final int b = Math.max(2, c + 1);
    private static final int e = (c * 2) + 1;

    public static ThreadPoolExecutor a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), 10L, timeUnit, blockingQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34d8b51017921be0b6a6708f94b7121f", RobustBitConfig.DEFAULT_VALUE) ? (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34d8b51017921be0b6a6708f94b7121f") : com.sankuai.android.jarvis.c.a(b(str), i, i2, 10L, timeUnit, blockingQueue);
    }

    public static ScheduledExecutorService a(String str, int i) {
        Object[] objArr = {str, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4286705f6867076b21d3470d26b3f0c", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4286705f6867076b21d3470d26b3f0c") : com.sankuai.android.jarvis.c.b(b(str), 2);
    }

    public static ThreadPoolExecutor a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae7c340ee90b76059da44f0103ba051c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadPoolExecutor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae7c340ee90b76059da44f0103ba051c");
        }
        String b2 = b(str);
        int i = d;
        return a(b2, i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4deeee9dfc98723a17042bc7531ea598", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4deeee9dfc98723a17042bc7531ea598");
        }
        if (TextUtils.isEmpty(str) || str.startsWith("DDD-")) {
            return str;
        }
        return "DDD-" + str;
    }
}
