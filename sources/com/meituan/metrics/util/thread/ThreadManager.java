package com.meituan.metrics.util.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThreadManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ThreadManager instance;
    private Handler backgroundHandler;
    private HandlerThread handlerThread;
    private ExecutorService ioThreadPool;
    private boolean isPrepare;
    @NonNull
    private Handler mainHandler;
    private ExecutorService netThreadPool;
    private volatile boolean stopped;

    public ThreadManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9efcd10a4e1ade514e2c52fdb19da22e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9efcd10a4e1ade514e2c52fdb19da22e");
            return;
        }
        this.isPrepare = false;
        this.stopped = false;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    public void prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43df2bc98df72c205dc33b1eecc7d248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43df2bc98df72c205dc33b1eecc7d248");
            return;
        }
        checkBgThread();
        this.isPrepare = true;
    }

    private void checkBgThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f647c1d441478bc55ac307e0e5f4f608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f647c1d441478bc55ac307e0e5f4f608");
        } else if (this.handlerThread == null) {
            synchronized (this) {
                if (this.handlerThread == null) {
                    this.handlerThread = new HandlerThread("metrics-bg");
                    this.handlerThread.start();
                }
            }
        }
    }

    private void checkBgHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bba81ab08ab5bcf61c5b95b036cff239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bba81ab08ab5bcf61c5b95b036cff239");
            return;
        }
        checkBgThread();
        if (this.backgroundHandler == null) {
            synchronized (this) {
                if (this.backgroundHandler == null) {
                    this.backgroundHandler = new Handler(this.handlerThread.getLooper());
                }
            }
        }
    }

    private void checkIOThreadPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89c4f330033d17b87d9b3db55dfec2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89c4f330033d17b87d9b3db55dfec2c5");
        } else if (this.ioThreadPool == null) {
            synchronized (this) {
                if (this.ioThreadPool == null) {
                    this.ioThreadPool = c.b("metrics-ioThreadPool");
                }
            }
        }
    }

    private void checkNetThreadPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93f26549c5a6ad35fc1f9d4f67b271f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93f26549c5a6ad35fc1f9d4f67b271f4");
        } else if (this.netThreadPool == null) {
            synchronized (this) {
                if (this.netThreadPool == null) {
                    this.netThreadPool = c.b("metrics-netThreadPool");
                }
            }
        }
    }

    public static ThreadManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1b3a7c5fa3702920b1581fe3b3061f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1b3a7c5fa3702920b1581fe3b3061f9");
        }
        if (instance == null) {
            synchronized (ThreadManager.class) {
                if (instance == null) {
                    instance = new ThreadManager();
                }
            }
        }
        return instance;
    }

    public Looper getMetricsBgLooper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "891c110d79531bd8edfbbfab7a9c407b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Looper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "891c110d79531bd8edfbbfab7a9c407b");
        }
        if (!this.isPrepare) {
            prepare();
        }
        return this.handlerThread.getLooper();
    }

    public void post(Task task) {
        Object[] objArr = {task};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e7987eb52b57d6d6ee1f37599c26b5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e7987eb52b57d6d6ee1f37599c26b5e");
            return;
        }
        checkBgHandler();
        if (this.stopped) {
            return;
        }
        this.backgroundHandler.post(task);
    }

    public void postIO(Task task) {
        Object[] objArr = {task};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0206d2dc5163f4be90f7bb45a3dba506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0206d2dc5163f4be90f7bb45a3dba506");
            return;
        }
        checkIOThreadPool();
        if (this.ioThreadPool == null || this.ioThreadPool.isShutdown()) {
            return;
        }
        try {
            this.ioThreadPool.execute(task);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }

    public void postNet(Task task) {
        Object[] objArr = {task};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9259ea2be2898e82f05a37d2b8b5c0ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9259ea2be2898e82f05a37d2b8b5c0ea");
            return;
        }
        checkNetThreadPool();
        if (this.netThreadPool == null || this.netThreadPool.isShutdown()) {
            return;
        }
        try {
            this.netThreadPool.execute(task);
        } catch (InternalError e) {
            com.meituan.crashreporter.c.a(e, 1, Constants.CATCH_EXCEPTION_NAME, false);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public void scheduleAtFixedRate(final Task task, long j, final long j2) {
        Object[] objArr = {task, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b3f055333ae17f426da5472cdc4a8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b3f055333ae17f426da5472cdc4a8d1");
            return;
        }
        checkBgHandler();
        if (this.stopped || this.backgroundHandler == null) {
            return;
        }
        this.backgroundHandler.postDelayed(new Runnable() { // from class: com.meituan.metrics.util.thread.ThreadManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d2181880e8899ca04dcbb90b937b1610", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d2181880e8899ca04dcbb90b937b1610");
                    return;
                }
                task.run();
                ThreadManager.this.backgroundHandler.postDelayed(this, j2);
            }
        }, j);
    }

    public <T> T runOnUiThread(Callable<T> callable) {
        Object[] objArr = {callable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57c44e387358600617c4beab3f3904d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57c44e387358600617c4beab3f3904d6");
        }
        try {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return callable.call();
            }
            FutureTask futureTask = new FutureTask(callable);
            this.mainHandler.post(futureTask);
            return (T) futureTask.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Handler getBackgroundHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9021e4b22ed14e22376f8a4b1a3a18bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9021e4b22ed14e22376f8a4b1a3a18bc");
        }
        checkBgHandler();
        return this.backgroundHandler;
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3976f472b68c8c4f178283a4332c20e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3976f472b68c8c4f178283a4332c20e5");
            return;
        }
        this.handlerThread.quit();
        this.ioThreadPool.shutdown();
        this.netThreadPool.shutdown();
        this.stopped = true;
    }

    public static void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3642df044e4b898b5de4f254d590f991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3642df044e4b898b5de4f254d590f991");
            return;
        }
        if (instance != null) {
            instance.stop();
        }
        instance = null;
    }
}
