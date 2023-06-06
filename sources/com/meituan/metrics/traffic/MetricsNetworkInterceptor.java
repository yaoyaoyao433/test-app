package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsNetworkInterceptor extends MetricsTrafficListener {
    void onNetworkTraffic(TrafficRecord trafficRecord);
}
