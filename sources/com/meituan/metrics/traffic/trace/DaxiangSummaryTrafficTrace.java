package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DaxiangSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DaxiangSummaryTrafficTrace() {
        super(Constants.TRACE_DAXIANG);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f57b95e2818ce46a9cc8e3e5e899754", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f57b95e2818ce46a9cc8e3e5e899754");
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8415805d104ade37605d8c4d33958b79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8415805d104ade37605d8c4d33958b79");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals(TrafficRecord.Detail.TUNNEL_IM_SOCKET, trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
