package com.meituan.metrics.traffic;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeTrafficTracker implements AppBus.OnBackgroundListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile NativeTrafficTracker sInstance;
    private ScheduleRunnableDelegate collectTask;
    private volatile boolean debug;
    private ScheduledExecutorService executorService;
    private ScheduledFuture<?> future;
    private volatile boolean isInit;

    private native void setDebugInner(boolean z);

    public native TrafficRecord[] collectTraffic();

    public NativeTrafficTracker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b55bdefcf8c4051f346a821ff7586e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b55bdefcf8c4051f346a821ff7586e5");
            return;
        }
        this.isInit = false;
        this.debug = false;
        this.executorService = c.c("native-traffic");
        this.collectTask = new ScheduleRunnableDelegate(new Runnable() { // from class: com.meituan.metrics.traffic.NativeTrafficTracker.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eb2a2ab9d83a7956eb2e5f0f34e77e80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eb2a2ab9d83a7956eb2e5f0f34e77e80");
                    return;
                }
                try {
                    NativeTrafficTracker.this.doCollect();
                    NativeTrafficTracker.this.future = NativeTrafficTracker.this.executorService.schedule(this, 1000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    Babel.log(new Log.Builder("").value(-1L).tag("native_traffic").generalChannelStatus(true).details(th.getLocalizedMessage()).build());
                }
            }
        });
    }

    public static NativeTrafficTracker getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6232d2116cbed301737b330e93cb3b5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeTrafficTracker) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6232d2116cbed301737b330e93cb3b5d");
        }
        if (sInstance == null) {
            synchronized (NativeTrafficTracker.class) {
                if (sInstance == null) {
                    sInstance = new NativeTrafficTracker();
                }
            }
        }
        return sInstance;
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3972886db6ee2e6305a994f151a8cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3972886db6ee2e6305a994f151a8cde");
        } else if (this.isInit) {
        } else {
            try {
                AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
                this.isInit = true;
                setDebugInner(this.debug);
                this.executorService.execute(this.collectTask);
                Babel.log(new Log.Builder("").value(1L).tag("native_traffic").generalChannelStatus(true).build());
            } catch (Throwable th) {
                Babel.log(new Log.Builder("").value(-1L).tag("native_traffic").generalChannelStatus(true).details(th.getLocalizedMessage()).build());
                Logger.getMetricsLogger().e(th.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "576ffa38814a7f829dd91b921f4792bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "576ffa38814a7f829dd91b921f4792bf");
            return;
        }
        TrafficRecord[] collectTraffic = collectTraffic();
        if (collectTraffic == null || collectTraffic.length == 0) {
            return;
        }
        for (TrafficRecord trafficRecord : collectTraffic) {
            TrafficRecord.Detail detail = new TrafficRecord.Detail();
            detail.networkTunnel = TrafficRecord.Detail.TUNNEL_NATIVE_HOOK;
            trafficRecord.type = 6;
            trafficRecord.setDetail(detail);
            MetricsTrafficManager.getInstance().onNativeNewTraffic(trafficRecord);
        }
    }

    public void setDebug(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e4f40255a7bf5289f60aa790a970f66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e4f40255a7bf5289f60aa790a970f66");
            return;
        }
        this.debug = z;
        if (this.isInit) {
            setDebugInner(z);
        }
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fe3d00558e42bcc4141fee7cc9728d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fe3d00558e42bcc4141fee7cc9728d8");
        } else if (this.isInit) {
            if (this.future != null) {
                this.future.cancel(false);
            }
            this.executorService.execute(this.collectTask);
        }
    }
}
