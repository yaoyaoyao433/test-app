package com.meituan.metrics.traffic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.StoreUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficSysManager implements AppBus.OnBackgroundListener {
    private static final String TAG = "TrafficSysManager";
    private static final long UPDATE_TRAFFIC_INTERVAL = 30000;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean isInit = false;
    private static volatile TrafficSysManager sInstance;
    private SystemTrafficProvider provider;
    private final CatchException sysException;
    private final Runnable updateTask;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ISysTrafficListener extends MetricsTrafficListener {
        void onSysTrafficChanged(BasicTrafficUnit basicTrafficUnit);
    }

    public TrafficSysManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6d0f2c1a02f3ff2f450469541d263ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6d0f2c1a02f3ff2f450469541d263ea");
            return;
        }
        this.sysException = new CatchException(TAG, 1, 300000L);
        this.updateTask = new Runnable() { // from class: com.meituan.metrics.traffic.TrafficSysManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "056f9af4b6e5c8bd362bed4750f6dd02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "056f9af4b6e5c8bd362bed4750f6dd02");
                } else {
                    TrafficSysManager.this.updateSystemTraffic();
                }
            }
        };
    }

    public static TrafficSysManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d67990770a875e2d6d46e948336a3e28", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrafficSysManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d67990770a875e2d6d46e948336a3e28");
        }
        if (sInstance == null) {
            synchronized (TrafficSysManager.class) {
                if (sInstance == null) {
                    sInstance = new TrafficSysManager();
                }
            }
        }
        return sInstance;
    }

    public void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "412bad48cf191ae4025bd9b2c0311356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "412bad48cf191ae4025bd9b2c0311356");
            return;
        }
        this.provider = SystemTrafficProviderFactory.create(context);
        isInit = true;
        AppBus.getInstance().register((AppBus.OnBackgroundListener) this, false);
        MetricsTrafficManager.TrafficHandler.scheduleAtFixedRate(this.updateTask, 8000L, 30000L, "updateSysTrafficRegularly");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSystemTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40b7f5f340c98284fb7d427b25a82210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40b7f5f340c98284fb7d427b25a82210");
        } else if (isInit) {
            BasicTrafficUnit basicTrafficUnit = new BasicTrafficUnit();
            this.provider.updateTotalTraffic(basicTrafficUnit);
            try {
                for (ISysTrafficListener iSysTrafficListener : TrafficListenerProxy.getInstance().getISysTrafficListeners()) {
                    iSysTrafficListener.onSysTrafficChanged(basicTrafficUnit);
                }
            } catch (Throwable th) {
                this.sysException.reportException(th);
            }
            ILogger metricsLogger = Logger.getMetricsLogger();
            metricsLogger.d(TAG, "SystemTraffic " + basicTrafficUnit.toString());
        }
    }

    public BasicTrafficUnit triggerUpdateTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8b059e04a5f516c7a910046a48e12df", RobustBitConfig.DEFAULT_VALUE)) {
            return (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8b059e04a5f516c7a910046a48e12df");
        }
        BasicTrafficUnit basicTrafficUnit = new BasicTrafficUnit();
        if (isInit) {
            this.provider.updateTotalTraffic(basicTrafficUnit);
        }
        return basicTrafficUnit;
    }

    public Pair<Long, Long> fetchSysTrafficForReport(String str, Map<String, Long> map, Context context) {
        Object[] objArr = {str, map, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f601fa1ae71d6aca787e4b4905e069ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f601fa1ae71d6aca787e4b4905e069ba");
        }
        String str2 = SystemTrafficProvider.CIPS_CH_SYS_TRAFFIC + str;
        q a = q.a(context, str2, 1);
        long b = a.b(Constants.KEY_TX, 0L);
        map.put(Constants.TRAFFIC_DAILY_TOTAL_UPSTREAM, Long.valueOf(b));
        long b2 = a.b(Constants.KEY_RX, 0L);
        map.put(Constants.TRAFFIC_DAILY_TOTAL_DOWNSTREAM, Long.valueOf(b2));
        map.put(Constants.TRAFFIC_FOREGROUND_TOTAL, Long.valueOf(a.b("foreground", 0L)));
        map.put(Constants.TRAFFIC_BACKGROUND_TOTAL, Long.valueOf(a.b("background", 0L)));
        map.put(Constants.TRAFFIC_WIFI_TOTAL, Long.valueOf(a.b("wifi", 0L)));
        map.put(Constants.TRAFFIC_MOBILE_TOTAL, Long.valueOf(a.b("mobile", 0L)));
        StoreUtils.removeCIPStorageObject(a, context, str2);
        return new Pair<>(Long.valueOf(b), Long.valueOf(b2));
    }

    public final BasicTrafficUnit getTodayIncreaseTraffic() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ce3cb93b6ae522e4f1e2a3724d02d5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BasicTrafficUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ce3cb93b6ae522e4f1e2a3724d02d5c");
        }
        if (!isInit) {
            return new BasicTrafficUnit();
        }
        return this.provider.getIncreaseTrafficUnit();
    }

    @Override // com.meituan.android.common.metricx.helpers.AppBus.OnBackgroundListener
    public void onBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe5082b39c85d10b5fd69f8a41629d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe5082b39c85d10b5fd69f8a41629d52");
        } else {
            MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.TrafficSysManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fab90afbd70eb1fae1503b2fac2bdc38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fab90afbd70eb1fae1503b2fac2bdc38");
                    } else {
                        TrafficSysManager.this.updateSystemTraffic();
                    }
                }
            }, "updateSysTrafficOnBackground");
        }
    }
}
