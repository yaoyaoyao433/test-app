package com.meituan.metrics.traffic.trace;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.SoLoadUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.NativeTrafficTracker;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeHostDetailTrafficTrace extends DetailTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int TRACK_FROM_NATIVE;

    public NativeHostDetailTrafficTrace() {
        super(Constants.TRACE_NATIVE, "host");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd5c4a5d6f74c16294cec9ac2ec6999a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd5c4a5d6f74c16294cec9ac2ec6999a");
        } else {
            this.TRACK_FROM_NATIVE = 1;
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37cc94e5778556940ce75e9307490c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37cc94e5778556940ce75e9307490c39");
        } else if (isEnable() && trafficRecord.getDetail() != null && TextUtils.equals(trafficRecord.getDetail().networkTunnel, TrafficRecord.Detail.TUNNEL_NATIVE_HOOK)) {
            super.updateNewTraffic(trafficRecord.getUrl(), trafficRecord);
        }
    }

    @Override // com.meituan.metrics.traffic.trace.DetailTrafficTrace, com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
    public void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
        boolean z = true;
        Object[] objArr = {metricXConfigBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ec78372adadf2d3a44bf458c559a11c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ec78372adadf2d3a44bf458c559a11c");
            return;
        }
        super.onConfigChanged(metricXConfigBean);
        if ((Metrics.getInstance().getAppConfig().isTrafficNativeHookEnable() && metricXConfigBean.track_mode == this.TRACK_FROM_NATIVE) ? false : false) {
            SoLoadUtils.loadLibrary("metrics_traffic", new SoLoadUtils.LibLoadCallback() { // from class: com.meituan.metrics.traffic.trace.NativeHostDetailTrafficTrace.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public void onLoadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ff02df6ea7765fd6c29d4a28e17f5a48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ff02df6ea7765fd6c29d4a28e17f5a48");
                        return;
                    }
                    NativeTrafficTracker.getInstance().init();
                    Logger.getMetricsLogger().d("metrics_traffic load success");
                }

                @Override // com.meituan.android.common.metricx.utils.SoLoadUtils.LibLoadCallback
                public void onLoadFail(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "420aab71fd7b89f8af0a7a2719062131", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "420aab71fd7b89f8af0a7a2719062131");
                    } else {
                        Logger.getMetricsLogger().d("metrics_traffic load fail.", str);
                    }
                }
            });
        }
    }
}
