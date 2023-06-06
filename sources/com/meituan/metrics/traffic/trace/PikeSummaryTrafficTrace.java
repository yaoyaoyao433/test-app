package com.meituan.metrics.traffic.trace;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PikeSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PikeSummaryTrafficTrace() {
        super(Constants.TRACE_PIKE);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20028c4b53381dcb0cdb298c16f2f8dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20028c4b53381dcb0cdb298c16f2f8dd");
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c80b6879963f19225b8baa671225745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c80b6879963f19225b8baa671225745");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals("pike", trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
