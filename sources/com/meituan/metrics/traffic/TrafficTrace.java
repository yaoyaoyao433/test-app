package com.meituan.metrics.traffic;

import com.meituan.metrics.Trace;
import com.meituan.metrics.traffic.TrafficInterceptedManager;
import com.meituan.metrics.traffic.TrafficSysManager;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TrafficTrace extends Trace implements TrafficInterceptedManager.ITrafficInterceptedListener, TrafficSysManager.ISysTrafficListener, TrafficTraceHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.metrics.traffic.TrafficTraceHandler
    public void clearTraceStorage(String str) {
    }

    @Override // com.meituan.metrics.traffic.TrafficTraceHandler
    public Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher) {
        return "";
    }

    @Override // com.meituan.metrics.traffic.TrafficTraceHandler
    public void initTraceFromStorage() {
    }

    @Override // com.meituan.metrics.traffic.TrafficSysManager.ISysTrafficListener
    public void onSysTrafficChanged(BasicTrafficUnit basicTrafficUnit) {
    }

    @Override // com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
    }

    @Override // com.meituan.metrics.traffic.TrafficTraceHandler
    public void saveTraceToStorage() {
    }

    public TrafficTrace(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df13c11ee652848e5d2a0402339d6392", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df13c11ee652848e5d2a0402339d6392");
        }
    }
}
