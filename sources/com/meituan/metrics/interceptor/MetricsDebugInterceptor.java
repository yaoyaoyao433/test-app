package com.meituan.metrics.interceptor;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsDebugInterceptor implements MetricsInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onNewEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "017e2ed50fe4e7ad5ea220a05f3aa95a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "017e2ed50fe4e7ad5ea220a05f3aa95a");
        } else {
            Logger.getMetricsLogger().i("Metrics.NewEvent", abstractEvent);
        }
    }

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onReportEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11d1180cbcbca5de8be5e63c60e4b82a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11d1180cbcbca5de8be5e63c60e4b82a");
        } else {
            Logger.getMetricsLogger().i("Metrics.ReportEvent", abstractEvent);
        }
    }
}
