package com.meituan.metrics.interceptor;

import com.meituan.metrics.model.AbstractEvent;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MetricsInterceptor {
    void onNewEvent(AbstractEvent abstractEvent);

    void onReportEvent(AbstractEvent abstractEvent);
}
