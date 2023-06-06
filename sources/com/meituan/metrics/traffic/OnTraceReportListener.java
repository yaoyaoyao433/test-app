package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface OnTraceReportListener extends MetricsTrafficListener {
    void onTraceReport(String str, String str2, long j, JSONObject jSONObject);
}
