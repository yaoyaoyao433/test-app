package com.meizu.cloud.pushsdk.b.c;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class b implements Executor {
    private final ThreadPoolExecutor a;

    /* loaded from: classes3.dex */
    static class a {
        private static b a = new b();
    }

    public static b a() {
        return a.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.a.execute(runnable);
    }

    private b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        c cVar = new c();
        cVar.a = 10;
        this.a = new ThreadPoolExecutor(1, 1, 10L, timeUnit, linkedBlockingQueue, c.a(cVar.a("message-pool-%d")));
        this.a.allowCoreThreadTimeOut(true);
    }
}
