package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URI;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class URIDetailTrafficTrace extends DetailTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public URIDetailTrafficTrace() {
        super(Constants.TRACE_URI, Constants.TRAFFIC_URI);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78786edcace36d33075bc6656f88699b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78786edcace36d33075bc6656f88699b");
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "547a7ba16a3248b057a27b73c68fe41b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "547a7ba16a3248b057a27b73c68fe41b");
        } else if (isEnable() && i == 1000) {
            if (!TextUtils.isEmpty(trafficRecord.getUrl())) {
                try {
                    URI uri = new URI(trafficRecord.getUrl());
                    super.updateNewTraffic(uri.getScheme() + "://" + uri.getHost() + uri.getPath(), trafficRecord);
                    return;
                } catch (Throwable th) {
                    Logger.getMetricxLogger().e(getName(), th);
                    return;
                }
            }
            String key = trafficRecord.getKey();
            if (TextUtils.isEmpty(key)) {
                return;
            }
            super.updateNewTraffic(key, trafficRecord);
        }
    }
}
