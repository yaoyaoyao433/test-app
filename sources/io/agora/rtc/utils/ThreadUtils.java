package io.agora.rtc.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class ThreadUtils {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        boolean z = false;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static void joinUninterruptibly(final Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.rtc.utils.ThreadUtils.1
            @Override // io.agora.rtc.utils.ThreadUtils.BlockingOperation
            public final void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.rtc.utils.ThreadUtils.2
            @Override // io.agora.rtc.utils.ThreadUtils.BlockingOperation
            public final void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j2 = j;
        boolean z2 = false;
        while (true) {
            try {
                z = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                z2 = true;
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return z;
    }

    public static void waitUninterruptibly(final Object obj) {
        executeUninterruptibly(new BlockingOperation() { // from class: io.agora.rtc.utils.ThreadUtils.3
            @Override // io.agora.rtc.utils.ThreadUtils.BlockingOperation
            public final void run() throws InterruptedException {
                obj.wait();
            }
        });
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        final C1Result c1Result = new C1Result();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: io.agora.rtc.utils.ThreadUtils.4
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1Result.this.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.e != null) {
            RuntimeException runtimeException = new RuntimeException(c1CaughtException.e);
            runtimeException.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
        return c1Result.value;
    }

    /* compiled from: ProGuard */
    /* renamed from: io.agora.rtc.utils.ThreadUtils$1CaughtException  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1CaughtException {
        Exception e;

        C1CaughtException() {
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: io.agora.rtc.utils.ThreadUtils$1Result  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class C1Result {
        public V value;

        C1Result() {
        }
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: io.agora.rtc.utils.ThreadUtils.5
            @Override // java.util.concurrent.Callable
            public final Void call() {
                runnable.run();
                return null;
            }
        });
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }
}
