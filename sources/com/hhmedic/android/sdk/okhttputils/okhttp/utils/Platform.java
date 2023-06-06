package com.hhmedic.android.sdk.okhttputils.okhttp.utils;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.sankuai.waimai.launcher.util.aop.b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Platform {
    private static final Platform PLATFORM = findPlatform();

    public static Platform get() {
        return PLATFORM;
    }

    private static Platform findPlatform() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new Android();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new Platform();
    }

    public Executor defaultCallbackExecutor() {
        return Executors.newCachedThreadPool();
    }

    public void execute(Runnable runnable) {
        b.a(defaultCallbackExecutor(), runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Android extends Platform {
        Android() {
        }

        @Override // com.hhmedic.android.sdk.okhttputils.okhttp.utils.Platform
        public Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        static class MainThreadExecutor implements Executor {
            private final Handler handler = new Handler(Looper.getMainLooper());

            MainThreadExecutor() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        }
    }
}
