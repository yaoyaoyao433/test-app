package com.meituan.android.common.metricx.config;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MetricXConfigManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static MetricXConfigBean metricXConfigBean;
    private static final MetricXConfigManager sInstance = new MetricXConfigManager();
    private final List<ConfigChangedListener> metricXConfigListeners;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ConfigChangedListener {
        void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean);
    }

    public MetricXConfigManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "788e6b44319922ff99d531c0649f68ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "788e6b44319922ff99d531c0649f68ae");
        } else {
            this.metricXConfigListeners = new CopyOnWriteArrayList();
        }
    }

    public static MetricXConfigManager getInstance() {
        return sInstance;
    }

    public void register(ConfigChangedListener configChangedListener) {
        Object[] objArr = {configChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dbc6f76b30b469499f6113d58613dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dbc6f76b30b469499f6113d58613dfd");
        } else {
            this.metricXConfigListeners.add(configChangedListener);
        }
    }

    public void unregister(ConfigChangedListener configChangedListener) {
        Object[] objArr = {configChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c9006d4ded82f0bd97a8a8280409d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c9006d4ded82f0bd97a8a8280409d3e");
        } else {
            this.metricXConfigListeners.remove(configChangedListener);
        }
    }

    public final List<ConfigChangedListener> getMetricXConfigListeners() {
        return this.metricXConfigListeners;
    }
}
