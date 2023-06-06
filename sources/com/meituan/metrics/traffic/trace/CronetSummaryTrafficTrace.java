package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CronetSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public CronetSummaryTrafficTrace() {
        super(Constants.TRACE_CRONET);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "870c38ba4330e220433888c10cdc75b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "870c38ba4330e220433888c10cdc75b1");
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14ef201eaf92aee81aee22aa43d6894c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14ef201eaf92aee81aee22aa43d6894c");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals(TrafficRecord.Detail.TUNNEL_CRONET_METRICS, trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
