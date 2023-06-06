package com.meituan.metrics.util;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficScheduleRunnableDelegate extends ScheduleRunnableDelegate {
    private static final long SLOW_TASK_THRESHOLD_MS = 30000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Executor executor;
    private String name;

    public TrafficScheduleRunnableDelegate(Runnable runnable, String str) {
        super(runnable);
        Object[] objArr = {runnable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d66f9d9dc7741733c5d95ca793c245b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d66f9d9dc7741733c5d95ca793c245b");
            return;
        }
        this.executor = c.a("reportSlowTrafficTask");
        this.name = str;
    }

    @Override // com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate, java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c36e1e22d6a5ae2fc965b99983e0afd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c36e1e22d6a5ae2fc965b99983e0afd4");
            return;
        }
        long currentTimeMillis = TimeUtil.currentTimeMillis();
        super.run();
        long currentTimeMillis2 = TimeUtil.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 30000) {
            Babel.log(new Log.Builder(this.name).tag("slowTrafficTask").generalChannelStatus(true).value(currentTimeMillis2).build());
        }
    }
}
