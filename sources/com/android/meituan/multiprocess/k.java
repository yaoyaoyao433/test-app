package com.android.meituan.multiprocess;

import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class k {
    private static ExecutorService a;

    private static ExecutorService a() {
        if (a == null) {
            synchronized (k.class) {
                if (a == null) {
                    a = com.sankuai.android.jarvis.c.b("IPC-InvokerThread", 3);
                }
            }
        }
        return a;
    }

    public static void a(Runnable runnable) {
        ExecutorService a2 = a();
        if (a2 != null) {
            a2.execute(runnable);
        }
    }
}
