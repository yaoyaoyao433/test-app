package com.meituan.metrics;

import android.support.annotation.NonNull;
import com.meituan.metrics.interceptor.MetricsInterceptor;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsInterceptorChain implements MetricsInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<MetricsInterceptor> interceptors;

    public MetricsInterceptorChain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "090b3077e5a63696529bc3bf66669556", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "090b3077e5a63696529bc3bf66669556");
        } else {
            this.interceptors = new CopyOnWriteArrayList();
        }
    }

    public void addInterceptor(MetricsInterceptor metricsInterceptor) {
        Object[] objArr = {metricsInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76ce8d6fa7807b6edc0cb813733a0ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76ce8d6fa7807b6edc0cb813733a0ad0");
        } else {
            this.interceptors.add(metricsInterceptor);
        }
    }

    public void removeInterceptor(@NonNull MetricsInterceptor metricsInterceptor) {
        Object[] objArr = {metricsInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44816791d680ba9b4a2b3f160edaf933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44816791d680ba9b4a2b3f160edaf933");
        } else {
            this.interceptors.remove(metricsInterceptor);
        }
    }

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onNewEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011664b858e2e40524e5711077ab777a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011664b858e2e40524e5711077ab777a");
        } else if (this.interceptors != null && abstractEvent != null) {
            for (MetricsInterceptor metricsInterceptor : this.interceptors) {
                if (metricsInterceptor != null) {
                    metricsInterceptor.onNewEvent(abstractEvent);
                }
            }
        }
    }

    @Override // com.meituan.metrics.interceptor.MetricsInterceptor
    public void onReportEvent(AbstractEvent abstractEvent) {
        Object[] objArr = {abstractEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfbb296b137b5f71683593dd721cc44f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfbb296b137b5f71683593dd721cc44f");
        } else if (this.interceptors != null && abstractEvent != null) {
            for (MetricsInterceptor metricsInterceptor : this.interceptors) {
                if (metricsInterceptor != null) {
                    metricsInterceptor.onReportEvent(abstractEvent);
                }
            }
        }
    }
}
