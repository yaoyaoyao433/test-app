package android.support.v4.content;

import com.sankuai.android.jarvis.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ConcurrentTask<Params, Progress, Result> extends ModernAsyncTask<Params, Progress, Result> {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE = 128;
    private Executor executor;
    private static final ThreadFactory sThreadFactory = new ThreadFactory() { // from class: android.support.v4.content.ConcurrentTask.1
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.mCount.getAndIncrement());
        }
    };
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new LinkedBlockingQueue(10);
    public static final Executor THREAD_POOL_EXECUTOR = c.a("ConcurrentTask", 5, 128, 1, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, new ConcurrentPolicy());
    public static final Executor SERIAL_EXECUTOR = c.a("ConcurrentTask");

    protected static void handleRejection(Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ConcurrentTask() {
        this(THREAD_POOL_EXECUTOR);
    }

    protected ConcurrentTask(Executor executor) {
        this.executor = executor;
    }

    public void exe(Params... paramsArr) {
        executeOnExecutor(this.executor, paramsArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ConcurrentPolicy implements RejectedExecutionHandler {
        private ConcurrentPolicy() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            ConcurrentTask.handleRejection(runnable);
        }
    }
}
