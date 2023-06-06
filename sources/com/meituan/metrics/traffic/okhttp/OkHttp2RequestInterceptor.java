package com.meituan.metrics.traffic.okhttp;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.metrics.traffic.report.ReportDetailManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.m;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp2RequestInterceptor implements ReflectWrapper, t {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.squareup.okhttp.t
    public z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdabbb0c18145d09f2df2a43f20644fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdabbb0c18145d09f2df2a43f20644fd");
        }
        if (!ReportDetailManager.getInstance().isEnable()) {
            return aVar.a(aVar.a());
        }
        TrafficRecord.Detail detail = new TrafficRecord.Detail();
        detail.needReportTraffic = false;
        detail.networkTunnel = TrafficRecord.Detail.TUNNEL_OKHTTP2;
        detail.startTime = System.currentTimeMillis();
        Context context = ContextProvider.getInstance().getContext();
        if (context != null) {
            detail.requestNetworkType = NetWorkUtils.getNetWorkTypeForBabel(context);
        }
        x a = aVar.a();
        HttpConnectionTracker trackConnection = HttpTracker.trackConnection(a.a.toString(), MetricsTrafficManager.getInstance());
        trackConnection.trackRequest(a.b, toMultimap(a.c));
        trackConnection.reportRequestBody(a.d != null ? a.d.contentLength() : 0L);
        trackConnection.reportDetail(detail);
        try {
            z a2 = aVar.a(a);
            StringBuilder sb = new StringBuilder();
            sb.append(a2.b);
            detail.protocol = sb.toString();
            aa aaVar = a2.g;
            detail.endTime = System.currentTimeMillis();
            detail.elapsedTime = detail.endTime - detail.startTime;
            trackConnection.trackResponse(a2.c, a2.d, toMultimap(a2.f));
            z.a g = a2.g();
            g.g = aa.a(aaVar.a(), aaVar.b(), m.a(m.a(trackConnection.trackResponseBody(aaVar.d()))));
            return g.a();
        } catch (Exception e) {
            detail.endTime = System.currentTimeMillis();
            detail.elapsedTime = detail.endTime - detail.startTime;
            trackConnection.error(e);
            throw e;
        }
    }

    private Map<String, List<String>> toMultimap(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d31421ae8dafbd84995ca40adf36018", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d31421ae8dafbd84995ca40adf36018");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (rVar == null) {
            return linkedHashMap;
        }
        for (String str : rVar.b()) {
            linkedHashMap.put(str, rVar.c(str));
        }
        return linkedHashMap;
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "678452cb9bb144166201ea3b2d9d57d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "678452cb9bb144166201ea3b2d9d57d8");
        } else if (obj instanceof v) {
            ((v) obj).g.add(this);
        }
    }
}
