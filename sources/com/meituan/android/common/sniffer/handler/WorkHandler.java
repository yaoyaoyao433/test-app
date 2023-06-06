package com.meituan.android.common.sniffer.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.android.jarvis.f;
import com.sankuai.android.jarvis.n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WorkHandler {
    private static final ThreadFactory sThreadFactory = new ThreadFactory() { // from class: com.meituan.android.common.sniffer.handler.WorkHandler.1
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Sniffer Runnable #" + this.mCount.getAndIncrement());
        }
    };
    private ExecutorService threadPool;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Sub {
        public static WorkHandler handler = new WorkHandler();

        private Sub() {
        }
    }

    public static WorkHandler instance() {
        return Sub.handler;
    }

    private WorkHandler() {
        ThreadFactory threadFactory = sThreadFactory;
        Object[] objArr = {"Sniffer-WorkHandler", threadFactory};
        ChangeQuickRedirect changeQuickRedirect = c.a;
        this.threadPool = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7533d41e663bcdb4d849202b0ab6054", RobustBitConfig.DEFAULT_VALUE) ? (ExecutorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7533d41e663bcdb4d849202b0ab6054") : f.a().a("Sniffer-WorkHandler", threadFactory, (n) null);
    }

    public void post(Runnable runnable) {
        try {
            this.threadPool.execute(runnable);
        } catch (Exception unused) {
        }
    }
}
