package com.meituan.android.common.aidata.ai.bundle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiExecutor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final Executor DOWNLOAD_EXECUTOR;
    private static final int KEEP_ALIVE_SECONDS = 30;
    private static final int MAXIMUM_POOL_SIZE;
    public static final Executor RENDER_EXECUTOR;
    public static final Executor SERIAL_EXECUTOR;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final BlockingQueue<Runnable> sPoolWorkQueue;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors == 1 ? CPU_COUNT : Math.max(2, Math.min(CPU_COUNT - 1, 4));
        MAXIMUM_POOL_SIZE = (CPU_COUNT * 2) + 1;
        sPoolWorkQueue = new LinkedBlockingQueue(128);
        SERIAL_EXECUTOR = new SerialExecutor();
        RENDER_EXECUTOR = c.a("RENDER_EXECUTOR", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue);
        DOWNLOAD_EXECUTOR = c.a("DOWNLOAD_EXECUTOR", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30L, TimeUnit.SECONDS, sPoolWorkQueue);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class SerialExecutor implements Executor {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Runnable mActive;
        public final ArrayDeque<Runnable> mTasks;

        public SerialExecutor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2301087e57d0b8eae316f019eaa539ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2301087e57d0b8eae316f019eaa539ae");
            } else {
                this.mTasks = new ArrayDeque<>();
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ed101591f76ad13db80ee48551f2623", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ed101591f76ad13db80ee48551f2623");
                return;
            }
            this.mTasks.offer(new Runnable() { // from class: com.meituan.android.common.aidata.ai.bundle.AiExecutor.SerialExecutor.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2859dbfa09b9b3c7222ba4a9f546d171", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2859dbfa09b9b3c7222ba4a9f546d171");
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }

        public synchronized void scheduleNext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdbdd580d706dd47324412a6ee114dd2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdbdd580d706dd47324412a6ee114dd2");
                return;
            }
            Runnable poll = this.mTasks.poll();
            this.mActive = poll;
            if (poll != null) {
                AiExecutor.RENDER_EXECUTOR.execute(this.mActive);
            }
        }
    }
}
