package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SharkSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public SharkSummaryTrafficTrace() {
        super(Constants.TRACE_SHARK);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0da63845ba80253c0be21bbfd7823563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0da63845ba80253c0be21bbfd7823563");
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26dc23f2b9eba2fbfc5717105aca2256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26dc23f2b9eba2fbfc5717105aca2256");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals(TrafficRecord.Detail.TUNNEL_SHARK, trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
