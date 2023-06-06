package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.TrafficInterceptedManager;
import com.meituan.metrics.traffic.TrafficSysManager;
import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficListenerProxy {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final TrafficListenerProxy sInstance = new TrafficListenerProxy();
    private final List<TrafficSysManager.ISysTrafficListener> mSysTrafficListeners;
    private final List<TrafficInterceptedManager.ITrafficInterceptedListener> mTrafficInterceptedListeners;
    private final List<MetricsNetworkInterceptor> networkInterceptors;
    private final List<OnTraceReportListener> onTraceReportListeners;
    private final List<OnTrafficInterceptedListener> onTrafficInterceptedListeners;
    private final List<OnTrafficReportListener> onTrafficReportListeners;

    public TrafficListenerProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ebc32191a207c8f9db36d7ea3e17084", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ebc32191a207c8f9db36d7ea3e17084");
            return;
        }
        this.onTrafficInterceptedListeners = new CopyOnWriteArrayList();
        this.onTrafficReportListeners = new CopyOnWriteArrayList();
        this.networkInterceptors = new CopyOnWriteArrayList();
        this.onTraceReportListeners = new CopyOnWriteArrayList();
        this.mTrafficInterceptedListeners = new CopyOnWriteArrayList();
        this.mSysTrafficListeners = new CopyOnWriteArrayList();
    }

    public static TrafficListenerProxy getInstance() {
        return sInstance;
    }

    public void register(MetricsTrafficListener metricsTrafficListener) {
        Object[] objArr = {metricsTrafficListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81128ce9ae47dc17f75df9c365f86977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81128ce9ae47dc17f75df9c365f86977");
            return;
        }
        if (metricsTrafficListener instanceof OnTrafficInterceptedListener) {
            this.onTrafficInterceptedListeners.add((OnTrafficInterceptedListener) metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof OnTrafficReportListener) {
            this.onTrafficReportListeners.add((OnTrafficReportListener) metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof MetricsNetworkInterceptor) {
            this.networkInterceptors.add((MetricsNetworkInterceptor) metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof OnTraceReportListener) {
            this.onTraceReportListeners.add((OnTraceReportListener) metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof TrafficInterceptedManager.ITrafficInterceptedListener) {
            this.mTrafficInterceptedListeners.add((TrafficInterceptedManager.ITrafficInterceptedListener) metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof TrafficSysManager.ISysTrafficListener) {
            this.mSysTrafficListeners.add((TrafficSysManager.ISysTrafficListener) metricsTrafficListener);
        }
    }

    public void unregister(MetricsTrafficListener metricsTrafficListener) {
        Object[] objArr = {metricsTrafficListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3792ce212b711ed5c6a7348fb818c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3792ce212b711ed5c6a7348fb818c7");
            return;
        }
        if (metricsTrafficListener instanceof OnTrafficInterceptedListener) {
            this.onTrafficInterceptedListeners.remove(metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof OnTrafficReportListener) {
            this.onTrafficReportListeners.remove(metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof MetricsNetworkInterceptor) {
            this.networkInterceptors.remove(metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof OnTraceReportListener) {
            this.onTraceReportListeners.remove(metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof TrafficInterceptedManager.ITrafficInterceptedListener) {
            this.mTrafficInterceptedListeners.remove(metricsTrafficListener);
        }
        if (metricsTrafficListener instanceof TrafficSysManager.ISysTrafficListener) {
            this.mSysTrafficListeners.remove(metricsTrafficListener);
        }
    }

    public final List<OnTrafficInterceptedListener> getTrafficInterceptedListeners() {
        return this.onTrafficInterceptedListeners;
    }

    public final List<OnTrafficReportListener> getTrafficReportListeners() {
        return this.onTrafficReportListeners;
    }

    public final List<MetricsNetworkInterceptor> getNetworkInterceptors() {
        return this.networkInterceptors;
    }

    public final List<OnTraceReportListener> getTraceReportListeners() {
        return this.onTraceReportListeners;
    }

    public final List<TrafficInterceptedManager.ITrafficInterceptedListener> getITrafficInterceptedListeners() {
        return this.mTrafficInterceptedListeners;
    }

    public final List<TrafficSysManager.ISysTrafficListener> getISysTrafficListeners() {
        return this.mSysTrafficListeners;
    }
}
