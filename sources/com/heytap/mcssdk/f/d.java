package com.heytap.mcssdk.f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class d {
    private static final ExecutorService a = Executors.newSingleThreadExecutor();
    private static Handler b = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.execute(runnable);
    }

    public static void b(Runnable runnable) {
        b.post(runnable);
    }
}
