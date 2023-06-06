package com.sankuai.titans.adapter.base;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.titans.protocol.bean.AsyncTask;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ThreadPoolService implements IThreadPoolService {
    private static final String POOL_NAME = "knb";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile ExecutorService executorService;
    private volatile AtomicInteger incrementInteger;

    public ThreadPoolService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d31b0c96cd117055e6a6a945aa12df72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d31b0c96cd117055e6a6a945aa12df72");
        } else {
            this.incrementInteger = new AtomicInteger(1);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IThreadPoolService
    public boolean executeOnUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "434f6f82bbaf3973fe79f895d67f8ee5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "434f6f82bbaf3973fe79f895d67f8ee5")).booleanValue() : executeOnUIThread(runnable, 0L);
    }

    @Override // com.sankuai.titans.protocol.services.IThreadPoolService
    public boolean executeOnUIThread(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb2b36fe1f56eaf26ac43306102d0f27", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb2b36fe1f56eaf26ac43306102d0f27")).booleanValue() : new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }

    @Override // com.sankuai.titans.protocol.services.IThreadPoolService
    public void executeAsyncTask(String str, AsyncTask asyncTask) {
        Object[] objArr = {str, asyncTask};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f7771752e2146b0e0a69319d8e2ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f7771752e2146b0e0a69319d8e2ab0");
        } else {
            executeOnThreadPool(str, asyncTask);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IThreadPoolService
    public void executeOnThreadPool(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c611bc4523dd16c33413b1de93855aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c611bc4523dd16c33413b1de93855aaf");
        } else {
            executeOnThreadPool(str, 5, runnable);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IThreadPoolService
    public void executeOnThreadPool(String str, int i, Runnable runnable) {
        Object[] objArr = {str, Integer.valueOf(i), runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3202a7c5587594aabb2675e559dede96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3202a7c5587594aabb2675e559dede96");
        } else if (runnable == null) {
        } else {
            getExecutor().execute(new Task(str, i, runnable));
        }
    }

    private synchronized ExecutorService getExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50ddf44ce385c62b53959429cb56e232", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50ddf44ce385c62b53959429cb56e232");
        }
        if (this.executorService == null) {
            this.executorService = c.a("knb", 32, new ThreadFactory() { // from class: com.sankuai.titans.adapter.base.ThreadPoolService.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(@NonNull Runnable runnable) {
                    Thread a;
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d8abd7fc701cd244f29c4cf842b3bc39", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d8abd7fc701cd244f29c4cf842b3bc39");
                    }
                    int i = 5;
                    if (runnable instanceof Task) {
                        Task task = (Task) runnable;
                        a = c.a("knb#" + task.name, runnable);
                        if (task.priority <= 10 && task.priority > 0) {
                            i = task.priority;
                        }
                    } else {
                        a = c.a("knb#" + ThreadPoolService.this.incrementInteger.getAndIncrement(), runnable);
                    }
                    a.setPriority(i);
                    if (a.isDaemon()) {
                        a.setDaemon(false);
                    }
                    return a;
                }
            });
        }
        return this.executorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Task implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final String name;
        private final int priority;
        private final Runnable task;

        public Task(String str, int i, Runnable runnable) {
            Object[] objArr = {str, Integer.valueOf(i), runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b3ba0297713d14a9d61cff198f59459", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b3ba0297713d14a9d61cff198f59459");
                return;
            }
            this.name = str;
            this.priority = i;
            this.task = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c5ed2fa27e529a02cf67614a7dcdd08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c5ed2fa27e529a02cf67614a7dcdd08");
            } else {
                this.task.run();
            }
        }
    }
}
