package com.meituan.android.common.aidata.feature.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TaskQueueExecter {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final int corePoolSize = 1;
    private static final int maximumPoolSize = 3;
    private static volatile TaskQueueExecter sInstance;
    private static final TimeUnit unit = TimeUnit.SECONDS;
    private static final ThreadFactory threadFactory = new DefaultTreadFactory();
    private static Lock mTaskQueueLock = new ReentrantLock();
    private static final long keepAliveTime = 10;
    private static final ExecutorService mTaskQueueThreadExecutor = c.a("aidata_threadpool-TaskQueue", 1, 3, keepAliveTime, unit, new ProduceFeatureTaskQueue(), threadFactory, new ThreadPoolExecutor.DiscardPolicy());

    public static TaskQueueExecter getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e17ad0630a139c501616ad08571516d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (TaskQueueExecter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e17ad0630a139c501616ad08571516d4");
        }
        if (sInstance == null) {
            synchronized (TaskQueueExecter.class) {
                if (sInstance == null) {
                    sInstance = new TaskQueueExecter();
                }
            }
        }
        return sInstance;
    }

    public void submitTask(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2875bdaaeb6f1f86ed3ddc89f4600821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2875bdaaeb6f1f86ed3ddc89f4600821");
            return;
        }
        try {
            try {
                mTaskQueueLock.lock();
                if (mTaskQueueThreadExecutor != null) {
                    mTaskQueueThreadExecutor.execute(runnable);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            mTaskQueueLock.unlock();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class DefaultTreadFactory implements ThreadFactory {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final AtomicInteger mThreadNum;

        public DefaultTreadFactory() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e42a4f24694aeae8846e4efa7f1d59c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e42a4f24694aeae8846e4efa7f1d59c");
            } else {
                this.mThreadNum = new AtomicInteger(1);
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21d1eb2819747b28ec29e55be854bb73", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21d1eb2819747b28ec29e55be854bb73");
            }
            return c.a("aidata_threadpool_taskqueue" + this.mThreadNum.getAndIncrement(), runnable);
        }
    }
}
