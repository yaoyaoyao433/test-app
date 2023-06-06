package com.meituan.metrics.traffic.shark;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.dianping.nvnetwork.shark.monitor.h;
import com.facebook.react.bridge.BaseJavaModule;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.functions.b;
import rx.functions.g;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class SharkRxInterceptor implements r, ReflectWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.nvnetwork.r
    public d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d3413550cf548bf7427f3f98f0e5f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d3413550cf548bf7427f3f98f0e5f3");
        }
        final TrafficRecord.Detail detail = new TrafficRecord.Detail();
        detail.startTime = System.currentTimeMillis();
        detail.networkTunnel = TrafficRecord.Detail.TUNNEL_SHARK;
        Context context = ContextProvider.getInstance().getContext();
        if (context != null) {
            detail.requestNetworkType = NetWorkUtils.getNetWorkTypeForBabel(context);
        }
        final Request a = aVar.a();
        HashMap<String, String> hashMap = a.g;
        if (hashMap != null && hashMap.containsKey("switch_tunnel")) {
            detail.switchTunnel = hashMap.get("switch_tunnel");
            hashMap.remove("switch_tunnel");
        }
        final HttpConnectionTracker trackConnection = HttpTracker.trackConnection(a.d, MetricsTrafficManager.getInstance());
        trackConnection.trackRequest(a.f, toMultiMap(a.g));
        trackConnection.reportDetail(detail);
        InputStream inputStream = a.i;
        if (inputStream != null) {
            try {
                if (inputStream.available() > 0) {
                    trackConnection.reportRequestBody(inputStream.available());
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    copy(inputStream, byteArrayOutputStream);
                    trackConnection.reportRequestBody(byteArrayOutputStream.size());
                    a = a.a().input((InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).build();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return aVar.a(a).d(new g<q, q>() { // from class: com.meituan.metrics.traffic.shark.SharkRxInterceptor.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public q call(q qVar) {
                Object[] objArr2 = {qVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "149632ad00811fa1ed274f94a9df873c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "149632ad00811fa1ed274f94a9df873c");
                }
                SharkRxInterceptor.this.trackMetrics(a, qVar, null, detail);
                trackConnection.trackResponse(qVar.statusCode(), "", SharkRxInterceptor.this.toMultiMap(qVar.headers()));
                trackConnection.reportResponseBody(qVar.result() != null ? qVar.result().length : 0L);
                return qVar;
            }
        }).a(new b<Throwable>() { // from class: com.meituan.metrics.traffic.shark.SharkRxInterceptor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public void call(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bc77e387838e8f4578e7437b100f9178", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bc77e387838e8f4578e7437b100f9178");
                    return;
                }
                SharkRxInterceptor.this.trackMetrics(a, null, th, detail);
                trackConnection.error(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackMetrics(Request request, q qVar, Throwable th, TrafficRecord.Detail detail) {
        boolean z = false;
        Object[] objArr = {request, qVar, th, detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1d3657394610c1885f5f998939335e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1d3657394610c1885f5f998939335e8");
            return;
        }
        detail.endTime = System.currentTimeMillis();
        detail.elapsedTime = detail.endTime - detail.startTime;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        detail.extra.put(NetLogConstants.Details.SHARK_EXTRA, linkedHashMap);
        if (request != null) {
            linkedHashMap.put(NetLogConstants.Tags.REQ_ID, request.b());
            linkedHashMap.put("timeout", Integer.valueOf(request.h));
            linkedHashMap.put("failOver", Boolean.valueOf(request.m));
            linkedHashMap.put(BaseJavaModule.METHOD_TYPE_SYNC, Boolean.valueOf(request.r));
        }
        if (qVar != null) {
            linkedHashMap.put("source", qVar.b());
            linkedHashMap.put("tunnel", qVar.c());
            linkedHashMap.put("score", qVar.k);
            if (qVar.error() != null) {
                linkedHashMap.put("error", qVar.error());
            }
            boolean z2 = qVar.b == 1 && qVar.c == 2;
            z = (qVar.b == 1 || qVar.b == 8) ? true : true;
            detail.tunnelType = qVar.b;
            detail.cached = qVar.f;
            if (!TextUtils.isEmpty(qVar.d)) {
                detail.connectIp = new InetSocketAddress(qVar.d, z ? 443 : 80);
            }
            if (z2) {
                detail.protocol = TrafficRecord.Detail.TUNNEL_SHARK;
                detail.tlsVersion = "TLSv1.2";
            }
            if (qVar.headers() != null) {
                detail.networkLibInfo = qVar.headers().remove("network_lib");
                detail.tunnelSource = qVar.headers().remove(NetLogConstants.Tags.TUNNEL_SOURCE);
                detail.url = qVar.headers().remove("nt_url");
                processTimeFromResponseHeader(detail, qVar.headers());
            }
        }
        if (th != null) {
            detail.exception = th;
        }
        if (h.a().c > 0) {
            linkedHashMap.put("netStatus", Integer.valueOf(h.a().b.g));
            linkedHashMap.put("netStatusUptTime", Long.valueOf(h.a().c));
            linkedHashMap.put("httpRtt", Double.valueOf(h.a().c()));
            linkedHashMap.put("tcpRtt", Double.valueOf(h.a().b()));
            linkedHashMap.put("throughPut", Double.valueOf(h.a().d()));
        }
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f44a470e2eace8130b7263af88553b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f44a470e2eace8130b7263af88553b06");
            return;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, List<String>> toMultiMap(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "810cd82121814f1361b5f8e87687880c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "810cd82121814f1361b5f8e87687880c");
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            hashMap.put(str, Collections.singletonList(map.get(str)));
        }
        return hashMap;
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3336055c5a752c048330fbc921e9ef30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3336055c5a752c048330fbc921e9ef30");
        } else if (obj instanceof NVDefaultNetworkService.a) {
            ((NVDefaultNetworkService.a) obj).a(this);
            new SharkPrivacyInterceptor().onWrapper(obj);
        }
    }

    public void processTimeFromResponseHeader(TrafficRecord.Detail detail, HashMap<String, String> hashMap) {
        Object[] objArr = {detail, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ff20bfe7dbf757b5079500b0a74a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ff20bfe7dbf757b5079500b0a74a10");
        } else if (detail.networkLibInfo == null || !detail.networkLibInfo.startsWith("mt-common-net")) {
        } else {
            detail.netLibPostStart = NumberUtils.parseLong(hashMap.get("nt_request_time"), -1L);
            long parseLong = NumberUtils.parseLong(hashMap.get("nt_repsonse_elapsetime"), -1L);
            if (detail.netLibPostStart <= 0 || parseLong <= 0) {
                return;
            }
            detail.netLibPostEnd = detail.netLibPostStart + parseLong;
        }
    }
}
