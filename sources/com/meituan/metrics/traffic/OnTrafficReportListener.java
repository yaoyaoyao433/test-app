package com.meituan.metrics.traffic;

import com.meituan.metrics.traffic.trace.MetricsTrafficListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface OnTrafficReportListener extends MetricsTrafficListener {
    void onTrafficReport(long j, String str);
}
