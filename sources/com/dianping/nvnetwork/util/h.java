package com.dianping.nvnetwork.util;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static final rx.g a;
    private static ThreadPoolExecutor b;

    static {
        ThreadPoolExecutor a2 = com.sankuai.android.jarvis.c.a("nv_scheduler_", 0, 20, 30L, TimeUnit.SECONDS, new SynchronousQueue());
        b = a2;
        a = rx.schedulers.a.a(a2);
    }
}
