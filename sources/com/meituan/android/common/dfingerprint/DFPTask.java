package com.meituan.android.common.dfingerprint;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DFPTask {
    private static final int KEEP_ALIVE_SECONDS = 30;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile ScheduledExecutorService sMtgScheduleThreadPool = c.b("mtg-schedule-tasks", 4);
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = Math.max(2, Math.min(CPU_COUNT - 1, 4));
    private static final int MAXIMUM_POOL_SIZE = (CPU_COUNT * 2) + 1;
    private static final Executor THREAD_POOL_EXECUTOR = c.a("mtg-tasks", CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static Executor obtainExecutor() {
        return THREAD_POOL_EXECUTOR;
    }
}
