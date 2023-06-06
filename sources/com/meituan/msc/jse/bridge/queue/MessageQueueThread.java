package com.meituan.msc.jse.bridge.queue;

import android.os.Looper;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes3.dex */
public interface MessageQueueThread {
    @DoNotStrip
    void assertIsOnThread();

    @DoNotStrip
    void assertIsOnThread(String str);

    @DoNotStrip
    <T> Future<T> callOnQueue(Callable<T> callable);

    Looper getLooper();

    @DoNotStrip
    MessageQueueThreadPerfStats getPerfStats();

    @DoNotStrip
    boolean isOnThread();

    @DoNotStrip
    void quitSynchronous();

    void removeCallbacks(Runnable runnable);

    @DoNotStrip
    void removeCallbacksAndMessages(Object obj);

    @DoNotStrip
    void resetPerfStats();

    @DoNotStrip
    void runOnQueue(Runnable runnable);

    @DoNotStrip
    void runOnQueueDelay(Runnable runnable, long j);
}
