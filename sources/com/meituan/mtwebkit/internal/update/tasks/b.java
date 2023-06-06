package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.mtwebkit.internal.task.a<ScheduledFuture<?>> {
    public static ChangeQuickRedirect a;
    private ScheduledExecutorService b;

    @Override // com.meituan.mtwebkit.internal.task.a
    public final /* synthetic */ ScheduledFuture<?> b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c84e43c8174bbf9124fb94c985507eb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c84e43c8174bbf9124fb94c985507eb2");
        }
        com.meituan.mtwebkit.internal.h.a(0);
        com.meituan.mtwebkit.internal.h.b(-1);
        final long currentTimeMillis = System.currentTimeMillis();
        this.b = com.sankuai.android.jarvis.c.c("MTWebView-CheckUpdateTimeMissed");
        return this.b.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.mtwebkit.internal.update.tasks.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42ae2d9a4a00939df75c19319b9b1753", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42ae2d9a4a00939df75c19319b9b1753");
                } else {
                    com.meituan.mtwebkit.internal.h.a(String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
        }, 0L, 1000L, TimeUnit.MILLISECONDS);
    }
}
