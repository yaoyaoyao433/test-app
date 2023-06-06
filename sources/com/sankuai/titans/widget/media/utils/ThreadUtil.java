package com.sankuai.titans.widget.media.utils;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ThreadUtil {
    private static final String THREAD_NAME_PREFIX = "titans-widget-thread";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ExecutorService executor;

    public ThreadUtil() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c714ae243d6ae82cd790d013c894d37c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c714ae243d6ae82cd790d013c894d37c");
        } else {
            this.executor = c.a(THREAD_NAME_PREFIX, 1, Runtime.getRuntime().availableProcessors() * 2, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.sankuai.titans.widget.media.utils.ThreadUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;
                private final AtomicInteger mCount = new AtomicInteger(1);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@NonNull Runnable runnable) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b7cd6eeb230e9a6e9338a5de6349c8e7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b7cd6eeb230e9a6e9338a5de6349c8e7");
                    }
                    Thread thread = new Thread(runnable, ThreadUtil.THREAD_NAME_PREFIX + this.mCount.getAndIncrement());
                    thread.setPriority(5);
                    return thread;
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class Singleton {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final ThreadUtil sInstance = new ThreadUtil();
    }

    public static ThreadUtil getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77c51b2d91a4ec7432849b3e6cd6983f", RobustBitConfig.DEFAULT_VALUE) ? (ThreadUtil) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77c51b2d91a4ec7432849b3e6cd6983f") : Singleton.sInstance;
    }

    public void executeOnIOThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2ec93efaf389cf63122a1e66b55f46f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2ec93efaf389cf63122a1e66b55f46f");
            return;
        }
        try {
            this.executor.execute(runnable);
        } catch (Throwable unused) {
        }
    }

    public void executeOnUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "536edc42c6df55aad71f110f4e6e9623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "536edc42c6df55aad71f110f4e6e9623");
        } else {
            executeOnUIThread(runnable, 0L);
        }
    }

    public void executeOnUIThread(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b038c8fe874bfd8ca95ed1cc2391be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b038c8fe874bfd8ca95ed1cc2391be");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
        }
    }
}
