package com.meituan.android.common.metricx.task;

import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.crashreporter.thread.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ThreadManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ThreadManager instance;
    private ScheduledExecutorService backgroundExecutor;
    private ScheduledFuture<?> future;
    private volatile boolean init;

    public ThreadManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce97080c2aa2e08ac50b6eabe549574", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce97080c2aa2e08ac50b6eabe549574");
        } else {
            this.init = false;
        }
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc066075919a91d94f985e39afbce0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc066075919a91d94f985e39afbce0ff");
        } else if (this.init) {
        } else {
            synchronized (this) {
                if (!this.init) {
                    this.backgroundExecutor = c.c("ThreadManager");
                    this.init = true;
                }
            }
        }
    }

    public static ThreadManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd303575513d899accc9cb5edc2ad97f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ThreadManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd303575513d899accc9cb5edc2ad97f");
        }
        if (instance == null) {
            synchronized (ThreadManager.class) {
                if (instance == null) {
                    instance = new ThreadManager();
                }
            }
        }
        if (!instance.init) {
            instance.init();
        }
        return instance;
    }

    public void postNet(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbe1a6cebc6fefe74997457b2f8248ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbe1a6cebc6fefe74997457b2f8248ce");
        } else if (!this.init || this.backgroundExecutor == null) {
        } else {
            this.future = this.backgroundExecutor.schedule(aVar, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public void postRunnable(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43d45f2c0dfa5e8400e9874b6c9ec68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43d45f2c0dfa5e8400e9874b6c9ec68b");
        } else if (!this.init || this.backgroundExecutor == null) {
        } else {
            this.future = this.backgroundExecutor.schedule(new ScheduleRunnableDelegate(runnable), 0L, TimeUnit.MILLISECONDS);
        }
    }

    public void postRunnableDelayed(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de827e18e3ee3be9a7e04672fe9b04a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de827e18e3ee3be9a7e04672fe9b04a8");
        } else if (!this.init || this.backgroundExecutor == null) {
        } else {
            this.future = this.backgroundExecutor.schedule(new ScheduleRunnableDelegate(runnable), j, TimeUnit.MILLISECONDS);
        }
    }

    public void scheduleAtFixedRate(a aVar, long j, long j2) {
        Object[] objArr = {aVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a18f1a260ae178daf1a3c34992681e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a18f1a260ae178daf1a3c34992681e87");
        } else if (!this.init || this.backgroundExecutor == null) {
        } else {
            this.future = this.backgroundExecutor.scheduleAtFixedRate(aVar, j, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "187059395d0a0f9d000caa5fae54a56c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "187059395d0a0f9d000caa5fae54a56c");
            return;
        }
        this.init = false;
        if (this.future != null) {
            this.future.cancel(true);
        }
    }

    public static void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37a3d2cab4e1ad4d79881f1db89d33dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37a3d2cab4e1ad4d79881f1db89d33dd");
            return;
        }
        if (instance != null) {
            instance.stop();
        }
        instance = null;
    }
}
