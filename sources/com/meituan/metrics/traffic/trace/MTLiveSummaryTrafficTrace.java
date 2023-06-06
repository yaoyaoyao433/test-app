package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTLiveSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public MTLiveSummaryTrafficTrace() {
        super(Constants.TRACE_MTLIVE);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4b9b324483f5784b7555202c675eb3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4b9b324483f5784b7555202c675eb3a");
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c1c54ac31a869d2fa19f299d37b1fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c1c54ac31a869d2fa19f299d37b1fb0");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals(TrafficRecord.Detail.TUNNEL_MTLIVE, trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
