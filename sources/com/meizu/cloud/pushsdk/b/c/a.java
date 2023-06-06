package com.meizu.cloud.pushsdk.b.c;

import android.support.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class a implements Executor {
    private final ThreadPoolExecutor a;

    /* renamed from: com.meizu.cloud.pushsdk.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0524a {
        private static a a = new a();
    }

    public static a a() {
        return C0524a.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.a.execute(runnable);
    }

    private a() {
        this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), c.a(new c().a("io-pool-%d")));
    }
}
