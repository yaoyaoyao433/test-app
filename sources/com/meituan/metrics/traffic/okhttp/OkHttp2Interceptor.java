package com.meituan.metrics.traffic.okhttp;

import android.support.annotation.Keep;
import com.meituan.metrics.traffic.HttpConnectionTracker;
import com.meituan.metrics.traffic.HttpTracker;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
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
public class OkHttp2Interceptor implements ReflectWrapper, t {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.squareup.okhttp.t
    public z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6dcf30b7751aa8e06f58f3201bebd9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6dcf30b7751aa8e06f58f3201bebd9e");
        }
        x a = aVar.a();
        HttpConnectionTracker trackConnection = HttpTracker.trackConnection(a.a.toString(), MetricsTrafficManager.getInstance());
        trackConnection.trackRequest(a.b, toMultimap(a.c));
        trackConnection.reportRequestBody(a.d != null ? a.d.contentLength() : 0L);
        z a2 = aVar.a(a);
        aa aaVar = a2.g;
        trackConnection.trackResponse(a2.c, a2.d, toMultimap(a2.f));
        z.a g = a2.g();
        g.g = aa.a(aaVar.a(), aaVar.b(), m.a(m.a(trackConnection.trackResponseBody(aaVar.d()))));
        return g.a();
    }

    private Map<String, List<String>> toMultimap(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed7ea2ac5826f404f24c809ef717762c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed7ea2ac5826f404f24c809ef717762c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dce656481120d94497073f5121e4afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dce656481120d94497073f5121e4afa");
        } else if (obj instanceof v) {
            ((v) obj).h.add(this);
            new OkHttp2RequestInterceptor().onWrapper(obj);
            new OkHttp2PrivacyInterceptor().onWrapper(obj);
        }
    }
}
