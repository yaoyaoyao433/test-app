package com.huawei.updatesdk.b.g;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static final ThreadPoolExecutor a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("UpdateSDK-ServerTask"));
    public static final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 2, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("UpdateSDK-CheckTask"));

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger();
        private String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.b + "#" + this.a.incrementAndGet());
        }
    }
}
