package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface OnTrafficInterceptedListener extends MetricsTrafficListener {
    void onTrafficIntercepted(String str, long j, long j2, Map<String, List<String>> map, Map<String, List<String>> map2);
}
