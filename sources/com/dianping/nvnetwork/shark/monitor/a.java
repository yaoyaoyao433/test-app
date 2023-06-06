package com.dianping.nvnetwork.shark.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private ScheduledExecutorService c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b99c6a5363cea5938f463a09485f10f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b99c6a5363cea5938f463a09485f10f");
        } else {
            this.c = com.sankuai.android.jarvis.c.b("dianping_nvnetwork_shark_net_quality_monitor", com.sankuai.android.jarvis.n.PRIORITY_LOW);
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de53023dc55782bf3ef6a6c6504043a4", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de53023dc55782bf3ef6a6c6504043a4");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final ScheduledFuture a(Runnable runnable, long j, TimeUnit timeUnit) {
        Object[] objArr = {runnable, new Long(j), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c101cb5fcfb598b9da0345fcaf6d5ff1", 6917529027641081856L) ? (ScheduledFuture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c101cb5fcfb598b9da0345fcaf6d5ff1") : this.c.schedule(runnable, j, timeUnit);
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63aeb9fa6db2462fb7a9acb41cac54ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63aeb9fa6db2462fb7a9acb41cac54ac");
        } else {
            this.c.execute(runnable);
        }
    }
}
