package com.huawei.hms.hatool;

import com.meituan.android.common.locate.loader.LocationStrategy;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class n0 {
    public static n0 b;
    public static n0 c;
    public ThreadPoolExecutor a = new ThreadPoolExecutor(0, 1, LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000));

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    y.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    static {
        new n0();
        new n0();
        b = new n0();
        c = new n0();
    }

    public static n0 a() {
        return c;
    }

    public static n0 b() {
        return b;
    }

    public void a(m0 m0Var) {
        try {
            this.a.execute(new a(m0Var));
        } catch (RejectedExecutionException unused) {
            y.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
