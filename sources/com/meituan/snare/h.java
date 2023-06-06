package com.meituan.snare;

import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final h b = new h();
    private final ScheduledExecutorService c;
    private final ConcurrentHashMap<a, ScheduledFuture<?>> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a();
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a66a6a33adc026135e7227f3d0846f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a66a6a33adc026135e7227f3d0846f9");
            return;
        }
        this.c = com.sankuai.android.jarvis.c.c("snare_loop_task");
        this.d = new ConcurrentHashMap<>(16);
    }

    public static h a() {
        return b;
    }

    public final void a(final long j, final a aVar) {
        Object[] objArr = {new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a502c486787a10b19e2eb95a4ff02b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a502c486787a10b19e2eb95a4ff02b1");
        } else {
            this.d.put(aVar, this.c.schedule(new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.snare.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96f96ec1470bad300378d90470972772", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96f96ec1470bad300378d90470972772");
                    } else if (aVar.a()) {
                        h.this.d.put(aVar, h.this.c.schedule(new ScheduleRunnableDelegate(this), j, TimeUnit.MILLISECONDS));
                    } else {
                        h.this.a(aVar);
                    }
                }
            }), 0L, TimeUnit.MILLISECONDS));
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48cf62bcc60a8b14e09835b691357cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48cf62bcc60a8b14e09835b691357cf");
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.d.get(aVar);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.d.remove(aVar);
    }
}
