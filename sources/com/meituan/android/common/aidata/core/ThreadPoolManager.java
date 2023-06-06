package com.meituan.android.common.aidata.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ThreadPoolManager {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final int corePoolSize = 1;
    private static final int maximumPoolSize = 1;
    private static final TimeUnit unit = TimeUnit.SECONDS;
    private static final ThreadFactory threadFactory = new DefaultTreadFactory();
    private static Lock mProcessLock = new ReentrantLock();
    private static Lock mDispatchLock = new ReentrantLock();
    private static Lock mCepTaskLock = new ReentrantLock();
    public static final String TREAD_POOL_NAME = "aidata_threadpool";
    private static final long keepAliveTime = 10;
    private static final ExecutorService mCommitThreadExecutor = c.a(TREAD_POOL_NAME, 1, 1, keepAliveTime, unit, new LinkedBlockingQueue(), threadFactory, new ThreadPoolExecutor.AbortPolicy());
    private static final ExecutorService mDispatchThreadExecutor = c.a("aidata_threadpool_DispatchData");
    private static final ExecutorService mCepProcessThreadExecutor = c.a("aidata_threadpool_CepProcesser");

    public static synchronized void commit(Runnable runnable) {
        synchronized (ThreadPoolManager.class) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73754152351f35691c55f779626f2329", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73754152351f35691c55f779626f2329");
                return;
            }
            try {
                mProcessLock.lock();
                if (mCommitThreadExecutor != null) {
                    mCommitThreadExecutor.execute(runnable);
                }
                mProcessLock.unlock();
            } catch (Exception e) {
                e.printStackTrace();
                mProcessLock.unlock();
            }
        }
    }

    public static void dispatch(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b48a2d191a28f0caf45c4978ad1c3566", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b48a2d191a28f0caf45c4978ad1c3566");
                return;
            }
            try {
                mDispatchLock.lock();
                if (mDispatchThreadExecutor != null) {
                    mDispatchThreadExecutor.execute(runnable);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            mDispatchLock.unlock();
        }
    }

    public static void commitCepTask(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edde9dca4215a5d697524ff25a57f175", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edde9dca4215a5d697524ff25a57f175");
                return;
            }
            try {
                mCepTaskLock.lock();
                if (mCepProcessThreadExecutor != null) {
                    mCepProcessThreadExecutor.execute(runnable);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            mCepTaskLock.unlock();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e3137da4546bf37d9aa6e415b695bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e3137da4546bf37d9aa6e415b695bd");
            } else {
                this.mThreadNum = new AtomicInteger(1);
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "045e87b781023cf0015870e357d59ea6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "045e87b781023cf0015870e357d59ea6");
            }
            return c.a("aidata_threadpool-processthread-" + this.mThreadNum.getAndIncrement(), runnable);
        }
    }
}
